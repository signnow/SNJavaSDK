/*
 * This file is a part of signNow SDK API client.
 *
 * (с) Copyright © 2011-present airSlate Inc. (https://www.signnow.com)
 *
 * For more details on copyright, see LICENSE.md file
 * that was distributed with this source code.
 */

package com.signnow.core;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.signnow.core.config.ConfigRepository;
import com.signnow.core.exception.SignNowApiException;
import com.signnow.core.request.ApiEndpoint;
import com.signnow.core.request.ApiEndpointResolver;
import com.signnow.core.request.RequestInterface;
import com.signnow.core.response.Reply;
import com.signnow.core.response.ResponseParser;
import com.signnow.core.token.BasicToken;
import com.signnow.core.token.BearerToken;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.Locale;
import java.util.Map;
import okhttp3.*;
import okio.Buffer;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * This class is responsible for sending API requests to the signNow server.
 */
public class ApiClient {

  /** HTTP client to send API requests. */
  private final OkHttpClient client;

  /** Retrieves the ApiEndpoint data object from annotated request object. */
  private final ApiEndpointResolver apiEndpointResolver;

  /** signNow SDK configuration. */
  private final ConfigRepository configRepository;

  /** Authorization Basic token to retrieve Bearer token. */
  private final BasicToken basicToken;

  /** Authorization Bearer token for API requests. */
  private BearerToken bearerToken;

  /**
   * Constructs an ApiClient with the provided parameters.
   *
   * @param client the HTTP client to send API requests
   * @param apiEndpointResolver the resolver to retrieve the ApiEndpoint data object from annotated request object
   * @param configRepository the signNow SDK configuration
   * @param basicToken the Authorization Basic token to retrieve Bearer token
   * @param bearerToken the Authorization Bearer token for API requests
   */
  public ApiClient(
      OkHttpClient client,
      ApiEndpointResolver apiEndpointResolver,
      ConfigRepository configRepository,
      BasicToken basicToken,
      BearerToken bearerToken) {
    this.client = client;
    this.apiEndpointResolver = apiEndpointResolver;
    this.configRepository = configRepository;
    this.basicToken = basicToken;
    this.bearerToken = bearerToken;
  }

  /**
   * Sends a request to the signNow server.
   *
   * @param request the request to be sent
   * @param <R> the type of the response
   * @return the response from the server
   * @throws SignNowApiException if there is an error processing the request
   */
  public <R> Reply<R> send(RequestInterface<?> request) throws SignNowApiException {
    ApiEndpoint apiEndpoint = this.apiEndpointResolver.resolve(request);
    Request apiRequest = this.buildRequest(apiEndpoint, request);
    String responseBody = "";
    int responseCode = 0;

    try {
      Response response = this.client.newCall(apiRequest).execute();

      if (response.body() == null) {
        throw new IOException(
            "The server returned an empty response body. "
                + "This could be due to an unexpected server issue or a network problem. "
                + "Please try again later, or check your internet connection.");
      }

      responseBody = response.body().string();
      responseCode = response.code();
      response.close();

      this.validateResponse(responseCode, responseBody);

      return ResponseParser.parseResponse(responseCode, responseBody, apiEndpoint);
    } catch (IOException e) {
      throw new SignNowApiException(
          "Failed processing signNow API request.",
          apiEndpoint.method().toUpperCase(Locale.ROOT) + " " + apiEndpoint.url(),
          this.getPayload(apiRequest),
          responseBody,
          responseCode,
          e);
    }
  }

  /**
   * Sets the Bearer token for API requests.
   *
   * @param token the Bearer token to be set
   */
  public void setBearerToken(BearerToken token) {
    this.bearerToken = token;
  }

  /**
   * Retrieves the Bearer token for API requests.
   *
   * @return the Bearer token
   */
  public BearerToken getBearerToken() {
    return this.bearerToken;
  }

  @NotNull
  private Request buildRequest(@NotNull ApiEndpoint endpoint, RequestInterface<?> request)
      throws SignNowApiException {
    return new Request.Builder()
        .url(this.buildUrl(endpoint, request))
        .method(endpoint.method().toUpperCase(), this.buildBody(endpoint, request))
        .header("Accept", "application/json")
        .header("Content-Type", endpoint.type())
        .header("Authorization", this.buildAuthHeader(endpoint))
        .header("User-Agent", this.configRepository.clientName())
        .build();
  }

  @NotNull
  private String buildUrl(@NotNull ApiEndpoint endpoint, @NotNull RequestInterface<?> request) {
    String host = this.configRepository.host();
    String uri = endpoint.url();
    Map<String, String> uriParams = request.uriParams();

    if (uriParams.isEmpty()) {
      return host + uri;
    }

    for (Map.Entry<String, String> entry : uriParams.entrySet()) {
      String param = entry.getKey();
      String value = entry.getValue();
      uri = uri.replace("{" + param + "}", value);
    }

    return host + uri;
  }

  private String buildAuthHeader(@NotNull ApiEndpoint endpoint) throws SignNowApiException {
    String token;
    switch (endpoint.auth()) {
      case "basic":
        token = String.format("Basic %s", this.basicToken.token());
        break;
      case "bearer":
        token = String.format("Bearer %s", this.bearerToken.token());
        break;
      default:
        throw new SignNowApiException(
            String.format("Unknown request authentication type: %s", endpoint.auth()),
            endpoint.method().toUpperCase(Locale.ROOT) + " " + endpoint.url());
    }

    return token;
  }

  @Nullable
  private RequestBody buildBody(@NotNull ApiEndpoint endpoint, RequestInterface<?> request)
      throws SignNowApiException {
    if (!endpoint.method().equalsIgnoreCase("post") && !endpoint.method().equalsIgnoreCase("put")) {
      return null;
    }

    if (endpoint.type().equalsIgnoreCase("application/json")) {
      String jsonBody;
      try {
        jsonBody =
            new ObjectMapper()
                .setSerializationInclusion(JsonInclude.Include.NON_NULL)
                .writeValueAsString(request.payload());
      } catch (JsonProcessingException e) {
        throw new SignNowApiException(
            "Failed payload json serialization for the request.",
            endpoint.method().toUpperCase(Locale.ROOT) + " " + endpoint.url(),
            request.payload().toString(),
            null,
            null,
            e);
      }
      return RequestBody.Companion.create(jsonBody, MediaType.Companion.get(endpoint.type()));
    } else if (endpoint.type().equalsIgnoreCase("application/x-www-form-urlencoded")) {
      Map<String, ?> payload = request.payload();
      FormBody.Builder formBuilder = new FormBody.Builder();
      for (String key : payload.keySet()) {
        formBuilder.add(key, (String) payload.get(key));
      }
      return formBuilder.build();
    } else if (endpoint.type().equalsIgnoreCase("multipart/form-data")) {
      Map<String, ?> payload = request.payload();
      MultipartBody.Builder multipartBuilder =
          new MultipartBody.Builder().setType(MultipartBody.FORM);
      for (Map.Entry<String, ?> entry : payload.entrySet()) {
        String key = entry.getKey();
        Object value = entry.getValue();
        if (value instanceof String && !((String) value).isEmpty()) {
          multipartBuilder.addFormDataPart(key, (String) value);
        } else if (value instanceof File) {
          File file = (File) value;
          try {
            String mimeType = this.getMimeType(file);
            multipartBuilder.addFormDataPart(
                key, file.getName(), RequestBody.create(file, MediaType.parse(mimeType)));
          } catch (IOException e) {
            throw new SignNowApiException(
                "Impossible to detect MIME type of uploading file",
                endpoint.method().toUpperCase(Locale.ROOT) + " " + endpoint.url(),
                request.payload().toString(),
                null,
                null,
                e);
          }
        } else if (value != null) {
          multipartBuilder.addFormDataPart(key, value.toString());
        }
      }
      return multipartBuilder.build();
    }
    return null;
  }

  private void validateResponse(int code, String body) throws IOException {
    if (code >= 400 && code < 500) {
      throw new IOException("SignNow API request was invalid.");
    }
    if (code >= 500) {
      throw new IOException("SignNow API request has failed due to server error.");
    }
  }

  private String getPayload(Request request) {
    RequestBody requestBody = request.body();

    if (requestBody != null) {
      try {
        Buffer buffer = new Buffer();
        requestBody.writeTo(buffer);
        return buffer.readUtf8();
      } catch (IOException e) {
        return null;
      }
    }

    return null;
  }

  private String getMimeType(File file) throws IOException {
    String mimeType = Files.probeContentType(file.toPath());
    return mimeType != null ? mimeType : "application/octet-stream";
  }
}
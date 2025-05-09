/*
 * This file is a part of signNow SDK API client.
 *
 * (с) Copyright © 2011-present airSlate Inc. (https://www.signnow.com)
 *
 * For more details on copyright, see LICENSE.md file
 * that was distributed with this source code.
 */

package com.signnow.core.response;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.PropertyAccessor;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.type.TypeFactory;
import com.signnow.core.data.ResponseData;
import com.signnow.core.exception.SignNowApiException;
import com.signnow.core.request.ApiEndpoint;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Locale;

/** This class parses signNow API response JSON and deserializes it into a data object. */
public class ResponseParser {

  /** ObjectMapper instance used for JSON processing */
  private static final ObjectMapper objectMapper = new ObjectMapper();

  /**
   * Parses the response from the signNow API and deserializes it into a data object.
   *
   * @param responseData The downloading response data object
   * @param apiEndpoint The endpoint of the API that was called
   * @return A Reply object containing the status code, JSON response, and deserialized data
   * @throws SignNowApiException If there is an error during deserialization or if the response
   *     class for mapping is not found
   */
  public static <R> Reply<R> parse(ResponseData responseData, ApiEndpoint apiEndpoint)
      throws SignNowApiException, IOException {
    String entity = capitalizeFirstLetter(apiEndpoint.entity());
    String method = capitalizeFirstLetter(apiEndpoint.method().toLowerCase());
    String namespace = apiEndpoint.namespace().toLowerCase();

    String className =
        String.format("com.signnow.api.%s.response.%s%sResponse", namespace, entity, method);

    try {
      if (namespace.equals("proxy")) {
        if (apiEndpoint.url().contains("download") && responseData.hasFile()) {
          className = "com.signnow.api.proxy.response.ProxyFileResponse";
        } else {
          className = "com.signnow.api.proxy.response.ProxyJsonResponse";
        }
      }

      Class<?> mapClass = Class.forName(className);
      if (apiEndpoint.url().contains("download") && responseData.hasFile()) {
        return parseFile(mapClass, responseData);
      }
      return parseJson(mapClass, responseData, apiEndpoint);
    } catch (ClassNotFoundException e) {
      throw new SignNowApiException(
          String.format("Response class %s not found for mapping.", className),
          apiEndpoint.method().toUpperCase(Locale.ROOT) + " " + apiEndpoint.url(),
          null,
          responseData.getContentAsString(),
          null,
          e);
    }
  }

  /**
   * Capitalizes the first letter of the input string.
   *
   * @param input The string to capitalize
   * @return The input string with the first letter capitalized
   */
  private static String capitalizeFirstLetter(String input) {
    return input.substring(0, 1).toUpperCase() + input.substring(1);
  }

  private static <R> Reply<R> parseFile(Class<?> clazz, ResponseData downloadData)
      throws SignNowApiException {
    try {
      File file = FileDownloader.saveFile(downloadData);
      try {
        Constructor<?> constructor = clazz.getConstructor(File.class);
        R response = (R) constructor.newInstance(file);
        return new Reply<>(downloadData.getCode(), "{}", response);
      } catch (NoSuchMethodException
          | InstantiationException
          | IllegalAccessException
          | IllegalArgumentException
          | InvocationTargetException e) {
        throw new SignNowApiException("Error on response with file instantiating.", e);
      }
    } catch (IOException e) {
      throw new SignNowApiException("Error on saving the downloaded file.", e);
    }
  }

  private static <R> Reply<R> parseJson(
      Class<?> clazz, ResponseData responseData, ApiEndpoint apiEndpoint)
      throws SignNowApiException {
    String jsonResponse = responseData.getContentAsString();
    try {
      objectMapper
          .setVisibility(PropertyAccessor.GETTER, JsonAutoDetect.Visibility.NONE)
          .setVisibility(PropertyAccessor.IS_GETTER, JsonAutoDetect.Visibility.NONE);
      TypeFactory typeFactory = objectMapper.getTypeFactory();
      JavaType responseType = typeFactory.constructType(clazz);
      if (jsonResponse == null || jsonResponse.trim().isEmpty()) {
        jsonResponse = "{}";
      }
      R response = objectMapper.readValue(jsonResponse, responseType);
      return new Reply<>(responseData.getCode(), jsonResponse, response);
    } catch (JsonProcessingException e) {
      throw new SignNowApiException(
          String.format(
              "Failed to deserialize the response JSON to class %s instance.", clazz.getName()),
          apiEndpoint.method().toUpperCase(Locale.ROOT) + " " + apiEndpoint.url(),
          null,
          jsonResponse,
          null,
          e);
    }
  }
}

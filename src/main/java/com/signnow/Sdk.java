/*
 * This file is a part of signNow SDK API client.
 *
 * (с) Copyright © 2011-present airSlate Inc. (https://www.signnow.com)
 *
 * For more details on copyright, see LICENSE.md file
 * that was distributed with this source code.
 */

package com.signnow;

import com.signnow.api.auth.request.TokenPostRequest;
import com.signnow.api.auth.response.TokenPostResponse;
import com.signnow.core.ApiClient;
import com.signnow.core.config.ConfigRepository;
import com.signnow.core.exception.SignNowApiException;
import com.signnow.core.provider.ApiServiceProvider;
import com.signnow.core.token.BearerToken;

/**
 * Main class for the signNow SDK.
 */
public class Sdk {

  private static final String API_VERSION = "2024-08-30";
  private static final String DEFAULT_CONFIG = ".env";
  private static final String FULL_SCOPE = "*";
  private static final String EMPTY_CODE = "";
  private static final String GRANT_TYPE_BY_PASSWORD = "password";

  /** 
   * signNow SDK Service Provider 
   */
  private final ApiServiceProvider apiServiceProvider;

  /**
   * Default constructor that initializes the ApiServiceProvider with the default configuration.
   */
  public Sdk() {
    this.apiServiceProvider = new ApiServiceProvider(DEFAULT_CONFIG);
  }

  /**
   * Constructor that initializes the ApiServiceProvider with the provided configuration path.
   *
   * @param configPath the path to the configuration file
   */
  public Sdk(String configPath) {
    if (configPath == null || configPath.isEmpty()) {
      configPath = DEFAULT_CONFIG;
    }

    this.apiServiceProvider = new ApiServiceProvider(configPath);
  }

  /**
   * Builds the SDK by registering the services.
   *
   * @return the built SDK
   * @throws SignNowApiException if an error occurs during the registration of services
   */
  public Sdk build() throws SignNowApiException {
    this.apiServiceProvider.register();
    return this;
  }

  /**
   * Retrieves the ApiClient from the services.
   *
   * @return the ApiClient
   * @throws SignNowApiException if an error occurs during the retrieval of the ApiClient
   */
  public ApiClient getApiClient() throws SignNowApiException {
    if (this.apiServiceProvider.services().isEmpty()) {
      this.build();
    }
    return (ApiClient) this.apiServiceProvider.services().get("client");
  }

  /**
   * Authenticates the SDK by sending a TokenPostRequest and setting the BearerToken.
   *
   * @return the authenticated SDK
   * @throws SignNowApiException if an error occurs during the authentication
   */
  public Sdk authenticate() throws SignNowApiException {
    ConfigRepository config = (ConfigRepository) this.apiServiceProvider.services().get("config");
    ApiClient client = (ApiClient) this.apiServiceProvider.services().get("client");

    TokenPostRequest request =
        new TokenPostRequest(
            config.user(), config.password(), FULL_SCOPE, GRANT_TYPE_BY_PASSWORD, EMPTY_CODE);
    TokenPostResponse response = (TokenPostResponse) client.send(request).getResponse();

    BearerToken bearerToken =
        new BearerToken(
            response.getAccessToken(), response.getRefreshToken(), response.getExpiresIn());
    client.setBearerToken(bearerToken);
    this.apiServiceProvider.services().set("client", client);

    return this;
  }

  /**
   * Sets the BearerToken for the ApiClient.
   *
   * @param bearerToken the BearerToken to be set
   * @return the SDK with the set BearerToken
   */
  public Sdk withBearerToken(BearerToken bearerToken) {
    ApiClient client = (ApiClient) this.apiServiceProvider.services().get("client");
    client.setBearerToken(bearerToken);
    this.apiServiceProvider.services().set("client", client);
    return this;
  }

  /**
   * Retrieves the actual BearerToken of the ApiClient.
   *
   * @return the actual BearerToken
   * @throws SignNowApiException if an error occurs during the retrieval of the BearerToken
   */
  public BearerToken getActualBearerToken() throws SignNowApiException {
    return this.getApiClient().getBearerToken();
  }

  /**
   * Retrieves the version of the API.
   *
   * @return the version of the API
   */
  public String version() {
    return API_VERSION;
  }
}

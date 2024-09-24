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

public class Sdk {

  private static final String API_VERSION = "2024-08-30";
  private static final String DEFAULT_CONFIG = ".env";
  private static final String FULL_SCOPE = "*";
  private static final String EMPTY_CODE = "";
  private static final String GRANT_TYPE_BY_PASSWORD = "password";

  /** signNow SDK Service Provider * */
  private final ApiServiceProvider apiServiceProvider;

  public Sdk() {
    this.apiServiceProvider = new ApiServiceProvider(DEFAULT_CONFIG);
  }

  public Sdk(String configPath) {
    if (configPath == null || configPath.isEmpty()) {
      configPath = DEFAULT_CONFIG;
    }

    this.apiServiceProvider = new ApiServiceProvider(configPath);
  }

  public Sdk build() throws SignNowApiException {
    this.apiServiceProvider.register();
    return this;
  }

  public ApiClient getApiClient() throws SignNowApiException {
    if (this.apiServiceProvider.services().isEmpty()) {
      this.build();
    }
    return (ApiClient) this.apiServiceProvider.services().get("client");
  }

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

  public Sdk withBearerToken(BearerToken bearerToken) {
    ApiClient client = (ApiClient) this.apiServiceProvider.services().get("client");
    client.setBearerToken(bearerToken);
    this.apiServiceProvider.services().set("client", client);
    return this;
  }

  public BearerToken getActualBearerToken() throws SignNowApiException {
    return this.getApiClient().getBearerToken();
  }

  public String version() {
    return API_VERSION;
  }
}

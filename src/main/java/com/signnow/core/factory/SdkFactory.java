/*
 * This file is a part of signNow SDK API client.
 *
 * (с) Copyright © 2011-present airSlate Inc. (https://www.signnow.com)
 *
 * For more details on copyright, see LICENSE.md file
 * that was distributed with this source code.
 */

package com.signnow.core.factory;

import com.signnow.Sdk;
import com.signnow.core.ApiClient;
import com.signnow.core.exception.SignNowApiException;
import com.signnow.core.token.BearerToken;
import org.jetbrains.annotations.NotNull;

/**
 * Factory class for creating instances of ApiClient.
 */
public class SdkFactory {

  /**
   * Creates an instance of ApiClient using default configuration.
   *
   * @return ApiClient instance
   * @throws SignNowApiException if there is an error during ApiClient creation
   */
  public static ApiClient createApiClient() throws SignNowApiException {
    return (new Sdk()).build().authenticate().getApiClient();
  }

  /**
   * Creates an instance of ApiClient using the provided configuration path.
   *
   * @param configPath the path to the configuration file
   * @return ApiClient instance
   * @throws SignNowApiException if there is an error during ApiClient creation
   */
  public static ApiClient createApiClient(String configPath) throws SignNowApiException {
    return new Sdk(configPath).build().authenticate().getApiClient();
  }

  /**
   * Creates an instance of ApiClient using the provided bearer token.
   *
   * @param bearerToken the bearer token to be used for authentication
   * @return ApiClient instance
   * @throws SignNowApiException if there is an error during ApiClient creation
   */
  public static ApiClient createApiClientWithBearerToken(@NotNull String bearerToken)
      throws SignNowApiException {
    return bearerToken.isEmpty()
        ? SdkFactory.createApiClient()
        : (new Sdk()).build().withBearerToken(new BearerToken(bearerToken)).getApiClient();
  }

  /**
   * Creates an instance of ApiClient using the provided BearerToken object.
   *
   * @param bearerToken the BearerToken object to be used for authentication
   * @return ApiClient instance
   * @throws SignNowApiException if there is an error during ApiClient creation
   */
  public static ApiClient createApiClientWithBearerToken(@NotNull BearerToken bearerToken)
      throws SignNowApiException {
    return bearerToken.isEmpty()
        ? SdkFactory.createApiClient()
        : (new Sdk()).build().withBearerToken(bearerToken).getApiClient();
  }
}
/*
 * This file is a part of signNow SDK API client.
 *
 * (с) Copyright © 2011-present airSlate Inc. (https://www.signnow.com)
 *
 * For more details on copyright, see LICENSE.md file
 * that was distributed with this source code.
 */

package com.signnow.core.provider;

import com.signnow.core.ApiClient;
import com.signnow.core.config.ConfigLoader;
import com.signnow.core.config.ConfigRepository;
import com.signnow.core.exception.SignNowApiException;
import com.signnow.core.request.ApiEndpointResolver;
import java.util.concurrent.TimeUnit;
import okhttp3.OkHttpClient;
import org.jetbrains.annotations.NotNull;

/**
 * This class provides services for the signNow API SDK.
 */
public class ApiServiceProvider {

  /** 
   * Path to signNow API SDK configuration file. 
   */
  private final String configPath;

  /** 
   * Map of SDK general services 
   */
  private final ServiceRepository serviceRepository;

  /**
   * Constructor for the ApiServiceProvider class.
   *
   * @param configPath the path to the configuration file
   */
  public ApiServiceProvider(String configPath) {
    this.configPath = configPath;
    this.serviceRepository = new ServiceRepository();
  }

  /**
   * Register required SDK classes into Service Provider Repository.
   *
   * @throws SignNowApiException if there is an error during the registration process
   */
  public void register() throws SignNowApiException {
    if (!this.serviceRepository.has("config")) {
      this.serviceRepository.set("config", this.createSdkConfig());
    }
    if (!this.serviceRepository.has("client")) {
      this.serviceRepository.set("client", this.createApiClient());
    }
  }

  /**
   * Provide access Service Provider Repository to set/get services.
   *
   * @return the service repository
   */
  public ServiceRepository services() {
    return this.serviceRepository;
  }

  /**
   * Create an API client.
   *
   * @return the created API client
   * @throws SignNowApiException if there is an error during the creation process
   */
  @NotNull
  private ApiClient createApiClient() throws SignNowApiException {
    ConfigRepository config = (ConfigRepository) this.serviceRepository.get("config");
    OkHttpClient httpClient =
        new OkHttpClient.Builder()
            .readTimeout(config.readTimeout(), TimeUnit.SECONDS)
            .followRedirects(false)
            .build();
    return new ApiClient(httpClient, new ApiEndpointResolver(), config, config.basicToken(), null);
  }

  /**
   * Create an SDK configuration.
   *
   * @return the created SDK configuration
   * @throws SignNowApiException if there is an error during the creation process
   */
  @NotNull
  private ConfigRepository createSdkConfig() throws SignNowApiException {
    ConfigLoader configLoader = new ConfigLoader();
    return new ConfigRepository(configLoader.load(this.configPath));
  }
}

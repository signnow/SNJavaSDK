/*
 * This file is a part of signNow SDK API client.
 *
 * (с) Copyright © 2011-present airSlate Inc. (https://www.signnow.com)
 *
 * For more details on copyright, see LICENSE.md file
 * that was distributed with this source code.
 */

package com.signnow.api.webhookv2.response;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.signnow.api.webhookv2.response.data.data.EventSubscriptionDataCallback;

/**
 * This class is used to handle the response from the Callback API.
 * It ignores unknown properties in the JSON response using the @JsonIgnoreProperties annotation.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class CallbackGetResponse {

  /**
   * The data property is used to store the callback data from the API response.
   * It is mapped from the "data" field in the JSON response using the @JsonProperty annotation.
   */
  @JsonProperty("data")
  private final EventSubscriptionDataCallback data;

  /**
   * This is the constructor for the CallbackGetResponse class.
   * It initializes the data property with the provided EventSubscriptionDataCallback object.
   *
   * @param data The EventSubscriptionDataCallback object that contains the callback data from the API response.
   */
  public CallbackGetResponse(@JsonProperty("data") EventSubscriptionDataCallback data) {
    this.data = data;
  }

  /**
   * This method is used to get the callback data from the API response.
   *
   * @return The EventSubscriptionDataCallback object that contains the callback data from the API response.
   */
  public EventSubscriptionDataCallback getData() {
    return this.data;
  }
}
/*
 * This file is a part of signNow SDK API client.
 *
 * (с) Copyright © 2011-present airSlate Inc. (https://www.signnow.com)
 *
 * For more details on copyright, see LICENSE.md file
 * that was distributed with this source code.
 */

package com.signnow.api.webhook.response;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.signnow.api.webhook.response.data.data.DataSubscriptionCollection;

/**
 * This class is used to handle the response from the Subscription Get API.
 * It ignores unknown properties in the JSON response using the @JsonIgnoreProperties annotation.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class SubscriptionGetResponse {

  /**
   * This is the data property of the SubscriptionGetResponse.
   * It holds the data of the subscription collection.
   */
  @JsonProperty("data")
  private final DataSubscriptionCollection data;

  /**
   * This is the constructor for the SubscriptionGetResponse class.
   * It initializes the data property with the provided data.
   *
   * @param data The data of the subscription collection.
   */
  public SubscriptionGetResponse(@JsonProperty("data") DataSubscriptionCollection data) {
    this.data = data;
  }

  /**
   * This method is used to get the data of the subscription collection.
   *
   * @return The data of the subscription collection.
   */
  public DataSubscriptionCollection getData() {
    return this.data;
  }
}
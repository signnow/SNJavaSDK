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
import com.signnow.api.webhookv2.response.data.data.EventSubscriptionDataCallbackCollection;

/**
 * This class is used to ignore unknown properties from JSON and to bind JSON to Java object.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class CallbacksAllGetResponse {

  /**
   * This is a property that holds the data of EventSubscriptionDataCallbackCollection.
   */
  @JsonProperty("data")
  private final EventSubscriptionDataCallbackCollection data;

  /**
   * This is a constructor that initializes the data property.
   *
   * @param data The data of EventSubscriptionDataCallbackCollection.
   */
  public CallbacksAllGetResponse(
      @JsonProperty("data") EventSubscriptionDataCallbackCollection data) {
    this.data = data;
  }

  /**
   * This method is used to get the data of EventSubscriptionDataCallbackCollection.
   *
   * @return EventSubscriptionDataCallbackCollection This returns the data.
   */
  public EventSubscriptionDataCallbackCollection getData() {
    return this.data;
  }
}
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
 * This class is used to get all the event subscriptions callbacks response.
 * It ignores unknown properties during JSON processing.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class EventSubscriptionsCallbacksAllGetResponse {

  /**
   * The data of the event subscription callback collection.
   */
  @JsonProperty("data")
  private final EventSubscriptionDataCallbackCollection data;

  /**
   * Default constructor that initializes the data property with a new instance of EventSubscriptionDataCallbackCollection.
   */
  public EventSubscriptionsCallbacksAllGetResponse() {
    this.data = new EventSubscriptionDataCallbackCollection();
  }

  /**
   * This method is used to get the data of the event subscription callback collection.
   *
   * @return EventSubscriptionDataCallbackCollection - the data of the event subscription callback collection.
   */
  public EventSubscriptionDataCallbackCollection getData() {
    return this.data;
  }
}
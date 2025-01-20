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
import com.signnow.api.webhookv2.response.data.EventSubscriptionDataCollection;

/**
 * This class is used to ignore unknown properties when parsing JSON to Java objects.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class EventSubscriptionAllGetResponse {

  /**
   * This property is used to hold the data of EventSubscriptionDataCollection.
   */
  @JsonProperty("data")
  private final EventSubscriptionDataCollection data;

  /**
   * This is a no-arg constructor that initializes the data property with a new instance of EventSubscriptionDataCollection.
   */
  public EventSubscriptionAllGetResponse() {
    this.data = new EventSubscriptionDataCollection();
  }

  /**
   * This method is used to get the data of EventSubscriptionDataCollection.
   * 
   * @return EventSubscriptionDataCollection This returns the data of EventSubscriptionDataCollection.
   */
  public EventSubscriptionDataCollection getData() {
    return this.data;
  }
}
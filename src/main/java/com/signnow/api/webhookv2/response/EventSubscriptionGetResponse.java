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
import com.signnow.api.webhookv2.response.data.EventSubscriptionData;

/**
 * This class represents the response from an event subscription get request.
 * It is used to ignore unknown properties when mapping JSON to this class.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class EventSubscriptionGetResponse {

  /**
   * The data of the event subscription.
   */
  @JsonProperty("data")
  private EventSubscriptionData data;

  /**
   * This method is used to get the data of the event subscription.
   *
   * @return EventSubscriptionData This returns the data of the event subscription.
   */
  public EventSubscriptionData getData() {
    return this.data;
  }
}
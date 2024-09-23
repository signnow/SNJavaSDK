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

@JsonIgnoreProperties(ignoreUnknown = true)
public class EventSubscriptionsCallbacksAllGetResponse {

  @JsonProperty("data")
  private final EventSubscriptionDataCallbackCollection data;

  public EventSubscriptionsCallbacksAllGetResponse() {
    this.data = new EventSubscriptionDataCallbackCollection();
  }

  public EventSubscriptionDataCallbackCollection getData() {
    return this.data;
  }
}

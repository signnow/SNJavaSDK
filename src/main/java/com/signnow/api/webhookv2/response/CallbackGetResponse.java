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

@JsonIgnoreProperties(ignoreUnknown = true)
public class CallbackGetResponse {

  @JsonProperty("data")
  private final EventSubscriptionDataCallback data;

  public CallbackGetResponse(@JsonProperty("data") EventSubscriptionDataCallback data) {
    this.data = data;
  }

  public EventSubscriptionDataCallback getData() {
    return this.data;
  }
}

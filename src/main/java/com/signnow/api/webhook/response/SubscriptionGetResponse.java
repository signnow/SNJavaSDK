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

@JsonIgnoreProperties(ignoreUnknown = true)
public class SubscriptionGetResponse {

  @JsonProperty("data")
  private final DataSubscriptionCollection data;

  public SubscriptionGetResponse(@JsonProperty("data") DataSubscriptionCollection data) {
    this.data = data;
  }

  public DataSubscriptionCollection getData() {
    return this.data;
  }
}

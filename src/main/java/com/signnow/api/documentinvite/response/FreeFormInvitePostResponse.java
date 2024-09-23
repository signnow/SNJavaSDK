/*
 * This file is a part of signNow SDK API client.
 *
 * (с) Copyright © 2011-present airSlate Inc. (https://www.signnow.com)
 *
 * For more details on copyright, see LICENSE.md file
 * that was distributed with this source code.
 */

package com.signnow.api.documentinvite.response;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class FreeFormInvitePostResponse {

  @JsonProperty("result")
  private final String result;

  @JsonProperty("id")
  private final String id;

  @JsonProperty("callback_url")
  private final String callbackUrl;

  public FreeFormInvitePostResponse(
      @JsonProperty("result") String result,
      @JsonProperty("id") String id,
      @JsonProperty("callback_url") String callbackUrl) {
    this.result = result;
    this.id = id;
    this.callbackUrl = callbackUrl;
  }

  public String getResult() {
    return this.result;
  }

  public String getId() {
    return this.id;
  }

  public String getCallbackUrl() {
    return this.callbackUrl;
  }
}

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
public class SendInvitePostResponse {

  @JsonProperty("status")
  private final String status;

  public SendInvitePostResponse(@JsonProperty("status") String status) {
    this.status = status;
  }

  public String getStatus() {
    return this.status;
  }
}

/*
 * This file is a part of signNow SDK API client.
 *
 * (с) Copyright © 2011-present airSlate Inc. (https://www.signnow.com)
 *
 * For more details on copyright, see LICENSE.md file
 * that was distributed with this source code.
 */

package com.signnow.api.embeddedinvite.response;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.signnow.api.embeddedinvite.response.data.DataInviteCollection;

@JsonIgnoreProperties(ignoreUnknown = true)
public class DocumentInvitePostResponse {

  @JsonProperty("data")
  private final DataInviteCollection data;

  public DocumentInvitePostResponse(@JsonProperty("data") DataInviteCollection data) {
    this.data = data;
  }

  public DataInviteCollection getData() {
    return this.data;
  }
}

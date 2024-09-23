/*
 * This file is a part of signNow SDK API client.
 *
 * (с) Copyright © 2011-present airSlate Inc. (https://www.signnow.com)
 *
 * For more details on copyright, see LICENSE.md file
 * that was distributed with this source code.
 */

package com.signnow.api.embeddedgroupinvite.response;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.signnow.api.embeddedgroupinvite.response.data.DataLink;

@JsonIgnoreProperties(ignoreUnknown = true)
public class GroupInviteLinkPostResponse {

  @JsonProperty("data")
  private final DataLink data;

  public GroupInviteLinkPostResponse(@JsonProperty("data") DataLink data) {
    this.data = data;
  }

  public DataLink getData() {
    return this.data;
  }
}
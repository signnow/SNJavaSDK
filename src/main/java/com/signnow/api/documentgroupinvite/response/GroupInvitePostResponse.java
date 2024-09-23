/*
 * This file is a part of signNow SDK API client.
 *
 * (с) Copyright © 2011-present airSlate Inc. (https://www.signnow.com)
 *
 * For more details on copyright, see LICENSE.md file
 * that was distributed with this source code.
 */

package com.signnow.api.documentgroupinvite.response;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class GroupInvitePostResponse {

  @JsonProperty("id")
  private final String id;

  @JsonProperty("pending_invite_link")
  private final String pendingInviteLink;

  public GroupInvitePostResponse(
      @JsonProperty("id") String id,
      @JsonProperty("pending_invite_link") String pendingInviteLink) {
    this.id = id;
    this.pendingInviteLink = pendingInviteLink;
  }

  public String getId() {
    return this.id;
  }

  public String getPendingInviteLink() {
    return this.pendingInviteLink;
  }
}

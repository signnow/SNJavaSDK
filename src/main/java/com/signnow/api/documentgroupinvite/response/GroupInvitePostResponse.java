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

/**
 * This class represents the response of a group invite post request.
 * It ignores unknown properties when parsing JSON.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class GroupInvitePostResponse {

  /**
   * The id of the group invite post response.
   */
  @JsonProperty("id")
  private final String id;

  /**
   * The pending invite link of the group invite post response.
   */
  @JsonProperty("pending_invite_link")
  private final String pendingInviteLink;

  /**
   * Constructs a new GroupInvitePostResponse with the specified id and pending invite link.
   *
   * @param id the id of the group invite post response
   * @param pendingInviteLink the pending invite link of the group invite post response
   */
  public GroupInvitePostResponse(
      @JsonProperty("id") String id,
      @JsonProperty("pending_invite_link") String pendingInviteLink) {
    this.id = id;
    this.pendingInviteLink = pendingInviteLink;
  }

  /**
   * Returns the id of the group invite post response.
   *
   * @return the id of the group invite post response
   */
  public String getId() {
    return this.id;
  }

  /**
   * Returns the pending invite link of the group invite post response.
   *
   * @return the pending invite link of the group invite post response
   */
  public String getPendingInviteLink() {
    return this.pendingInviteLink;
  }
}
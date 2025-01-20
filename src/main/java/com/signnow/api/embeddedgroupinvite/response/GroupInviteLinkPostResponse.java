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

/**
 * This class is used to handle the response from the Group Invite Link Post API.
 * It ignores unknown properties during JSON serialization and deserialization.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class GroupInviteLinkPostResponse {

  /**
   * The data property holds the response data from the Group Invite Link Post API.
   */
  @JsonProperty("data")
  private final DataLink data;

  /**
   * This is the constructor for the GroupInviteLinkPostResponse class.
   * It initializes the data property with the provided value.
   *
   * @param data The response data from the Group Invite Link Post API.
   */
  public GroupInviteLinkPostResponse(@JsonProperty("data") DataLink data) {
    this.data = data;
  }

  /**
   * This method is used to get the response data from the Group Invite Link Post API.
   *
   * @return The response data from the Group Invite Link Post API.
   */
  public DataLink getData() {
    return this.data;
  }
}
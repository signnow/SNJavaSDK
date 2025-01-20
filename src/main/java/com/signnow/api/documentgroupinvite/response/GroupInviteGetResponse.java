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
import com.signnow.api.documentgroupinvite.response.data.invite.Invite;

/**
 * This class is used to ignore unknown properties when parsing JSON to Java object.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class GroupInviteGetResponse {

  /**
   * This property is used to hold the invite details.
   */
  @JsonProperty("invite")
  private final Invite invite;

  /**
   * This is a constructor used to initialize the invite property.
   *
   * @param invite This is the only parameter to the constructor which is an instance of Invite class.
   */
  public GroupInviteGetResponse(@JsonProperty("invite") Invite invite) {
    this.invite = invite;
  }

  /**
   * This method is used to get the invite details.
   *
   * @return Invite This returns the invite details.
   */
  public Invite getInvite() {
    return this.invite;
  }
}
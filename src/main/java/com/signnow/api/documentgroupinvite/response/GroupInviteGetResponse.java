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

@JsonIgnoreProperties(ignoreUnknown = true)
public class GroupInviteGetResponse {

  @JsonProperty("invite")
  private final Invite invite;

  public GroupInviteGetResponse(@JsonProperty("invite") Invite invite) {
    this.invite = invite;
  }

  public Invite getInvite() {
    return this.invite;
  }
}

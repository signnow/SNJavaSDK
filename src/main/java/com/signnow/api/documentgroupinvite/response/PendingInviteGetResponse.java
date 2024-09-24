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
import com.signnow.api.documentgroupinvite.response.data.InviteCollection;

@JsonIgnoreProperties(ignoreUnknown = true)
public class PendingInviteGetResponse {

  @JsonProperty("document_group_name")
  private final String documentGroupName;

  @JsonProperty("invites")
  private final InviteCollection invites;

  public PendingInviteGetResponse(
      @JsonProperty("document_group_name") String documentGroupName,
      @JsonProperty("invites") InviteCollection invites) {
    this.documentGroupName = documentGroupName;
    this.invites = invites;
  }

  public String getDocumentGroupName() {
    return this.documentGroupName;
  }

  public InviteCollection getInvites() {
    return this.invites;
  }
}

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

/**
 * This class represents the response of a pending invite get request.
 * It ignores unknown properties during JSON serialization and deserialization.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class PendingInviteGetResponse {

  /**
   * The name of the document group.
   */
  @JsonProperty("document_group_name")
  private final String documentGroupName;

  /**
   * The collection of invites.
   */
  @JsonProperty("invites")
  private final InviteCollection invites;

  /**
   * Constructs a new PendingInviteGetResponse with the specified document group name and invites.
   *
   * @param documentGroupName the name of the document group
   * @param invites the collection of invites
   */
  public PendingInviteGetResponse(
      @JsonProperty("document_group_name") String documentGroupName,
      @JsonProperty("invites") InviteCollection invites) {
    this.documentGroupName = documentGroupName;
    this.invites = invites;
  }

  /**
   * Returns the name of the document group.
   *
   * @return the name of the document group
   */
  public String getDocumentGroupName() {
    return this.documentGroupName;
  }

  /**
   * Returns the collection of invites.
   *
   * @return the collection of invites
   */
  public InviteCollection getInvites() {
    return this.invites;
  }
}
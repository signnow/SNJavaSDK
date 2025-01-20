/*
 * This file is a part of signNow SDK API client.
 *
 * (с) Copyright © 2011-present airSlate Inc. (https://www.signnow.com)
 *
 * For more details on copyright, see LICENSE.md file
 * that was distributed with this source code.
 */

package com.signnow.api.embeddedgroupinvite.request;

import com.signnow.core.request.ApiEndpoint;
import com.signnow.core.request.RequestInterface;
import java.util.HashMap;
import java.util.Map;
import org.jetbrains.annotations.NotNull;

/**
 * This class represents a request to delete a group invite.
 * It implements the RequestInterface with a String type.
 * The API endpoint is defined with the @ApiEndpoint annotation.
 */
@ApiEndpoint(
    name = "deleteEmbeddedDocGroupInvites",
    url = "/v2/document-groups/{document_group_id}/embedded-invites",
    method = "delete",
    auth = "bearer",
    namespace = "embeddedGroupInvite",
    entity = "groupInvite",
    type = "application/json")
public final class GroupInviteDeleteRequest implements RequestInterface<String> {

  /**
   * A map to hold URI parameters for the request.
   */
  private final Map<String, String> uriParams = new HashMap<>();

  /**
   * Method to add a document group id to the URI parameters.
   *
   * @param documentGroupId The id of the document group.
   * @return The current GroupInviteDeleteRequest instance.
   */
  public GroupInviteDeleteRequest withDocumentGroupId(String documentGroupId) {
    this.uriParams.put("document_group_id", documentGroupId);
    return this;
  }

  /**
   * Method to get the URI parameters for the request.
   *
   * @return A new HashMap containing the URI parameters.
   */
  @NotNull
  @Override
  public HashMap<String, String> uriParams() {
    return new HashMap<>(this.uriParams);
  }

  /**
   * Method to get the payload for the request.
   *
   * @return A new HashMap. In this case, it's empty as the delete request doesn't require a payload.
   */
  @NotNull
  @Override
  public Map<String, String> payload() {
    return new HashMap<>();
  }
}
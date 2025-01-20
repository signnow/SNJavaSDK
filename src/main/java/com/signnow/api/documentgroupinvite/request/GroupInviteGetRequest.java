/*
 * This file is a part of signNow SDK API client.
 *
 * (с) Copyright © 2011-present airSlate Inc. (https://www.signnow.com)
 *
 * For more details on copyright, see LICENSE.md file
 * that was distributed with this source code.
 */

package com.signnow.api.documentgroupinvite.request;

import com.signnow.core.request.ApiEndpoint;
import com.signnow.core.request.RequestInterface;
import java.util.HashMap;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

/**
 * This class represents a request to get a group invite.
 * It implements the RequestInterface with a String type.
 * The API endpoint is defined with the @ApiEndpoint annotation.
 */
@ApiEndpoint(
    name = "getDocumentGroupInvite",
    url = "/documentgroup/{document_group_id}/groupinvite/{invite_id}",
    method = "get",
    auth = "bearer",
    namespace = "documentGroupInvite",
    entity = "groupInvite",
    type = "application/json")
public final class GroupInviteGetRequest implements RequestInterface<String> {

  /**
   * A HashMap to store the URI parameters for the request.
   */
  private final HashMap<String, String> uriParams = new HashMap<>();

  /**
   * Adds the document group id to the URI parameters.
   *
   * @param documentGroupId The id of the document group.
   * @return The current GroupInviteGetRequest instance.
   */
  public GroupInviteGetRequest withDocumentGroupId(String documentGroupId) {
    this.uriParams.put("document_group_id", documentGroupId);
    return this;
  }

  /**
   * Adds the invite id to the URI parameters.
   *
   * @param inviteId The id of the invite.
   * @return The current GroupInviteGetRequest instance.
   */
  public GroupInviteGetRequest withInviteId(String inviteId) {
    this.uriParams.put("invite_id", inviteId);
    return this;
  }

  /**
   * Returns a new HashMap containing the URI parameters for the request.
   *
   * @return A new HashMap containing the URI parameters.
   */
  @NotNull
  @Contract(value = " -> new", pure = true)
  @Override
  public HashMap<String, String> uriParams() {
    return new HashMap<>(this.uriParams);
  }

  /**
   * Returns an empty HashMap as the payload for the request.
   *
   * @return An empty HashMap.
   */
  @NotNull
  @Override
  public HashMap<String, String> payload() {
    return new HashMap<>();
  }
}
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
 * API endpoint for getting pending document group invites.
 * The endpoint is defined by the @ApiEndpoint annotation.
 */
@ApiEndpoint(
    name = "getPendingDocumentGroupInvites",
    url = "/documentgroup/{document_group_id}/groupinvite/{invite_id}/pendinginvites",
    method = "get",
    auth = "bearer",
    namespace = "documentGroupInvite",
    entity = "pendingInvite",
    type = "application/json")
public final class PendingInviteGetRequest implements RequestInterface<String> {

  /**
   * A map to hold URI parameters for the request.
   */
  private final HashMap<String, String> uriParams = new HashMap<>();

  /**
   * Sets the document group ID for the request.
   *
   * @param documentGroupId The ID of the document group.
   * @return The current request instance.
   */
  @NotNull
  @Contract("_ -> this")
  public PendingInviteGetRequest withDocumentGroupId(@NotNull String documentGroupId) {
    this.uriParams.put("document_group_id", documentGroupId);
    return this;
  }

  /**
   * Sets the invite ID for the request.
   *
   * @param inviteId The ID of the invite.
   * @return The current request instance.
   */
  @NotNull
  @Contract("_ -> this")
  public PendingInviteGetRequest withInviteId(@NotNull String inviteId) {
    this.uriParams.put("invite_id", inviteId);
    return this;
  }

  /**
   * Returns the URI parameters for the request.
   *
   * @return A map of URI parameters.
   */
  @NotNull
  @Override
  public HashMap<String, String> uriParams() {
    return this.uriParams;
  }

  /**
   * Returns the payload for the request.
   * In this case, the payload is an empty map.
   *
   * @return An empty map.
   */
  @NotNull
  @Override
  public HashMap<String, String> payload() {
    return new HashMap<>();
  }
}

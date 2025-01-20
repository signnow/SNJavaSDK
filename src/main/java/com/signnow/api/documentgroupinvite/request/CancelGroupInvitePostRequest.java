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
import java.util.Map;
import org.jetbrains.annotations.NotNull;

/**
 * This class represents a request to cancel a group invite.
 * It implements the RequestInterface with a String type.
 */
@ApiEndpoint(
    name = "cancelDocumentGroupInvite",
    url = "/documentgroup/{document_group_id}/groupinvite/{invite_id}/cancelinvite",
    method = "post",
    auth = "bearer",
    namespace = "documentGroupInvite",
    entity = "cancelGroupInvite",
    type = "application/json")
public final class CancelGroupInvitePostRequest implements RequestInterface<String> {

  /**
   * A map to hold URI parameters for the request.
   */
  private final Map<String, String> uriParams = new HashMap<>();

  /**
   * Adds the document group id to the URI parameters.
   *
   * @param documentGroupId The id of the document group.
   * @return The current CancelGroupInvitePostRequest instance.
   */
  public CancelGroupInvitePostRequest withDocumentGroupId(String documentGroupId) {
    this.uriParams.put("document_group_id", documentGroupId);
    return this;
  }

  /**
   * Adds the invite id to the URI parameters.
   *
   * @param inviteId The id of the invite.
   * @return The current CancelGroupInvitePostRequest instance.
   */
  public CancelGroupInvitePostRequest withInviteId(String inviteId) {
    this.uriParams.put("invite_id", inviteId);
    return this;
  }

  /**
   * Returns a copy of the URI parameters.
   *
   * @return A HashMap containing the URI parameters.
   */
  @NotNull
  @Override
  public HashMap<String, String> uriParams() {
    return new HashMap<>(this.uriParams);
  }

  /**
   * Returns an empty payload for the request.
   *
   * @return An empty HashMap.
   */
  @NotNull
  @Override
  public Map<String, String> payload() {
    return new HashMap<>();
  }
}
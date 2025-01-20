/*
 * This file is a part of signNow SDK API client.
 *
 * (с) Copyright © 2011-present airSlate Inc. (https://www.signnow.com)
 *
 * For more details on copyright, see LICENSE.md file
 * that was distributed with this source code.
 */

package com.signnow.api.documentinvite.request;

import com.signnow.core.request.ApiEndpoint;
import com.signnow.core.request.RequestInterface;
import java.util.HashMap;
import java.util.Map;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

/**
 * API endpoint for cancelling a free form invite.
 * The request type is PUT and the content type is application/json.
 */
@ApiEndpoint(
    name = "cancelFreeFormInvite",
    url = "/invite/{invite_id}/cancel",
    method = "put",
    auth = "bearer",
    namespace = "documentInvite",
    entity = "cancelFreeFormInvite",
    type = "application/json")
public final class CancelFreeFormInvitePutRequest implements RequestInterface<String> {

  /**
   * The reason for cancelling the invite.
   */
  private final String reason;

  /**
   * The parameters for the URI.
   */
  private final Map<String, String> uriParams = new HashMap<>();

  /**
   * Constructor for CancelFreeFormInvitePutRequest.
   *
   * @param reason The reason for cancelling the invite.
   */
  public CancelFreeFormInvitePutRequest(String reason) {
    this.reason = reason;
  }

  /**
   * Getter for the reason.
   *
   * @return The reason for cancelling the invite.
   */
  public String getReason() {
    return this.reason;
  }

  /**
   * Method to add invite id to the URI parameters.
   *
   * @param inviteId The id of the invite.
   * @return The updated CancelFreeFormInvitePutRequest object.
   */
  public CancelFreeFormInvitePutRequest withInviteId(String inviteId) {
    this.uriParams.put("invite_id", inviteId);
    return this;
  }

  /**
   * Method to get the URI parameters.
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
   * Method to get the payload for the request.
   *
   * @return A Map containing the payload for the request.
   */
  @NotNull
  @Override
  public Map<String, String> payload() {
    Map<String, String> map = new HashMap<>();
    map.put("reason", this.getReason());
    return map;
  }
}

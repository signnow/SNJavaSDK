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
 * This class represents a request to cancel an invite.
 * It implements the RequestInterface with a String type parameter.
 */
@ApiEndpoint(
    name = "cancelInvite",
    url = "/document/{document_id}/fieldinvitecancel",
    method = "put",
    auth = "bearer",
    namespace = "documentInvite",
    entity = "cancelInvite",
    type = "application/json")
public final class CancelInvitePutRequest implements RequestInterface<String> {

  /**
   * The reason for cancelling the invite.
   */
  private final String reason;

  /**
   * The parameters to be included in the URI.
   */
  private final Map<String, String> uriParams = new HashMap<>();

  /**
   * Constructs a new CancelInvitePutRequest with the specified reason.
   *
   * @param reason the reason for cancelling the invite
   */
  public CancelInvitePutRequest(String reason) {
    this.reason = reason;
  }

  /**
   * Returns the reason for cancelling the invite.
   *
   * @return the reason for cancelling the invite
   */
  public String getReason() {
    return this.reason;
  }

  /**
   * Adds the document ID to the URI parameters.
   *
   * @param documentId the ID of the document
   * @return this CancelInvitePutRequest instance
   */
  public CancelInvitePutRequest withDocumentId(String documentId) {
    this.uriParams.put("document_id", documentId);
    return this;
  }

  /**
   * Returns a new HashMap containing the URI parameters.
   *
   * @return a new HashMap containing the URI parameters
   */
  @NotNull
  @Contract(value = " -> new", pure = true)
  @Override
  public HashMap<String, String> uriParams() {
    return new HashMap<>(this.uriParams);
  }

  /**
   * Returns a Map containing the payload for the request.
   *
   * @return a Map containing the payload for the request
   */
  @NotNull
  @Override
  public Map<String, String> payload() {
    Map<String, String> map = new HashMap<>();
    map.put("reason", this.getReason());
    return map;
  }
}

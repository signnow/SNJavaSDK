/*
 * This file is a part of signNow SDK API client.
 *
 * (с) Copyright © 2011-present airSlate Inc. (https://www.signnow.com)
 *
 * For more details on copyright, see LICENSE.md file
 * that was distributed with this source code.
 */

package com.signnow.api.embeddedinvite.request;

import com.signnow.core.request.ApiEndpoint;
import com.signnow.core.request.RequestInterface;
import java.util.HashMap;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

/**
 * This class represents a request to delete a document invite.
 * It implements the RequestInterface with a String type.
 * The API endpoint is defined with the @ApiEndpoint annotation.
 */
@ApiEndpoint(
    name = "deleteEmbeddedInvite",
    url = "/v2/documents/{document_id}/embedded-invites",
    method = "delete",
    auth = "bearer",
    namespace = "embeddedInvite",
    entity = "documentInvite",
    type = "application/json")
public final class DocumentInviteDeleteRequest implements RequestInterface<String> {

  /**
   * A map to hold URI parameters for the request.
   */
  private final HashMap<String, String> uriParams = new HashMap<>();

  /**
   * Adds a document ID to the URI parameters.
   *
   * @param documentId the ID of the document to be deleted
   * @return this request object with the updated URI parameters
   */
  public DocumentInviteDeleteRequest withDocumentId(String documentId) {
    this.uriParams.put("document_id", documentId);
    return this;
  }

  /**
   * Returns a new map containing the URI parameters for this request.
   *
   * @return a new map containing the URI parameters
   */
  @NotNull
  @Contract(value = " -> new", pure = true)
  @Override
  public HashMap<String, String> uriParams() {
    return new HashMap<>(this.uriParams);
  }

  /**
   * Returns an empty map as the payload for this request.
   *
   * @return an empty map
   */
  @NotNull
  @Override
  public HashMap<String, String> payload() {
    return new HashMap<>();
  }
}
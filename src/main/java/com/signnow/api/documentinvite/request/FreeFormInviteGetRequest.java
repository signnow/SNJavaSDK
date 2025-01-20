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
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

/**
 * This class represents a request to get free form invites for a document.
 * It implements the RequestInterface with a String type parameter.
 */
@ApiEndpoint(
    name = "getDocumentFreeFormInvites",
    url = "/v2/documents/{document_id}/free-form-invites",
    method = "get",
    auth = "bearer",
    namespace = "documentInvite",
    entity = "freeFormInvite",
    type = "application/json")
public final class FreeFormInviteGetRequest implements RequestInterface<String> {

  /**
   * A map to hold URI parameters for the request.
   */
  private final HashMap<String, String> uriParams = new HashMap<>();

  /**
   * Sets the document ID for the request.
   *
   * @param documentId the ID of the document
   * @return this request object with the document ID set
   */
  @NotNull
  @Contract("_ -> this")
  public FreeFormInviteGetRequest withDocumentId(@NotNull String documentId) {
    this.uriParams.put("document_id", documentId);
    return this;
  }

  /**
   * Gets the URI parameters for the request.
   *
   * @return the map of URI parameters
   */
  @NotNull
  @Override
  public HashMap<String, String> uriParams() {
    return this.uriParams;
  }

  /**
   * Gets the payload for the request.
   *
   * @return an empty map as the payload
   */
  @NotNull
  @Override
  public HashMap<String, String> payload() {
    return new HashMap<>();
  }
}
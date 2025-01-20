/*
 * This file is a part of signNow SDK API client.
 *
 * (с) Copyright © 2011-present airSlate Inc. (https://www.signnow.com)
 *
 * For more details on copyright, see LICENSE.md file
 * that was distributed with this source code.
 */

package com.signnow.api.document.request;

import com.signnow.core.request.ApiEndpoint;
import com.signnow.core.request.RequestInterface;
import java.util.HashMap;
import java.util.Map;
import org.jetbrains.annotations.NotNull;

/**
 * This class represents a request to delete a document.
 * It implements the RequestInterface with a String type parameter.
 */
@ApiEndpoint(
    name = "deleteDocument",
    url = "/document/{document_id}",
    method = "delete",
    auth = "bearer",
    namespace = "document",
    entity = "document",
    type = "application/json")
public final class DocumentDeleteRequest implements RequestInterface<String> {

  /**
   * A map to hold URI parameters for the request.
   */
  private final Map<String, String> uriParams = new HashMap<>();

  /**
   * Method to add a document ID to the URI parameters.
   *
   * @param documentId The ID of the document to be deleted.
   * @return The current DocumentDeleteRequest instance.
   */
  public DocumentDeleteRequest withDocumentId(String documentId) {
    this.uriParams.put("document_id", documentId);
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
   * @return A new HashMap. As this is a delete request, the payload is empty.
   */
  @NotNull
  @Override
  public Map<String, String> payload() {
    return new HashMap<>();
  }
}
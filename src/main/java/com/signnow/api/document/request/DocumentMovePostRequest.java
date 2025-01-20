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
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

/**
 * This class represents a request to move a document to a different folder.
 * It implements the RequestInterface with a String type.
 */
@ApiEndpoint(
    name = "moveDocument",
    url = "/document/{document_id}/move",
    method = "post",
    auth = "bearer",
    namespace = "document",
    entity = "documentMove",
    type = "application/json")
public final class DocumentMovePostRequest implements RequestInterface<String> {

  /**
   * The ID of the folder where the document will be moved.
   */
  private final String folderId;

  /**
   * A map of URI parameters for the request.
   */
  private final HashMap<String, String> uriParams = new HashMap<>();

  /**
   * Constructs a new DocumentMovePostRequest with the specified folder ID.
   *
   * @param folderId the ID of the folder where the document will be moved
   */
  public DocumentMovePostRequest(String folderId) {
    this.folderId = folderId;
  }

  /**
   * Returns the ID of the folder where the document will be moved.
   *
   * @return the folder ID
   */
  public String getFolderId() {
    return this.folderId;
  }

  /**
   * Adds the document ID to the URI parameters and returns this request.
   *
   * @param documentId the ID of the document to be moved
   * @return this DocumentMovePostRequest
   */
  public DocumentMovePostRequest withDocumentId(String documentId) {
    this.uriParams.put("document_id", documentId);
    return this;
  }

  /**
   * Returns a new map of the URI parameters for this request.
   *
   * @return a new map of the URI parameters
   */
  @NotNull
  @Contract(value = " -> new", pure = true)
  @Override
  public HashMap<String, String> uriParams() {
    return new HashMap<>(this.uriParams);
  }

  /**
   * Returns a map of the payload for this request.
   *
   * @return a map of the payload
   */
  @NotNull
  public Map<String, String> payload() {
    Map<String, String> map = new HashMap<>();
    map.put("folder_id", this.getFolderId());
    return map;
  }
}

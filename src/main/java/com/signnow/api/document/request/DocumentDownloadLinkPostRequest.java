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
 * This class represents a request to create a document download link.
 * It implements the RequestInterface with a String type parameter.
 */
@ApiEndpoint(
    name = "createDocumentDownloadLink",
    url = "/document/{document_id}/download/link",
    method = "post",
    auth = "bearer",
    namespace = "document",
    entity = "documentDownloadLink",
    type = "application/json")
public final class DocumentDownloadLinkPostRequest implements RequestInterface<String> {

  /**
   * A map to hold URI parameters for the request.
   */
  private final HashMap<String, String> uriParams = new HashMap<>();

  /**
   * Adds a document ID to the URI parameters.
   *
   * @param documentId the ID of the document
   * @return this request object with the added document ID
   */
  public DocumentDownloadLinkPostRequest withDocumentId(String documentId) {
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
   * Returns a new, empty map to represent the payload for this request.
   *
   * @return a new, empty map
   */
  @NotNull
  @Override
  public Map<String, String> payload() {
    return new HashMap<>();
  }
}
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
 * This class represents a request to download a document. It implements the RequestInterface with a
 * String type parameter.
 */
@ApiEndpoint(
    name = "downloadDocument",
    url = "/document/{document_id}/download",
    method = "get",
    auth = "bearer",
    namespace = "document",
    entity = "documentDownload",
    type = "application/pdf")
public final class DocumentDownloadGetRequest implements RequestInterface<String> {

  /** A map to hold URI parameters for the request. */
  private final HashMap<String, String> uriParams = new HashMap<>();

  /** A map to hold query parameters for the request. */
  private final HashMap<String, String> queryParams = new HashMap<>();

  /**
   * Specifies file type to download: collapsed|zip|email
   *
   * @return this DocumentDownloadGetRequest instance
   */
  public DocumentDownloadGetRequest withType(String type) {
    this.queryParams.put("type", type);
    return this;
  }

  /**
   * The value "yes" allows to include a table containing the document's history into a document.
   *
   * @return this DocumentDownloadGetRequest instance
   */
  public DocumentDownloadGetRequest withHistory(String withHistory) {
    this.queryParams.put("with_history", withHistory);
    return this;
  }

  /**
   * Adds a document ID to the URI parameters.
   *
   * @param documentId the ID of the document to download
   * @return this DocumentDownloadGetRequest instance
   */
  public DocumentDownloadGetRequest withDocumentId(String documentId) {
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
   * Returns a map as the query parameters for this request.
   *
   * @return an empty map
   */
  @NotNull
  public Map<String, String> queryParams() {
    return new HashMap<>(this.queryParams);
  }

  /**
   * Returns an empty map as the payload for this request.
   *
   * @return an empty map
   */
  @NotNull
  @Override
  public Map<String, String> payload() {
    return new HashMap<>();
  }
}

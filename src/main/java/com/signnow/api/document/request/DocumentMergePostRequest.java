/*
 * This file is a part of signNow SDK API client.
 *
 * (с) Copyright © 2011-present airSlate Inc. (https://www.signnow.com)
 *
 * For more details on copyright, see LICENSE.md file
 * that was distributed with this source code.
 */

package com.signnow.api.document.request;

import com.signnow.api.document.request.data.DocumentIdCollection;
import com.signnow.core.request.ApiEndpoint;
import com.signnow.core.request.RequestInterface;
import java.util.HashMap;
import java.util.Map;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

/**
 * This class represents a request to merge documents.
 * It is annotated with @ApiEndpoint to provide metadata about the API endpoint.
 */
@ApiEndpoint(
    name = "mergeDocuments",
    url = "/document/merge",
    method = "post",
    auth = "bearer",
    namespace = "document",
    entity = "documentMerge",
    type = "application/json")
public final class DocumentMergePostRequest implements RequestInterface<Object> {

  /**
   * The name of the document.
   */
  private final String name;

  /**
   * The collection of document IDs to be merged.
   */
  private final DocumentIdCollection documentIds;

  /**
   * Flag indicating whether the document should be uploaded.
   */
  private final boolean uploadDocument;

  /**
   * Constructs a new DocumentMergePostRequest.
   *
   * @param name the name of the document
   * @param documentIds the collection of document IDs to be merged
   * @param uploadDocument flag indicating whether the document should be uploaded
   */
  public DocumentMergePostRequest(
      String name, DocumentIdCollection documentIds, boolean uploadDocument) {
    this.name = name;
    this.documentIds = documentIds;
    this.uploadDocument = uploadDocument;
  }

  /**
   * Returns the name of the document.
   *
   * @return the name of the document
   */
  public String getName() {
    return this.name;
  }

  /**
   * Returns the collection of document IDs to be merged.
   *
   * @return the collection of document IDs to be merged
   */
  public DocumentIdCollection getDocumentIds() {
    return this.documentIds;
  }

  /**
   * Returns whether the document should be uploaded.
   *
   * @return true if the document should be uploaded, false otherwise
   */
  public boolean isUploadDocument() {
    return this.uploadDocument;
  }

  /**
   * Returns a new HashMap with no URI parameters.
   *
   * @return a new HashMap with no URI parameters
   */
  @NotNull
  @Contract(value = " -> new", pure = true)
  @Override
  public HashMap<String, String> uriParams() {
    return new HashMap<>();
  }

  /**
   * Returns a map with the payload of the request.
   *
   * @return a map with the payload of the request
   */
  @NotNull
  public Map<String, Object> payload() {
    Map<String, Object> map = new HashMap<>();
    map.put("name", this.getName());
    map.put("document_ids", this.getDocumentIds());
    map.put("upload_document", this.isUploadDocument());
    return map;
  }
}

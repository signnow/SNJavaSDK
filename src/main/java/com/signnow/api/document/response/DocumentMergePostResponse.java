/*
 * This file is a part of signNow SDK API client.
 *
 * (с) Copyright © 2011-present airSlate Inc. (https://www.signnow.com)
 *
 * For more details on copyright, see LICENSE.md file
 * that was distributed with this source code.
 */

package com.signnow.api.document.response;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * This class represents the response received after a document merge operation.
 * It ignores unknown properties during JSON serialization and deserialization.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class DocumentMergePostResponse {

  /**
   * The ID of the document.
   */
  @JsonProperty("document_id")
  private final String documentId;

  /**
   * Constructs a new DocumentMergePostResponse with the specified document ID.
   *
   * @param documentId the ID of the document
   */
  public DocumentMergePostResponse(@JsonProperty("document_id") String documentId) {
    this.documentId = documentId;
  }

  /**
   * Returns the ID of the document.
   *
   * @return the document ID
   */
  public String getDocumentId() {
    return this.documentId;
  }
}
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

@JsonIgnoreProperties(ignoreUnknown = true)
public class DocumentMergePostResponse {

  @JsonProperty("document_id")
  private final String documentId;

  public DocumentMergePostResponse(@JsonProperty("document_id") String documentId) {
    this.documentId = documentId;
  }

  public String getDocumentId() {
    return this.documentId;
  }
}

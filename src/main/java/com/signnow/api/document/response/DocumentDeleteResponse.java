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
 * This class represents the response received after a document deletion request.
 * It ignores unknown properties during deserialization using Jackson.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class DocumentDeleteResponse {

  /**
   * The status of the document deletion request.
   */
  @JsonProperty("status")
  private final String status;

  /**
   * Constructs a new DocumentDeleteResponse with the specified status.
   *
   * @param status the status of the document deletion request
   */
  public DocumentDeleteResponse(@JsonProperty("status") String status) {
    this.status = status;
  }

  /**
   * Returns the status of the document deletion request.
   *
   * @return the status of the document deletion request
   */
  public String getStatus() {
    return this.status;
  }
}
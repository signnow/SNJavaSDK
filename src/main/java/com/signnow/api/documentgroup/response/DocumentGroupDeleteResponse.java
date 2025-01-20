/*
 * This file is a part of signNow SDK API client.
 *
 * (с) Copyright © 2011-present airSlate Inc. (https://www.signnow.com)
 *
 * For more details on copyright, see LICENSE.md file
 * that was distributed with this source code.
 */

package com.signnow.api.documentgroup.response;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * This class represents the response received after a document group deletion request.
 * It is ignored by the Jackson JSON processor if any unknown properties are encountered in the JSON input.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class DocumentGroupDeleteResponse {

  /**
   * The status of the document group deletion request.
   */
  @JsonProperty("status")
  private final String status;

  /**
   * Constructs a new DocumentGroupDeleteResponse with the specified status.
   *
   * @param status the status of the document group deletion request
   */
  public DocumentGroupDeleteResponse(@JsonProperty("status") String status) {
    this.status = status;
  }

  /**
   * Returns the status of the document group deletion request.
   *
   * @return the status of the document group deletion request
   */
  public String getStatus() {
    return this.status;
  }
}
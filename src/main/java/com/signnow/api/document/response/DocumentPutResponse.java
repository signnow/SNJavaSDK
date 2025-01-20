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
 * This class is used to handle the response from the Document PUT API.
 * It ignores any unknown properties in the JSON response.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class DocumentPutResponse {

  /**
   * The ID of the document.
   */
  @JsonProperty("id")
  private final String id;

  /**
   * Constructs a new DocumentPutResponse with the specified document ID.
   *
   * @param id the ID of the document
   */
  public DocumentPutResponse(@JsonProperty("id") String id) {
    this.id = id;
  }

  /**
   * Returns the ID of the document.
   *
   * @return the ID of the document
   */
  public String getId() {
    return this.id;
  }
}
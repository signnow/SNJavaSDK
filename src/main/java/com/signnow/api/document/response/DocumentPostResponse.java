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
 * This class is used to handle the response from the Document Post API.
 * It ignores any unknown properties in the JSON response.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class DocumentPostResponse {

  /**
   * The ID of the document.
   */
  @JsonProperty("id")
  private final String id;

  /**
   * This constructor initializes the DocumentPostResponse object with the provided document ID.
   *
   * @param id The ID of the document.
   */
  public DocumentPostResponse(@JsonProperty("id") String id) {
    this.id = id;
  }

  /**
   * This method is used to get the ID of the document.
   *
   * @return The ID of the document.
   */
  public String getId() {
    return this.id;
  }
}
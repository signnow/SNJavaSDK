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
 * This class is used to handle the response from the Document Group Post API.
 * It ignores unknown JSON properties using Jackson annotation.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class DocumentGroupPostResponse {

  /**
   * The id of the document group.
   */
  @JsonProperty("id")
  private final String id;

  /**
   * This constructor is used to create a new instance of DocumentGroupPostResponse.
   * 
   * @param id The id of the document group.
   */
  public DocumentGroupPostResponse(@JsonProperty("id") String id) {
    this.id = id;
  }

  /**
   * This method is used to get the id of the document group.
   * 
   * @return String This returns the id of the document group.
   */
  public String getId() {
    return this.id;
  }
}
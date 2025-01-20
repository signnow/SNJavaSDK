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
 * This class is used to ignore unknown properties while parsing JSON to Java object.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class FieldExtractPostResponse {

  /**
   * The id of the FieldExtractPostResponse.
   */
  @JsonProperty("id")
  private final String id;

  /**
   * This is a constructor for FieldExtractPostResponse.
   *
   * @param id The id of the FieldExtractPostResponse.
   */
  public FieldExtractPostResponse(@JsonProperty("id") String id) {
    this.id = id;
  }

  /**
   * This method is used to get the id of the FieldExtractPostResponse.
   *
   * @return String This returns the id of the FieldExtractPostResponse.
   */
  public String getId() {
    return this.id;
  }
}
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
 * This class is used to handle the response from the Document Move Post API.
 * It ignores unknown JSON properties using the @JsonIgnoreProperties annotation.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class DocumentMovePostResponse {

  /**
   * The result of the Document Move Post operation.
   */
  @JsonProperty("result")
  private final String result;

  /**
   * This constructor initializes the DocumentMovePostResponse object with the result of the Document Move Post operation.
   *
   * @param result The result of the Document Move Post operation.
   */
  public DocumentMovePostResponse(@JsonProperty("result") String result) {
    this.result = result;
  }

  /**
   * This method is used to get the result of the Document Move Post operation.
   *
   * @return The result of the Document Move Post operation.
   */
  public String getResult() {
    return this.result;
  }
}
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
public class DocumentMovePostResponse {

  @JsonProperty("result")
  private final String result;

  public DocumentMovePostResponse(@JsonProperty("result") String result) {
    this.result = result;
  }

  public String getResult() {
    return this.result;
  }
}

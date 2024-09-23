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
public class DocumentPutResponse {

  @JsonProperty("id")
  private final String id;

  public DocumentPutResponse(@JsonProperty("id") String id) {
    this.id = id;
  }

  public String getId() {
    return this.id;
  }
}

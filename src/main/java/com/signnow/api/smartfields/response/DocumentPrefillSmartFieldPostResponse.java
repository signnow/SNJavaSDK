/*
 * This file is a part of signNow SDK API client.
 *
 * (с) Copyright © 2011-present airSlate Inc. (https://www.signnow.com)
 *
 * For more details on copyright, see LICENSE.md file
 * that was distributed with this source code.
 */

package com.signnow.api.smartfields.response;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class DocumentPrefillSmartFieldPostResponse {

  @JsonProperty("status")
  private final String status;

  public DocumentPrefillSmartFieldPostResponse(@JsonProperty("status") String status) {
    this.status = status;
  }

  public String getStatus() {
    return this.status;
  }
}

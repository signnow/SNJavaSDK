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
import com.signnow.api.documentgroup.response.data.data.Data;

@JsonIgnoreProperties(ignoreUnknown = true)
public class DocumentGroupRecipientsGetResponse {

  @JsonProperty("data")
  private final Data data;

  public DocumentGroupRecipientsGetResponse(@JsonProperty("data") Data data) {
    this.data = data;
  }

  public Data getData() {
    return this.data;
  }
}

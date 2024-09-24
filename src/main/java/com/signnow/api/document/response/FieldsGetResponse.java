/*
 * This file is a part of signNow SDK API client.
 *
 * (с) Copyright © 2011-present airSlate Inc. (https://www.signnow.com)
 *
 * For more details on copyright, see LICENSE.md file
 */

package com.signnow.api.document.response;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.signnow.api.document.response.data.DataCollection;

@JsonIgnoreProperties(ignoreUnknown = true)
public class FieldsGetResponse {

  @JsonProperty("data")
  private final DataCollection data;

  public FieldsGetResponse(@JsonProperty("data") DataCollection data) {
    this.data = data;
  }

  public DataCollection getData() {
    return this.data;
  }
}

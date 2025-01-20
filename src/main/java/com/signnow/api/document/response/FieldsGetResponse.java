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

/**
 * This class is used to ignore unknown properties from JSON input and to bind JSON to this class.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class FieldsGetResponse {

  /**
   * The data collection object.
   */
  @JsonProperty("data")
  private final DataCollection data;

  /**
   * Constructor for FieldsGetResponse.
   *
   * @param data The data collection object.
   */
  public FieldsGetResponse(@JsonProperty("data") DataCollection data) {
    this.data = data;
  }

  /**
   * This method is used to get the data collection object.
   *
   * @return DataCollection This returns the data collection object.
   */
  public DataCollection getData() {
    return this.data;
  }
}
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

/**
 * This class is used to ignore unknown properties while parsing JSON and Java objects.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class DocumentGroupRecipientsGetResponse {

  /**
   * This is a property that holds the data of the document group recipients.
   */
  @JsonProperty("data")
  private final Data data;

  /**
   * This is a constructor that initializes the data property.
   *
   * @param data The data of the document group recipients.
   */
  public DocumentGroupRecipientsGetResponse(@JsonProperty("data") Data data) {
    this.data = data;
  }

  /**
   * This method is used to get the data of the document group recipients.
   *
   * @return The data of the document group recipients.
   */
  public Data getData() {
    return this.data;
  }
}
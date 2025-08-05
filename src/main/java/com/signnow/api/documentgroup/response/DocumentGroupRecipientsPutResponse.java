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
 * This class represents the response for putting document group recipients.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class DocumentGroupRecipientsPutResponse {

  /**
   * The data associated with the document group recipients.
   */
  @JsonProperty("data")
  private final Data data;

  /**
   * Constructs a new DocumentGroupRecipientsPutResponse with the specified data.
   *
   * @param data the data associated with the document group recipients.
   */
  public DocumentGroupRecipientsPutResponse(@JsonProperty("data") Data data) {
    this.data = data;
  }

  /**
   * Returns the data associated with the document group recipients.
   *
   * @return the data associated with the document group recipients.
   */
  public Data getData() {
    return this.data;
  }
}

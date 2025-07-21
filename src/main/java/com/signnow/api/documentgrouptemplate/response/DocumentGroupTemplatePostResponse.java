/*
 * This file is a part of signNow SDK API client.
 *
 * (с) Copyright © 2011-present airSlate Inc. (https://www.signnow.com)
 *
 * For more details on copyright, see LICENSE.md file
 * that was distributed with this source code.
 */

package com.signnow.api.documentgrouptemplate.response;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.signnow.api.documentgrouptemplate.response.data.data.Data;

/**
 * This class represents the response received after a document group template post request.
 * It ignores unknown properties in the JSON response.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class DocumentGroupTemplatePostResponse {

  /**
   * The data associated with the document group template post response.
   */
  @JsonProperty("data")
  private final Data data;

  /**
   * Constructs a new DocumentGroupTemplatePostResponse with the specified data.
   *
   * @param data the data associated with the document group template post response.
   */
  public DocumentGroupTemplatePostResponse(Data data) {
    this.data = data;
  }

  /**
   * Returns the data associated with the document group template post response.
   *
   * @return the data associated with the document group template post response.
   */
  public Data getData() {
    return this.data;
  }
}

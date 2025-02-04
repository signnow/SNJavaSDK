/*
 * This file is a part of signNow SDK API client.
 *
 * (с) Copyright © 2011-present airSlate Inc. (https://www.signnow.com)
 *
 * For more details on copyright, see LICENSE.md file
 * that was distributed with this source code.
 */

package com.signnow.api.embeddededitor.response;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.signnow.api.embeddededitor.response.data.DataUrl;

/** This class represents the response containing the embedded editor link for a document group. */
@JsonIgnoreProperties(ignoreUnknown = true)
public class DocumentGroupEmbeddedEditorLinkPostResponse {

  /** The link for document editor inside 'data' object. */
  @JsonProperty("data")
  private final DataUrl data;

  /**
   * Constructs a new DocumentGroupEmbeddedEditorLinkPostResponse with the specified data URL.
   *
   * @param data the link for document editor inside 'data' object.
   */
  @JsonCreator
  public DocumentGroupEmbeddedEditorLinkPostResponse(@JsonProperty("data") DataUrl data) {
    this.data = data;
  }

  /**
   * Returns the data URL associated with the document embedded editor link.
   *
   * @return the data URL associated with the document embedded editor link.
   */
  public DataUrl getData() {
    return this.data;
  }
}

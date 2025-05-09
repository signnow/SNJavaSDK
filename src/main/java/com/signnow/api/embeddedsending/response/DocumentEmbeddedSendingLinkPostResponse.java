/*
 * This file is a part of signNow SDK API client.
 *
 * (с) Copyright © 2011-present airSlate Inc. (https://www.signnow.com)
 *
 * For more details on copyright, see LICENSE.md file
 * that was distributed with this source code.
 */

package com.signnow.api.embeddedsending.response;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.signnow.api.embeddedsending.response.data.DataUrl;

/**
 * This class represents the response containing the embedded sending link for a document. It
 * ignores unknown properties in the JSON response.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class DocumentEmbeddedSendingLinkPostResponse {

  /** The data URL associated with the embedded sending link. */
  @JsonProperty("data")
  private final DataUrl data;

  /**
   * Constructs a new DocumentEmbeddedSendingLinkPostResponse with the specified data URL.
   *
   * @param data the data URL associated with the embedded sending link.
   */
  public DocumentEmbeddedSendingLinkPostResponse(@JsonProperty("data") DataUrl data) {
    this.data = data;
  }

  /**
   * Returns the data URL associated with the embedded sending link.
   *
   * @return the data URL associated with the embedded sending link.
   */
  public DataUrl getData() {
    return this.data;
  }
}

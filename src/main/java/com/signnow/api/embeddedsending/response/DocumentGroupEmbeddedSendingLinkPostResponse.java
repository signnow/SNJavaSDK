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
 * This class represents the response for the Document Group Embedded Sending Link Post request. It
 * contains the data URL associated with the response.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class DocumentGroupEmbeddedSendingLinkPostResponse {

  /** The data URL associated with the response. */
  @JsonProperty("data")
  private final DataUrl data;

  /**
   * Constructs a new DocumentGroupEmbeddedSendingLinkPostResponse with the specified data URL.
   *
   * @param data the data URL associated with the response.
   */
  public DocumentGroupEmbeddedSendingLinkPostResponse(@JsonProperty("data") DataUrl data) {
    this.data = data;
  }

  /**
   * Returns the data URL associated with the response.
   *
   * @return the data URL associated with the response.
   */
  public DataUrl getData() {
    return this.data;
  }
}

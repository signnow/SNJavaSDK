/*
 * This file is a part of signNow SDK API client.
 *
 * (с) Copyright © 2011-present airSlate Inc. (https://www.signnow.com)
 *
 * For more details on copyright, see LICENSE.md file
 * that was distributed with this source code.
 */

package com.signnow.api.document.response;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * This class is used to handle the response from the Document Download Link Post API.
 * It ignores unknown properties during the JSON parsing process.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class DocumentDownloadLinkPostResponse {

  /**
   * The link to download the document.
   */
  @JsonProperty("link")
  private final String link;

  /**
   * Constructor for DocumentDownloadLinkPostResponse.
   *
   * @param link The link to download the document.
   */
  public DocumentDownloadLinkPostResponse(@JsonProperty("link") String link) {
    this.link = link;
  }

  /**
   * This method is used to get the link to download the document.
   *
   * @return String This returns the link to download the document.
   */
  public String getLink() {
    return this.link;
  }
}
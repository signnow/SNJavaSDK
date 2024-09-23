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

@JsonIgnoreProperties(ignoreUnknown = true)
public class DocumentDownloadLinkPostResponse {

  @JsonProperty("link")
  private final String link;

  public DocumentDownloadLinkPostResponse(@JsonProperty("link") String link) {
    this.link = link;
  }

  public String getLink() {
    return this.link;
  }
}

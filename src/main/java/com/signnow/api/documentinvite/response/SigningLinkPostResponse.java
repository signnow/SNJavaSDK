/*
 * This file is a part of signNow SDK API client.
 *
 * (с) Copyright © 2011-present airSlate Inc. (https://www.signnow.com)
 *
 * For more details on copyright, see LICENSE.md file
 * that was distributed with this source code.
 */

package com.signnow.api.documentinvite.response;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class SigningLinkPostResponse {

  @JsonProperty("url")
  private final String url;

  @JsonProperty("url_no_signup")
  private final String urlNoSignup;

  public SigningLinkPostResponse(
      @JsonProperty("url") String url, @JsonProperty("url_no_signup") String urlNoSignup) {
    this.url = url;
    this.urlNoSignup = urlNoSignup;
  }

  public String getUrl() {
    return this.url;
  }

  public String getUrlNoSignup() {
    return this.urlNoSignup;
  }
}

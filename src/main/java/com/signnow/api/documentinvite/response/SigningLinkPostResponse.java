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

/**
 * This class represents the response from a POST request to generate a signing link.
 * It ignores unknown properties in the JSON response.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class SigningLinkPostResponse {

  /**
   * The URL for the signing link.
   */
  @JsonProperty("url")
  private final String url;

  /**
   * The URL for the signing link that does not require signup.
   */
  @JsonProperty("url_no_signup")
  private final String urlNoSignup;

  /**
   * Constructs a new SigningLinkPostResponse with the specified URL and URL that does not require signup.
   *
   * @param url the URL for the signing link
   * @param urlNoSignup the URL for the signing link that does not require signup
   */
  public SigningLinkPostResponse(
      @JsonProperty("url") String url, @JsonProperty("url_no_signup") String urlNoSignup) {
    this.url = url;
    this.urlNoSignup = urlNoSignup;
  }

  /**
   * Returns the URL for the signing link.
   *
   * @return the URL for the signing link
   */
  public String getUrl() {
    return this.url;
  }

  /**
   * Returns the URL for the signing link that does not require signup.
   *
   * @return the URL for the signing link that does not require signup
   */
  public String getUrlNoSignup() {
    return this.urlNoSignup;
  }
}
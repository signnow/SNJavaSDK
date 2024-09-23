/*
 * This file is a part of signNow SDK API client.
 *
 * (с) Copyright © 2011-present airSlate Inc. (https://www.signnow.com)
 *
 * For more details on copyright, see LICENSE.md file
 * that was distributed with this source code.
 */

package com.signnow.api.auth.response;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class TokenGetResponse {

  @JsonProperty("access_token")
  private final String accessToken;

  @JsonProperty("scope")
  private final String scope;

  @JsonProperty("expires_in")
  private final String expiresIn;

  @JsonProperty("token_type")
  private final String tokenType;

  public TokenGetResponse(
      @JsonProperty("access_token") String accessToken,
      @JsonProperty("scope") String scope,
      @JsonProperty("expires_in") String expiresIn,
      @JsonProperty("token_type") String tokenType) {
    this.accessToken = accessToken;
    this.scope = scope;
    this.expiresIn = expiresIn;
    this.tokenType = tokenType;
  }

  public String getAccessToken() {
    return this.accessToken;
  }

  public String getScope() {
    return this.scope;
  }

  public String getExpiresIn() {
    return this.expiresIn;
  }

  public String getTokenType() {
    return this.tokenType;
  }
}

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
public class RefreshTokenPostResponse {

  @JsonProperty("expires_in")
  private final int expiresIn;

  @JsonProperty("token_type")
  private final String tokenType;

  @JsonProperty("access_token")
  private final String accessToken;

  @JsonProperty("refresh_token")
  private final String refreshToken;

  @JsonProperty("scope")
  private final String scope;

  @JsonProperty("last_login")
  private final int lastLogin;

  public RefreshTokenPostResponse(
      @JsonProperty("expires_in") int expiresIn,
      @JsonProperty("token_type") String tokenType,
      @JsonProperty("access_token") String accessToken,
      @JsonProperty("refresh_token") String refreshToken,
      @JsonProperty("scope") String scope,
      @JsonProperty("last_login") int lastLogin) {
    this.expiresIn = expiresIn;
    this.tokenType = tokenType;
    this.accessToken = accessToken;
    this.refreshToken = refreshToken;
    this.scope = scope;
    this.lastLogin = lastLogin;
  }

  public int getExpiresIn() {
    return this.expiresIn;
  }

  public String getTokenType() {
    return this.tokenType;
  }

  public String getAccessToken() {
    return this.accessToken;
  }

  public String getRefreshToken() {
    return this.refreshToken;
  }

  public String getScope() {
    return this.scope;
  }

  public int getLastLogin() {
    return this.lastLogin;
  }
}

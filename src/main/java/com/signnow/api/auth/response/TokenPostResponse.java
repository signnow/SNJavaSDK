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
public class TokenPostResponse {

  @JsonProperty("expires_in")
  private int expiresIn;

  @JsonProperty("token_type")
  private String tokenType;

  @JsonProperty("access_token")
  private String accessToken;

  @JsonProperty("refresh_token")
  private String refreshToken;

  @JsonProperty("scope")
  private String scope;

  @JsonProperty("last_login")
  private int lastLogin;

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

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

/**
 * This class represents the response received after a token post request.
 * It ignores unknown properties in the JSON response.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class TokenPostResponse {

  /**
   * The time in seconds when the token expires.
   */
  @JsonProperty("expires_in")
  private int expiresIn;

  /**
   * The type of the token.
   */
  @JsonProperty("token_type")
  private String tokenType;

  /**
   * The access token string.
   */
  @JsonProperty("access_token")
  private String accessToken;

  /**
   * The refresh token string.
   */
  @JsonProperty("refresh_token")
  private String refreshToken;

  /**
   * The scope of the token.
   */
  @JsonProperty("scope")
  private String scope;

  /**
   * The last login time in seconds.
   */
  @JsonProperty("last_login")
  private int lastLogin;

  /**
   * Returns the time in seconds when the token expires.
   *
   * @return the time in seconds when the token expires.
   */
  public int getExpiresIn() {
    return this.expiresIn;
  }

  /**
   * Returns the type of the token.
   *
   * @return the type of the token.
   */
  public String getTokenType() {
    return this.tokenType;
  }

  /**
   * Returns the access token string.
   *
   * @return the access token string.
   */
  public String getAccessToken() {
    return this.accessToken;
  }

  /**
   * Returns the refresh token string.
   *
   * @return the refresh token string.
   */
  public String getRefreshToken() {
    return this.refreshToken;
  }

  /**
   * Returns the scope of the token.
   *
   * @return the scope of the token.
   */
  public String getScope() {
    return this.scope;
  }

  /**
   * Returns the last login time in seconds.
   *
   * @return the last login time in seconds.
   */
  public int getLastLogin() {
    return this.lastLogin;
  }
}
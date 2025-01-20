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
 * This class represents the response received after refreshing the token.
 * It ignores unknown properties during deserialization.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class RefreshTokenPostResponse {

  /**
   * The time in seconds when the token expires.
   */
  @JsonProperty("expires_in")
  private final int expiresIn;

  /**
   * The type of the token.
   */
  @JsonProperty("token_type")
  private final String tokenType;

  /**
   * The access token.
   */
  @JsonProperty("access_token")
  private final String accessToken;

  /**
   * The refresh token.
   */
  @JsonProperty("refresh_token")
  private final String refreshToken;

  /**
   * The scope of the token.
   */
  @JsonProperty("scope")
  private final String scope;

  /**
   * The last login time in seconds.
   */
  @JsonProperty("last_login")
  private final int lastLogin;

  /**
   * Constructs a new RefreshTokenPostResponse with the specified values.
   *
   * @param expiresIn the time in seconds when the token expires
   * @param tokenType the type of the token
   * @param accessToken the access token
   * @param refreshToken the refresh token
   * @param scope the scope of the token
   * @param lastLogin the last login time in seconds
   */
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

  /**
   * Returns the time in seconds when the token expires.
   *
   * @return the time in seconds when the token expires
   */
  public int getExpiresIn() {
    return this.expiresIn;
  }

  /**
   * Returns the type of the token.
   *
   * @return the type of the token
   */
  public String getTokenType() {
    return this.tokenType;
  }

  /**
   * Returns the access token.
   *
   * @return the access token
   */
  public String getAccessToken() {
    return this.accessToken;
  }

  /**
   * Returns the refresh token.
   *
   * @return the refresh token
   */
  public String getRefreshToken() {
    return this.refreshToken;
  }

  /**
   * Returns the scope of the token.
   *
   * @return the scope of the token
   */
  public String getScope() {
    return this.scope;
  }

  /**
   * Returns the last login time in seconds.
   *
   * @return the last login time in seconds
   */
  public int getLastLogin() {
    return this.lastLogin;
  }
}
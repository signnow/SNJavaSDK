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
 * This class represents the response received after a token get request.
 * It ignores unknown properties in the JSON response.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class TokenGetResponse {

  /**
   * The access token received in the response.
   */
  @JsonProperty("access_token")
  private final String accessToken;

  /**
   * The scope of the access token.
   */
  @JsonProperty("scope")
  private final String scope;

  /**
   * The time in seconds when the access token expires.
   */
  @JsonProperty("expires_in")
  private final String expiresIn;

  /**
   * The type of the token received.
   */
  @JsonProperty("token_type")
  private final String tokenType;

  /**
   * Constructs a new TokenGetResponse with the specified values.
   *
   * @param accessToken the access token received in the response
   * @param scope the scope of the access token
   * @param expiresIn the time in seconds when the access token expires
   * @param tokenType the type of the token received
   */
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

  /**
   * Returns the access token.
   *
   * @return the access token
   */
  public String getAccessToken() {
    return this.accessToken;
  }

  /**
   * Returns the scope of the access token.
   *
   * @return the scope of the access token
   */
  public String getScope() {
    return this.scope;
  }

  /**
   * Returns the time in seconds when the access token expires.
   *
   * @return the time in seconds when the access token expires
   */
  public String getExpiresIn() {
    return this.expiresIn;
  }

  /**
   * Returns the type of the token received.
   *
   * @return the type of the token received
   */
  public String getTokenType() {
    return this.tokenType;
  }
}
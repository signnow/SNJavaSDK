/*
 * This file is a part of signNow SDK API client.
 *
 * (с) Copyright © 2011-present airSlate Inc. (https://www.signnow.com)
 *
 * For more details on copyright, see LICENSE.md file
 * that was distributed with this source code.
 */

package com.signnow.api.auth.request;

import com.signnow.core.request.ApiEndpoint;
import com.signnow.core.request.RequestInterface;
import java.util.HashMap;
import java.util.Map;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

/**
 * This class represents a request to refresh an access token.
 * It implements the RequestInterface with a String type parameter.
 */
@ApiEndpoint(
    name = "refreshAccessToken",
    url = "/oauth2/token",
    method = "post",
    auth = "basic",
    namespace = "auth",
    entity = "refreshToken",
    type = "application/x-www-form-urlencoded")
public final class RefreshTokenPostRequest implements RequestInterface<String> {

  /**
   * The refresh token.
   */
  private final String refreshToken;

  /**
   * The scope of the request.
   */
  private final String scope;

  /**
   * The expiration time of the token.
   */
  private final String expirationTime;

  /**
   * The grant type of the request.
   */
  private final String grantType;

  /**
   * Constructs a new RefreshTokenPostRequest with the specified parameters.
   *
   * @param refreshToken the refresh token
   * @param scope the scope of the request
   * @param expirationTime the expiration time of the token
   * @param grantType the grant type of the request
   */
  public RefreshTokenPostRequest(
      String refreshToken, String scope, String expirationTime, String grantType) {
    this.refreshToken = refreshToken;
    this.scope = scope;
    this.expirationTime = expirationTime;
    this.grantType = grantType;
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
   * Returns the scope of the request.
   *
   * @return the scope of the request
   */
  public String getScope() {
    return this.scope;
  }

  /**
   * Returns the expiration time of the token.
   *
   * @return the expiration time of the token
   */
  public String getExpirationTime() {
    return this.expirationTime;
  }

  /**
   * Returns the grant type of the request.
   *
   * @return the grant type of the request
   */
  public String getGrantType() {
    return this.grantType;
  }

  /**
   * Returns a new HashMap.
   *
   * @return a new HashMap
   */
  @NotNull
  @Contract(value = " -> new", pure = true)
  @Override
  public HashMap<String, String> uriParams() {
    return new HashMap<>();
  }

  /**
   * Returns a map with the payload of the request.
   *
   * @return a map with the payload of the request
   */
  @NotNull
  public Map<String, String> payload() {
    Map<String, String> map = new HashMap<>();
    map.put("refresh_token", this.getRefreshToken());
    map.put("scope", this.getScope());
    map.put("expiration_time", this.getExpirationTime());
    map.put("grant_type", this.getGrantType());
    return map;
  }
}
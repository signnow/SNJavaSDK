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

@ApiEndpoint(
    name = "refreshAccessToken",
    url = "/oauth2/token",
    method = "post",
    auth = "basic",
    namespace = "auth",
    entity = "refreshToken",
    type = "application/x-www-form-urlencoded")
public final class RefreshTokenPostRequest implements RequestInterface<String> {

  private final String refreshToken;
  private final String scope;
  private final String expirationTime;
  private final String grantType;

  public RefreshTokenPostRequest(
      String refreshToken, String scope, String expirationTime, String grantType) {
    this.refreshToken = refreshToken;
    this.scope = scope;
    this.expirationTime = expirationTime;
    this.grantType = grantType;
  }

  public String getRefreshToken() {
    return this.refreshToken;
  }

  public String getScope() {
    return this.scope;
  }

  public String getExpirationTime() {
    return this.expirationTime;
  }

  public String getGrantType() {
    return this.grantType;
  }

  @NotNull
  @Contract(value = " -> new", pure = true)
  @Override
  public HashMap<String, String> uriParams() {
    return new HashMap<>();
  }

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

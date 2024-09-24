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
    name = "generateAccessToken",
    url = "/oauth2/token",
    method = "post",
    auth = "basic",
    namespace = "auth",
    entity = "token",
    type = "application/x-www-form-urlencoded")
public final class TokenPostRequest implements RequestInterface<String> {

  private final String user;

  private final String password;

  private final String scope;

  private final String grantType;

  private final String code;

  public TokenPostRequest(
      String user, String password, String scope, String grantType, String code) {
    this.user = user;
    this.password = password;
    this.scope = scope;
    this.grantType = grantType;
    this.code = code;
  }

  public String getUser() {
    return this.user;
  }

  public String getPassword() {
    return this.password;
  }

  public String getScope() {
    return this.scope;
  }

  public String getGrantType() {
    return this.grantType;
  }

  public String getCode() {
    return this.code;
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
    map.put("username", this.getUser());
    map.put("password", this.getPassword());
    map.put("scope", this.getScope());
    map.put("grant_type", this.getGrantType());
    map.put("code", this.getCode());
    return map;
  }
}

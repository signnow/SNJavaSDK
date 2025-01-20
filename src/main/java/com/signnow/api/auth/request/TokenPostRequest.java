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
 * This class represents a request to generate an access token.
 * It implements the RequestInterface with a String type.
 */
@ApiEndpoint(
    name = "generateAccessToken",
    url = "/oauth2/token",
    method = "post",
    auth = "basic",
    namespace = "auth",
    entity = "token",
    type = "application/x-www-form-urlencoded")
public final class TokenPostRequest implements RequestInterface<String> {

  /**
   * The username of the user.
   */
  private final String user;

  /**
   * The password of the user.
   */
  private final String password;

  /**
   * The scope of the request.
   */
  private final String scope;

  /**
   * The grant type of the request.
   */
  private final String grantType;

  /**
   * The code of the request.
   */
  private final String code;

  /**
   * Constructs a new TokenPostRequest with the specified user, password, scope, grant type, and code.
   *
   * @param user the username of the user
   * @param password the password of the user
   * @param scope the scope of the request
   * @param grantType the grant type of the request
   * @param code the code of the request
   */
  public TokenPostRequest(
      String user, String password, String scope, String grantType, String code) {
    this.user = user;
    this.password = password;
    this.scope = scope;
    this.grantType = grantType;
    this.code = code;
  }

  /**
   * Returns the username of the user.
   *
   * @return the username of the user
   */
  public String getUser() {
    return this.user;
  }

  /**
   * Returns the password of the user.
   *
   * @return the password of the user
   */
  public String getPassword() {
    return this.password;
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
   * Returns the grant type of the request.
   *
   * @return the grant type of the request
   */
  public String getGrantType() {
    return this.grantType;
  }

  /**
   * Returns the code of the request.
   *
   * @return the code of the request
   */
  public String getCode() {
    return this.code;
  }

  /**
   * Returns a new HashMap with no parameters.
   *
   * @return a new HashMap with no parameters
   */
  @NotNull
  @Contract(value = " -> new", pure = true)
  @Override
  public HashMap<String, String> uriParams() {
    return new HashMap<>();
  }

  /**
   * Returns a Map with the payload of the request.
   *
   * @return a Map with the payload of the request
   */
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

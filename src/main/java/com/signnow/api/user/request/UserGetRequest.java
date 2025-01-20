/*
 * This file is a part of signNow SDK API client.
 *
 * (с) Copyright © 2011-present airSlate Inc. (https://www.signnow.com)
 *
 * For more details on copyright, see LICENSE.md file
 * that was distributed with this source code.
 */

package com.signnow.api.user.request;

import com.signnow.core.request.ApiEndpoint;
import com.signnow.core.request.RequestInterface;
import java.util.HashMap;
import java.util.Map;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

/**
 * This class represents a user get request.
 * It is used to get user information from the server.
 * The request is sent to the "/user" endpoint using the "get" method.
 * The request requires "bearer" authentication.
 * The namespace and entity for this request are both "user".
 * The type of the request is "application/json".
 */
@ApiEndpoint(
    name = "getUserInfo",
    url = "/user",
    method = "get",
    auth = "bearer",
    namespace = "user",
    entity = "user",
    type = "application/json")
public final class UserGetRequest implements RequestInterface<String> {

  /**
   * This method is used to get the URI parameters for the request.
   * It returns an empty HashMap as there are no URI parameters for this request.
   *
   * @return a new HashMap with no entries
   */
  @NotNull
  @Contract(value = " -> new", pure = true)
  @Override
  public HashMap<String, String> uriParams() {
    return new HashMap<>();
  }

  /**
   * This method is used to get the payload for the request.
   * It returns an empty Map as there is no payload for this request.
   *
   * @return a new Map with no entries
   */
  @NotNull
  @Override
  public Map<String, String> payload() {
    return new HashMap<>();
  }
}
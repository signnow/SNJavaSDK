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
 * This class represents a request to get a token.
 * It implements the RequestInterface with a String type parameter.
 * The API endpoint for this request is "/oauth2/token".
 */
@ApiEndpoint(
    name = "verifyAccessToken",
    url = "/oauth2/token",
    method = "get",
    auth = "bearer",
    namespace = "auth",
    entity = "token",
    type = "application/json")
public final class TokenGetRequest implements RequestInterface<String> {

  /**
   * This method is used to get the URI parameters for the request.
   * It returns an empty HashMap as there are no URI parameters for this request.
   *
   * @return HashMap&lt;String, String&gt; This returns an empty HashMap.
   */
  @NotNull
  @Contract(value = " -> new", pure = true)
  @Override
  public HashMap<String, String> uriParams() {
    return new HashMap<>();
  }

  /**
   * This method is used to get the payload for the request.
   * It returns an empty HashMap as there is no payload for this request.
   *
   * @return Map&lt;String, String&gt; This returns an empty HashMap.
   */
  @NotNull
  @Override
  public Map<String, String> payload() {
    return new HashMap<>();
  }
}

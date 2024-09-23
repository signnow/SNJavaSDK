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

@ApiEndpoint(
    name = "getUserInitials",
    url = "/user/initial",
    method = "get",
    auth = "bearer",
    namespace = "User",
    entity = "initial",
    type = "application/json")
public final class InitialGetRequest implements RequestInterface<String> {

  @NotNull
  @Contract(value = " -> new", pure = true)
  @Override
  public HashMap<String, String> uriParams() {
    return new HashMap<>();
  }

  @NotNull
  @Override
  public Map<String, String> payload() {
    return new HashMap<>();
  }
}

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
    name = "resetPassword",
    url = "/user/forgotpassword",
    method = "post",
    auth = "basic",
    namespace = "user",
    entity = "resetPassword",
    type = "application/json")
public final class ResetPasswordPostRequest implements RequestInterface<String> {

  private final String email;

  public ResetPasswordPostRequest(String email) {
    this.email = email;
  }

  public String getEmail() {
    return this.email;
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
    map.put("email", this.getEmail());
    return map;
  }
}

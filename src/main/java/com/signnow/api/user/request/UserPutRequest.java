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
    name = "updateUser",
    url = "/user",
    method = "put",
    auth = "bearer",
    namespace = "user",
    entity = "user",
    type = "application/json")
public final class UserPutRequest implements RequestInterface<String> {

  private final String firstName;

  private final String lastName;

  private final String password;

  private final String oldPassword;

  private final String logoutAll;

  public UserPutRequest(
      String firstName, String lastName, String password, String oldPassword, String logoutAll) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.password = password;
    this.oldPassword = oldPassword;
    this.logoutAll = logoutAll;
  }

  public String getFirstName() {
    return this.firstName;
  }

  public String getLastName() {
    return this.lastName;
  }

  public String getPassword() {
    return this.password;
  }

  public String getOldPassword() {
    return this.oldPassword;
  }

  public String getLogoutAll() {
    return this.logoutAll;
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
    map.put("first_name", this.getFirstName());
    map.put("last_name", this.getLastName());
    map.put("password", this.getPassword());
    map.put("old_password", this.getOldPassword());
    map.put("logout_all", this.getLogoutAll());
    return map;
  }
}

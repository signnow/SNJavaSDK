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
    name = "createUser",
    url = "/user",
    method = "post",
    auth = "basic",
    namespace = "user",
    entity = "user",
    type = "application/json")
public final class UserPostRequest implements RequestInterface<String> {

  private final String email;

  private final String password;

  private final String firstName;

  private final String lastName;

  private final String number;

  public UserPostRequest(
      String email, String password, String firstName, String lastName, String number) {
    this.email = email;
    this.password = password;
    this.firstName = firstName;
    this.lastName = lastName;
    this.number = number;
  }

  public String getEmail() {
    return this.email;
  }

  public String getPassword() {
    return this.password;
  }

  public String getFirstName() {
    return this.firstName;
  }

  public String getLastName() {
    return this.lastName;
  }

  public String getNumber() {
    return this.number;
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
    map.put("password", this.getPassword());
    map.put("first_name", this.getFirstName());
    map.put("last_name", this.getLastName());
    map.put("number", this.getNumber());
    return map;
  }
}

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
 * API endpoint for resetting password.
 * The endpoint is defined by the following attributes:
 * name = "resetPassword",
 * url = "/user/forgotpassword",
 * method = "post",
 * auth = "basic",
 * namespace = "user",
 * entity = "resetPassword",
 * type = "application/json"
 */
@ApiEndpoint(
    name = "resetPassword",
    url = "/user/forgotpassword",
    method = "post",
    auth = "basic",
    namespace = "user",
    entity = "resetPassword",
    type = "application/json")
public final class ResetPasswordPostRequest implements RequestInterface<String> {

  /**
   * The email of the user who wants to reset the password.
   */
  private final String email;

  /**
   * Constructs a new ResetPasswordPostRequest with the specified email.
   *
   * @param email the email of the user who wants to reset the password
   */
  public ResetPasswordPostRequest(String email) {
    this.email = email;
  }

  /**
   * Returns the email of the user who wants to reset the password.
   *
   * @return the email of the user
   */
  public String getEmail() {
    return this.email;
  }

  /**
   * Returns an empty HashMap. This method is required by the RequestInterface.
   *
   * @return an empty HashMap
   */
  @NotNull
  @Contract(value = " -> new", pure = true)
  @Override
  public HashMap<String, String> uriParams() {
    return new HashMap<>();
  }

  /**
   * Returns a Map with the email of the user who wants to reset the password.
   *
   * @return a Map with the email of the user
   */
  @NotNull
  public Map<String, String> payload() {
    Map<String, String> map = new HashMap<>();
    map.put("email", this.getEmail());
    return map;
  }
}
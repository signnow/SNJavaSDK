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
 * This class represents a user update request.
 * It is used to send a PUT request to the /user endpoint.
 */
@ApiEndpoint(
    name = "updateUser",
    url = "/user",
    method = "put",
    auth = "bearer",
    namespace = "user",
    entity = "user",
    type = "application/json")
public final class UserPutRequest implements RequestInterface<String> {

  /**
   * The first name of the user.
   */
  private final String firstName;

  /**
   * The last name of the user.
   */
  private final String lastName;

  /**
   * The new password of the user.
   */
  private final String password;

  /**
   * The old password of the user.
   */
  private final String oldPassword;

  /**
   * The logout all flag of the user.
   */
  private final String logoutAll;

  /**
   * Constructs a new UserPutRequest.
   *
   * @param firstName the first name of the user
   * @param lastName the last name of the user
   * @param password the new password of the user
   * @param oldPassword the old password of the user
   * @param logoutAll the logout all flag of the user
   */
  public UserPutRequest(
      String firstName, String lastName, String password, String oldPassword, String logoutAll) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.password = password;
    this.oldPassword = oldPassword;
    this.logoutAll = logoutAll;
  }

  /**
   * Returns the first name of the user.
   *
   * @return the first name of the user
   */
  public String getFirstName() {
    return this.firstName;
  }

  /**
   * Returns the last name of the user.
   *
   * @return the last name of the user
   */
  public String getLastName() {
    return this.lastName;
  }

  /**
   * Returns the new password of the user.
   *
   * @return the new password of the user
   */
  public String getPassword() {
    return this.password;
  }

  /**
   * Returns the old password of the user.
   *
   * @return the old password of the user
   */
  public String getOldPassword() {
    return this.oldPassword;
  }

  /**
   * Returns the logout all flag of the user.
   *
   * @return the logout all flag of the user
   */
  public String getLogoutAll() {
    return this.logoutAll;
  }

  /**
   * Returns an empty map of URI parameters.
   *
   * @return an empty map of URI parameters
   */
  @NotNull
  @Contract(value = " -> new", pure = true)
  @Override
  public HashMap<String, String> uriParams() {
    return new HashMap<>();
  }

  /**
   * Returns a map of payload parameters.
   *
   * @return a map of payload parameters
   */
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
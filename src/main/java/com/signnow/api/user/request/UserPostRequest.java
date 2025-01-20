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
 * This class represents a user post request.
 * It is used to create a new user.
 */
@ApiEndpoint(
    name = "createUser",
    url = "/user",
    method = "post",
    auth = "basic",
    namespace = "user",
    entity = "user",
    type = "application/json")
public final class UserPostRequest implements RequestInterface<String> {

  /**
   * The email of the user.
   */
  private final String email;

  /**
   * The password of the user.
   */
  private final String password;

  /**
   * The first name of the user.
   */
  private final String firstName;

  /**
   * The last name of the user.
   */
  private final String lastName;

  /**
   * The number of the user.
   */
  private final String number;

  /**
   * Constructs a new UserPostRequest with the specified email, password, first name, last name, and number.
   *
   * @param email the email of the user
   * @param password the password of the user
   * @param firstName the first name of the user
   * @param lastName the last name of the user
   * @param number the number of the user
   */
  public UserPostRequest(
      String email, String password, String firstName, String lastName, String number) {
    this.email = email;
    this.password = password;
    this.firstName = firstName;
    this.lastName = lastName;
    this.number = number;
  }

  /**
   * Returns the email of the user.
   *
   * @return the email of the user
   */
  public String getEmail() {
    return this.email;
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
   * Returns the number of the user.
   *
   * @return the number of the user
   */
  public String getNumber() {
    return this.number;
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
   * Returns a map with the user's details as the payload.
   *
   * @return a map with the user's details as the payload
   */
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

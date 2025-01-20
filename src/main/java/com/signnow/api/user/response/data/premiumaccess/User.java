/*
 * This file is a part of signNow SDK API client.
 *
 * (с) Copyright © 2011-present airSlate Inc. (https://www.signnow.com)
 *
 * For more details on copyright, see LICENSE.md file
 * that was distributed with this source code.
 */

package com.signnow.api.user.response.data.premiumaccess;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.signnow.core.data.ApiData;
import java.util.LinkedHashMap;
import java.util.Map;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

/**
 * User class extends ApiData.
 * Represents a user with premium access in the system.
 */
public final class User extends ApiData {

  /**
   * The username of the user.
   */
  @JsonProperty("username")
  private final String username;

  /**
   * The email of the user.
   */
  @JsonProperty("email")
  private final String email;

  /**
   * The date the user was added.
   */
  @JsonProperty("added_date")
  private final int addedDate;

  /**
   * The status of the user.
   */
  @JsonProperty("status")
  private final String status;

  /**
   * The admin status of the user.
   */
  @JsonProperty("admin")
  private final String admin;

  /**
   * The first name of the user.
   */
  @JsonProperty("first_name")
  private final String firstName;

  /**
   * The last name of the user.
   */
  @JsonProperty("last_name")
  private final String lastName;

  /**
   * Constructor for User class.
   *
   * @param username  The username of the user.
   * @param email     The email of the user.
   * @param addedDate The date the user was added.
   * @param status    The status of the user.
   * @param admin     The admin status of the user.
   * @param firstName The first name of the user.
   * @param lastName  The last name of the user.
   */
  @JsonCreator
  public User(
      @JsonProperty("username") String username,
      @JsonProperty("email") String email,
      @JsonProperty("added_date") int addedDate,
      @JsonProperty("status") String status,
      @JsonProperty("admin") String admin,
      @JsonProperty("first_name") String firstName,
      @JsonProperty("last_name") String lastName) {
    this.username = username;
    this.email = email;
    this.addedDate = addedDate;
    this.status = status;
    this.admin = admin;
    this.firstName = firstName;
    this.lastName = lastName;
  }

  /**
   * @return The username of the user.
   */
  public String getUsername() {
    return this.username;
  }

  /**
   * @return The email of the user.
   */
  public String getEmail() {
    return this.email;
  }

  /**
   * @return The first name of the user.
   */
  public String getFirstName() {
    return this.firstName;
  }

  /**
   * @return The last name of the user.
   */
  public String getLastName() {
    return this.lastName;
  }

  /**
   * @return The date the user was added.
   */
  public int getAddedDate() {
    return this.addedDate;
  }

  /**
   * @return The status of the user.
   */
  public String getStatus() {
    return this.status;
  }

  /**
   * @return The admin status of the user.
   */
  public String getAdmin() {
    return this.admin;
  }

  /**
   * Converts the User object to a Map.
   *
   * @return A map representation of the User object.
   */
  @NotNull
  @Override
  public Map<String, Object> toMap() {
    Map<String, Object> map = new LinkedHashMap<>();
    map.put("username", this.getUsername());
    map.put("email", this.getEmail());
    map.put("first_name", this.getFirstName());
    map.put("last_name", this.getLastName());
    map.put("added_date", this.getAddedDate());
    map.put("status", this.getStatus());
    map.put("admin", this.getAdmin());
    return map;
  }

  /**
   * Creates a User object from a Map.
   *
   * @param data The map containing the user data.
   * @return A new User object.
   */
  @NotNull
  @Contract("_ -> new")
  public static User fromMap(@NotNull Map<String, Object> data) {
    return new User(
        (String) data.get("username"),
        (String) data.get("email"),
        (Integer) data.get("added_date"),
        (String) data.get("status"),
        (String) data.get("admin"),
        (String) data.getOrDefault("first_name", ""),
        (String) data.getOrDefault("last_name", ""));
  }
}
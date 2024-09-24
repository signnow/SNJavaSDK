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

public final class User extends ApiData {

  @JsonProperty("username")
  private final String username;

  @JsonProperty("email")
  private final String email;

  @JsonProperty("added_date")
  private final int addedDate;

  @JsonProperty("status")
  private final String status;

  @JsonProperty("admin")
  private final String admin;

  @JsonProperty("first_name")
  private final String firstName;

  @JsonProperty("last_name")
  private final String lastName;

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

  public String getUsername() {
    return this.username;
  }

  public String getEmail() {
    return this.email;
  }

  public String getFirstName() {
    return this.firstName;
  }

  public String getLastName() {
    return this.lastName;
  }

  public int getAddedDate() {
    return this.addedDate;
  }

  public String getStatus() {
    return this.status;
  }

  public String getAdmin() {
    return this.admin;
  }

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

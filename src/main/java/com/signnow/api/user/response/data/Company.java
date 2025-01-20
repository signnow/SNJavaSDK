/*
 * This file is a part of signNow SDK API client.
 *
 * (с) Copyright © 2011-present airSlate Inc. (https://www.signnow.com)
 *
 * For more details on copyright, see LICENSE.md file
 * that was distributed with this source code.
 */

package com.signnow.api.user.response.data;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.signnow.core.data.ApiData;
import java.util.LinkedHashMap;
import java.util.Map;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

/**
 * This class represents a Company with its name and access level.
 */
public final class Company extends ApiData {

  /**
   * The name of the company.
   */
  @JsonProperty("name")
  private final String name;

  /**
   * The access level of the company.
   */
  @JsonProperty("full_access")
  private final boolean fullAccess;

  /**
   * Constructs a new Company with the specified name and access level.
   *
   * @param name the name of the company
   * @param fullAccess the access level of the company
   */
  @JsonCreator
  public Company(
      @JsonProperty("name") String name, @JsonProperty("full_access") boolean fullAccess) {
    this.name = name;
    this.fullAccess = fullAccess;
  }

  /**
   * Returns the name of the company.
   *
   * @return the name of the company
   */
  public String getName() {
    return this.name;
  }

  /**
   * Returns the access level of the company.
   *
   * @return the access level of the company
   */
  public boolean isFullAccess() {
    return this.fullAccess;
  }

  /**
   * Returns a map representation of the company.
   *
   * @return a map representation of the company
   */
  @NotNull
  @Override
  public Map<String, Object> toMap() {
    Map<String, Object> map = new LinkedHashMap<>();
    map.put("name", this.getName());
    map.put("full_access", this.isFullAccess());
    return map;
  }

  /**
   * Returns a new Company object created from the specified map.
   *
   * @param data the map containing the company data
   * @return a new Company object created from the specified map
   */
  @NotNull
  @Contract("_ -> new")
  public static Company fromMap(@NotNull Map<String, Object> data) {
    return new Company(
        (String) data.getOrDefault("name", ""), (Boolean) data.getOrDefault("full_access", false));
  }
}
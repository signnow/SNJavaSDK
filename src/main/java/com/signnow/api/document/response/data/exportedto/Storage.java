/*
 * This file is a part of signNow SDK API client.
 *
 * (с) Copyright © 2011-present airSlate Inc. (https://www.signnow.com)
 *
 * For more details on copyright, see LICENSE.md file
 * that was distributed with this source code.
 */

package com.signnow.api.document.response.data.exportedto;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.signnow.core.data.ApiData;
import java.util.LinkedHashMap;
import java.util.Map;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

/**
 * This class represents the storage data of the API.
 */
public final class Storage extends ApiData {

  /**
   * Represents the active status of the storage.
   */
  @JsonProperty("is_active")
  private final boolean isActive;

  /**
   * Represents the account associated with the storage.
   */
  @JsonProperty("account")
  private final String account;

  /**
   * Constructor for the Storage class.
   *
   * @param isActive the active status of the storage.
   * @param account the account associated with the storage.
   */
  @JsonCreator
  public Storage(
      @JsonProperty("is_active") boolean isActive, @JsonProperty("account") String account) {
    this.isActive = isActive;
    this.account = account;
  }

  /**
   * Returns the active status of the storage.
   *
   * @return the active status of the storage.
   */
  public boolean isActive() {
    return this.isActive;
  }

  /**
   * Returns the account associated with the storage.
   *
   * @return the account associated with the storage.
   */
  public String getAccount() {
    return this.account;
  }

  /**
   * Converts the storage data to a map.
   *
   * @return a map containing the storage data.
   */
  @NotNull
  @Override
  public Map<String, Object> toMap() {
    Map<String, Object> map = new LinkedHashMap<>();
    map.put("is_active", this.isActive());
    map.put("account", this.getAccount());
    return map;
  }

  /**
   * Creates a new Storage object from a map.
   *
   * @param data a map containing the storage data.
   * @return a new Storage object.
   */
  @NotNull
  @Contract("_ -> new")
  public static Storage fromMap(@NotNull Map<String, Object> data) {
    return new Storage(
        (boolean) data.getOrDefault("is_active", false), (String) data.getOrDefault("account", ""));
  }
}
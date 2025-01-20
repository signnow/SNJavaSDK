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
 * This class represents the API data for a user.
 */
public final class Api extends ApiData {

  /**
   * The key of the API.
   */
  @JsonProperty("key")
  private final String key;

  /**
   * The creation time of the API.
   */
  @JsonProperty("created_at")
  private final int createdAt;

  /**
   * The expiration time of the API.
   */
  @JsonProperty("expired_at")
  private final int expiredAt;

  /**
   * The level of the API.
   */
  @JsonProperty("level")
  private final String level;

  /**
   * Constructs an API object with the specified key, creation time, expiration time, and level.
   *
   * @param key the key of the API
   * @param createdAt the creation time of the API
   * @param expiredAt the expiration time of the API
   * @param level the level of the API
   */
  @JsonCreator
  public Api(
      @JsonProperty("key") String key,
      @JsonProperty("created_at") int createdAt,
      @JsonProperty("expired_at") int expiredAt,
      @JsonProperty("level") String level) {
    this.key = key;
    this.createdAt = createdAt;
    this.expiredAt = expiredAt;
    this.level = level;
  }

  /**
   * Returns the key of this API.
   *
   * @return the key of this API
   */
  public String getKey() {
    return this.key;
  }

  /**
   * Returns the creation time of this API.
   *
   * @return the creation time of this API
   */
  public int getCreatedAt() {
    return this.createdAt;
  }

  /**
   * Returns the expiration time of this API.
   *
   * @return the expiration time of this API
   */
  public int getExpiredAt() {
    return this.expiredAt;
  }

  /**
   * Returns the level of this API.
   *
   * @return the level of this API
   */
  public String getLevel() {
    return this.level;
  }

  /**
   * Returns a map representation of this API.
   *
   * @return a map representation of this API
   */
  @NotNull
  @Override
  public Map<String, Object> toMap() {
    Map<String, Object> map = new LinkedHashMap<>();
    map.put("key", this.getKey());
    map.put("created_at", this.getCreatedAt());
    map.put("expired_at", this.getExpiredAt());
    map.put("level", this.getLevel());
    return map;
  }

  /**
   * Returns an API object created from the specified map.
   *
   * @param data the map to create the API object from
   * @return an API object created from the specified map
   */
  @NotNull
  @Contract("_ -> new")
  public static Api fromMap(@NotNull Map<String, Object> data) {
    return new Api(
        (String) data.get("key"),
        (Integer) data.get("created_at"),
        (Integer) data.get("expired_at"),
        (String) data.get("level"));
  }
}
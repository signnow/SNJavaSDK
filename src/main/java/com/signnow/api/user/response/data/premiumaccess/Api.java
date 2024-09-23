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

public final class Api extends ApiData {

  @JsonProperty("key")
  private final String key;

  @JsonProperty("created_at")
  private final int createdAt;

  @JsonProperty("expired_at")
  private final int expiredAt;

  @JsonProperty("level")
  private final String level;

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

  public String getKey() {
    return this.key;
  }

  public int getCreatedAt() {
    return this.createdAt;
  }

  public int getExpiredAt() {
    return this.expiredAt;
  }

  public String getLevel() {
    return this.level;
  }

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

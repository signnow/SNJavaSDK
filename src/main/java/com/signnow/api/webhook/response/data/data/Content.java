/*
 * This file is a part of signNow SDK API client.
 *
 * (с) Copyright © 2011-present airSlate Inc. (https://www.signnow.com)
 *
 * For more details on copyright, see LICENSE.md file
 * that was distributed with this source code.
 */

package com.signnow.api.webhook.response.data.data;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.signnow.core.data.ApiData;
import java.util.LinkedHashMap;
import java.util.Map;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

public final class Content extends ApiData {

  @JsonProperty("key")
  private final String key;

  @JsonProperty("key1")
  private final String key1;

  @JsonProperty("key2")
  private final String key2;

  @JsonProperty("account_id")
  private final String accountId;

  @JsonProperty("source")
  private final String source;

  @JsonCreator
  public Content(
      @JsonProperty("key") String key,
      @JsonProperty("key1") String key1,
      @JsonProperty("key2") String key2,
      @JsonProperty("account_id") String accountId,
      @JsonProperty("source") String source) {
    this.key = key;
    this.key1 = key1;
    this.key2 = key2;
    this.accountId = accountId;
    this.source = source;
  }

  public String getKey() {
    return this.key;
  }

  public String getKey1() {
    return this.key1;
  }

  public String getKey2() {
    return this.key2;
  }

  public String getAccountId() {
    return this.accountId;
  }

  public String getSource() {
    return this.source;
  }

  @NotNull
  @Override
  public Map<String, Object> toMap() {
    Map<String, Object> map = new LinkedHashMap<>();
    map.put("key", this.getKey());
    map.put("key1", this.getKey1());
    map.put("key2", this.getKey2());
    map.put("account_id", this.getAccountId());
    map.put("source", this.getSource());
    return map;
  }

  @NotNull
  @Contract("_ -> new")
  public static Content fromMap(@NotNull Map<String, Object> data) {
    return new Content(
        (String) data.getOrDefault("key", ""),
        (String) data.getOrDefault("key1", ""),
        (String) data.getOrDefault("key2", ""),
        (String) data.getOrDefault("account_id", ""),
        (String) data.getOrDefault("source", ""));
  }
}

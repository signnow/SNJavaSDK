/*
 * This file is a part of signNow SDK API client.
 *
 * (с) Copyright © 2011-present airSlate Inc. (https://www.signnow.com)
 *
 * For more details on copyright, see LICENSE.md file
 * that was distributed with this source code.
 */

package com.signnow.api.document.response.data;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.signnow.core.data.ApiData;
import java.util.LinkedHashMap;
import java.util.Map;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

public final class Insert extends ApiData {

  @JsonProperty("id")
  private final String id;

  @JsonProperty("location")
  private final String location;

  @JsonProperty("email")
  private final String email;

  @JsonProperty("transaction_id")
  private final String transactionId;

  @JsonCreator
  public Insert(
      @JsonProperty("id") String id,
      @JsonProperty("location") String location,
      @JsonProperty("email") String email,
      @JsonProperty("transaction_id") String transactionId) {
    this.id = id;
    this.location = location;
    this.email = email;
    this.transactionId = transactionId;
  }

  public String getId() {
    return this.id;
  }

  public String getLocation() {
    return this.location;
  }

  public String getEmail() {
    return this.email;
  }

  public String getTransactionId() {
    return this.transactionId;
  }

  @NotNull
  @Override
  public Map<String, Object> toMap() {
    Map<String, Object> map = new LinkedHashMap<>();
    map.put("id", this.getId());
    map.put("location", this.getLocation());
    map.put("email", this.getEmail());
    map.put("transaction_id", this.getTransactionId());
    return map;
  }

  @NotNull
  @Contract("_ -> new")
  public static Insert fromMap(@NotNull Map<String, Object> data) {
    return new Insert(
        (String) data.get("id"),
        (String) data.get("location"),
        (String) data.getOrDefault("email", ""),
        (String) data.getOrDefault("transaction_id", null));
  }
}

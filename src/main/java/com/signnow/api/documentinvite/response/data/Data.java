/*
 * This file is a part of signNow SDK API client.
 *
 * (с) Copyright © 2011-present airSlate Inc. (https://www.signnow.com)
 *
 * For more details on copyright, see LICENSE.md file
 * that was distributed with this source code.
 */

package com.signnow.api.documentinvite.response.data;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.signnow.core.data.ApiData;
import java.util.LinkedHashMap;
import java.util.Map;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

public final class Data extends ApiData {

  @JsonProperty("id")
  private final String id;

  @JsonProperty("status")
  private final String status;

  @JsonProperty("created")
  private final int created;

  @JsonProperty("email")
  private final String email;

  @JsonCreator
  public Data(
      @JsonProperty("id") String id,
      @JsonProperty("status") String status,
      @JsonProperty("created") int created,
      @JsonProperty("email") String email) {
    this.id = id;
    this.status = status;
    this.created = created;
    this.email = email;
  }

  public String getId() {
    return this.id;
  }

  public String getStatus() {
    return this.status;
  }

  public int getCreated() {
    return this.created;
  }

  public String getEmail() {
    return this.email;
  }

  @NotNull
  @Override
  public Map<String, Object> toMap() {
    Map<String, Object> map = new LinkedHashMap<>();
    map.put("id", this.getId());
    map.put("status", this.getStatus());
    map.put("created", this.getCreated());
    map.put("email", this.getEmail());
    return map;
  }

  @NotNull
  @Contract("_ -> new")
  public static Data fromMap(@NotNull Map<String, Object> data) {
    return new Data(
        (String) data.get("id"),
        (String) data.get("status"),
        (Integer) data.get("created"),
        (String) data.get("email"));
  }
}

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

public final class Integration extends ApiData {

  @JsonProperty("id")
  private final String id;

  @JsonProperty("integration_id")
  private final String integrationId;

  @JsonProperty("data")
  private final String data;

  @JsonCreator
  public Integration(
      @JsonProperty("id") String id,
      @JsonProperty("integration_id") String integrationId,
      @JsonProperty("data") String data) {
    this.id = id;
    this.integrationId = integrationId;
    this.data = data;
  }

  public String getId() {
    return this.id;
  }

  public String getIntegrationId() {
    return this.integrationId;
  }

  public String getData() {
    return this.data;
  }

  @NotNull
  @Override
  public Map<String, Object> toMap() {
    Map<String, Object> map = new LinkedHashMap<>();
    map.put("id", this.getId());
    map.put("integration_id", this.getIntegrationId());
    map.put("data", this.getData());
    return map;
  }

  @NotNull
  @Contract("_ -> new")
  public static Integration fromMap(@NotNull Map<String, Object> data) {
    return new Integration(
        (String) data.get("id"),
        (String) data.getOrDefault("integration_id", null),
        (String) data.getOrDefault("data", ""));
  }
}

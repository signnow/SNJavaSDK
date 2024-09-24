/*
 * This file is a part of signNow SDK API client.
 *
 * (с) Copyright © 2011-present airSlate Inc. (https://www.signnow.com)
 *
 * For more details on copyright, see LICENSE.md file
 * that was distributed with this source code.
 */

package com.signnow.api.document.request.data;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.signnow.core.data.ApiData;
import java.util.LinkedHashMap;
import java.util.Map;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

public final class DeactivateElement extends ApiData {

  @JsonProperty("type")
  private final String type;

  @JsonProperty("unique_id")
  private final String uniqueId;

  @JsonCreator
  public DeactivateElement(
      @JsonProperty("type") String type, @JsonProperty("unique_id") String uniqueId) {
    this.type = type;
    this.uniqueId = uniqueId;
  }

  public String getType() {
    return this.type;
  }

  public String getUniqueId() {
    return this.uniqueId;
  }

  @NotNull
  @Override
  public Map<String, Object> toMap() {
    Map<String, Object> map = new LinkedHashMap<>();
    map.put("type", this.getType());
    map.put("unique_id", this.getUniqueId());
    return map;
  }

  @NotNull
  @Contract("_ -> new")
  public static DeactivateElement fromMap(@NotNull Map<String, Object> data) {
    return new DeactivateElement((String) data.get("type"), (String) data.get("unique_id"));
  }
}

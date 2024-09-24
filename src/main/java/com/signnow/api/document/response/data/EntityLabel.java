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

public final class EntityLabel extends ApiData {

  @JsonProperty("label_name")
  private final String labelName;

  @JsonProperty("is_system")
  private final boolean isSystem;

  @JsonProperty("updated")
  private final String updated;

  @JsonCreator
  public EntityLabel(
      @JsonProperty("label_name") String labelName,
      @JsonProperty("is_system") boolean isSystem,
      @JsonProperty("updated") String updated) {
    this.labelName = labelName;
    this.isSystem = isSystem;
    this.updated = updated;
  }

  public String getLabelName() {
    return this.labelName;
  }

  public boolean isSystem() {
    return this.isSystem;
  }

  public String getUpdated() {
    return this.updated;
  }

  @NotNull
  @Override
  public Map<String, Object> toMap() {
    Map<String, Object> map = new LinkedHashMap<>();
    map.put("label_name", this.getLabelName());
    map.put("is_system", this.isSystem());
    map.put("updated", this.getUpdated());
    return map;
  }

  @NotNull
  @Contract("_ -> new")
  public static EntityLabel fromMap(@NotNull Map<String, Object> data) {
    return new EntityLabel(
        (String) data.get("label_name"),
        (Boolean) data.get("is_system"),
        (String) data.get("updated"));
  }
}

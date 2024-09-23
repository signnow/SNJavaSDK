/*
 * This file is a part of signNow SDK API client.
 *
 * (с) Copyright © 2011-present airSlate Inc. (https://www.signnow.com)
 *
 * For more details on copyright, see LICENSE.md file
 * that was distributed with this source code.
 */

package com.signnow.api.template.request.data;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.signnow.core.data.ApiData;
import java.util.LinkedHashMap;
import java.util.Map;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

public final class TemplateDataObjectPut extends ApiData {

  @JsonProperty("name")
  private final String name;

  @JsonProperty("role_id")
  private final String roleId;

  @JsonCreator
  public TemplateDataObjectPut(
      @JsonProperty("name") String name, @JsonProperty("role_id") String roleId) {
    this.name = name;
    this.roleId = roleId;
  }

  public String getName() {
    return this.name;
  }

  public String getRoleId() {
    return this.roleId;
  }

  @NotNull
  @Override
  public Map<String, Object> toMap() {
    Map<String, Object> map = new LinkedHashMap<>();
    map.put("name", this.getName());
    map.put("role_id", this.getRoleId());
    return map;
  }

  @NotNull
  @Contract("_ -> new")
  public static TemplateDataObjectPut fromMap(@NotNull Map<String, Object> data) {
    return new TemplateDataObjectPut(
        (String) data.getOrDefault("name", null), (String) data.getOrDefault("role_id", null));
  }
}

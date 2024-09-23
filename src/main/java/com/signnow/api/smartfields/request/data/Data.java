/*
 * This file is a part of signNow SDK API client.
 *
 * (с) Copyright © 2011-present airSlate Inc. (https://www.signnow.com)
 *
 * For more details on copyright, see LICENSE.md file
 * that was distributed with this source code.
 */

package com.signnow.api.smartfields.request.data;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.signnow.core.data.ApiData;
import java.util.LinkedHashMap;
import java.util.Map;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

public final class Data extends ApiData {

  @JsonProperty("field_name")
  private final String fieldName;

  @JsonCreator
  public Data(@JsonProperty("field_name") String fieldName) {
    this.fieldName = fieldName;
  }

  public String getFieldName() {
    return this.fieldName;
  }

  @NotNull
  @Override
  public Map<String, Object> toMap() {
    Map<String, Object> map = new LinkedHashMap<>();
    map.put("field_name", this.getFieldName());
    return map;
  }

  @NotNull
  @Contract("_ -> new")
  public static Data fromMap(@NotNull Map<String, Object> data) {
    return new Data((String) data.getOrDefault("field_name", ""));
  }
}
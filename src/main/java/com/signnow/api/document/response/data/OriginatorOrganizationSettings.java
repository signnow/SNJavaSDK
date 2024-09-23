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

public final class OriginatorOrganizationSettings extends ApiData {

  @JsonProperty("setting")
  private final String setting;

  @JsonProperty("value")
  private final String value;

  @JsonCreator
  public OriginatorOrganizationSettings(
      @JsonProperty("setting") String setting, @JsonProperty("value") String value) {
    this.setting = setting;
    this.value = value;
  }

  public String getSetting() {
    return this.setting;
  }

  public String getValue() {
    return this.value;
  }

  @NotNull
  @Override
  public Map<String, Object> toMap() {
    Map<String, Object> map = new LinkedHashMap<>();
    map.put("setting", this.getSetting());
    map.put("value", this.getValue());
    return map;
  }

  @NotNull
  @Contract("_ -> new")
  public static OriginatorOrganizationSettings fromMap(@NotNull Map<String, Object> data) {
    return new OriginatorOrganizationSettings(
        (String) data.get("setting"), (String) data.get("value"));
  }
}

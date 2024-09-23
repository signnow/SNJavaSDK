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

public final class DisplayJsonAttribute extends ApiData {

  @JsonProperty("web_short_name")
  private final String webShortName;

  @JsonProperty("web_description")
  private final String webDescription;

  @JsonProperty("common")
  private final boolean common;

  @JsonProperty("disabled")
  private final boolean disabled;

  @JsonProperty("date_time_field_order")
  private final Integer dateTimeFieldOrder;

  @JsonProperty("text_field_order")
  private final Integer textFieldOrder;

  @JsonProperty("web_locale_key")
  private final String webLocaleKey;

  @JsonCreator
  public DisplayJsonAttribute(
      @JsonProperty("web_short_name") String webShortName,
      @JsonProperty("web_description") String webDescription,
      @JsonProperty("common") boolean common,
      @JsonProperty("disabled") boolean disabled,
      @JsonProperty("date_time_field_order") Integer dateTimeFieldOrder,
      @JsonProperty("text_field_order") Integer textFieldOrder,
      @JsonProperty("web_locale_key") String webLocaleKey) {
    this.webShortName = webShortName;
    this.webDescription = webDescription;
    this.common = common;
    this.disabled = disabled;
    this.dateTimeFieldOrder = dateTimeFieldOrder;
    this.textFieldOrder = textFieldOrder;
    this.webLocaleKey = webLocaleKey;
  }

  @NotNull
  @Contract("_ -> new")
  public static DisplayJsonAttribute fromMap(@NotNull Map<String, Object> data) {
    return new DisplayJsonAttribute(
        (String) data.get("web_short_name"),
        (String) data.get("web_description"),
        (Boolean) data.get("common"),
        (Boolean) data.get("disabled"),
        (Integer) data.getOrDefault("date_time_field_order", null),
        (Integer) data.getOrDefault("text_field_order", null),
        (String) data.getOrDefault("web_locale_key", ""));
  }

  public String getWebShortName() {
    return this.webShortName;
  }

  public String getWebDescription() {
    return this.webDescription;
  }

  public boolean isCommon() {
    return this.common;
  }

  public boolean isDisabled() {
    return this.disabled;
  }

  public Integer getDateTimeFieldOrder() {
    return this.dateTimeFieldOrder;
  }

  public Integer getTextFieldOrder() {
    return this.textFieldOrder;
  }

  public String getWebLocaleKey() {
    return this.webLocaleKey;
  }

  @NotNull
  @Override
  public Map<String, Object> toMap() {
    Map<String, Object> map = new LinkedHashMap<>();
    map.put("web_short_name", this.getWebShortName());
    map.put("web_description", this.getWebDescription());
    map.put("common", this.isCommon());
    map.put("disabled", this.isDisabled());
    map.put("date_time_field_order", this.getDateTimeFieldOrder());
    map.put("text_field_order", this.getTextFieldOrder());
    map.put("web_locale_key", this.getWebLocaleKey());
    return map;
  }
}

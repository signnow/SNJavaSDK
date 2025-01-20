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

/**
 * This class represents the JSON attributes for display.
 */
public final class DisplayJsonAttribute extends ApiData {

  /**
   * The short name for web.
   */
  @JsonProperty("web_short_name")
  private final String webShortName;

  /**
   * The description for web.
   */
  @JsonProperty("web_description")
  private final String webDescription;

  /**
   * The common property.
   */
  @JsonProperty("common")
  private final boolean common;

  /**
   * The disabled property.
   */
  @JsonProperty("disabled")
  private final boolean disabled;

  /**
   * The order of date time field.
   */
  @JsonProperty("date_time_field_order")
  private final Integer dateTimeFieldOrder;

  /**
   * The order of text field.
   */
  @JsonProperty("text_field_order")
  private final Integer textFieldOrder;

  /**
   * The locale key for web.
   */
  @JsonProperty("web_locale_key")
  private final String webLocaleKey;

  /**
   * Constructor for DisplayJsonAttribute.
   *
   * @param webShortName the short name for web
   * @param webDescription the description for web
   * @param common the common property
   * @param disabled the disabled property
   * @param dateTimeFieldOrder the order of date time field
   * @param textFieldOrder the order of text field
   * @param webLocaleKey the locale key for web
   */
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

  /**
   * Creates a new DisplayJsonAttribute from a map.
   *
   * @param data the map containing the data
   * @return a new DisplayJsonAttribute
   */
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

  /**
   * Returns the web short name.
   *
   * @return the web short name
   */
  public String getWebShortName() {
    return this.webShortName;
  }

  /**
   * Returns the web description.
   *
   * @return the web description
   */
  public String getWebDescription() {
    return this.webDescription;
  }

  /**
   * Returns whether it is common or not.
   *
   * @return true if it is common, false otherwise
   */
  public boolean isCommon() {
    return this.common;
  }

  /**
   * Returns whether it is disabled or not.
   *
   * @return true if it is disabled, false otherwise
   */
  public boolean isDisabled() {
    return this.disabled;
  }

  /**
   * Returns the date time field order.
   *
   * @return the date time field order
   */
  public Integer getDateTimeFieldOrder() {
    return this.dateTimeFieldOrder;
  }

  /**
   * Returns the text field order.
   *
   * @return the text field order
   */
  public Integer getTextFieldOrder() {
    return this.textFieldOrder;
  }

  /**
   * Returns the web locale key.
   *
   * @return the web locale key
   */
  public String getWebLocaleKey() {
    return this.webLocaleKey;
  }

  /**
   * Converts this object to a map.
   *
   * @return a map representing this object
   */
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
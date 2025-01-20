/*
 * This file is a part of signNow SDK API client.
 *
 * (с) Copyright © 2011-present airSlate Inc. (https://www.signnow.com)
 *
 * For more details on copyright, see LICENSE.md file
 * that was distributed with this source code.
 */

package com.signnow.api.user.response.data;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.signnow.core.data.ApiData;
import java.util.LinkedHashMap;
import java.util.Map;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

/**
 * This class represents the settings of an organization.
 */
public final class OrganizationSettings extends ApiData {

  /**
   * The setting of the organization.
   */
  @JsonProperty("setting")
  private final String setting;

  /**
   * The value of the setting.
   */
  @JsonProperty("value")
  private final String value;

  /**
   * Constructs an OrganizationSettings object with the specified setting and value.
   *
   * @param setting the setting of the organization
   * @param value the value of the setting
   */
  @JsonCreator
  public OrganizationSettings(
      @JsonProperty("setting") String setting, @JsonProperty("value") String value) {
    this.setting = setting;
    this.value = value;
  }

  /**
   * Returns the setting of the organization.
   *
   * @return the setting of the organization
   */
  public String getSetting() {
    return this.setting;
  }

  /**
   * Returns the value of the setting.
   *
   * @return the value of the setting
   */
  public String getValue() {
    return this.value;
  }

  /**
   * Converts this OrganizationSettings object to a Map.
   *
   * @return a Map representing this OrganizationSettings object
   */
  @NotNull
  @Override
  public Map<String, Object> toMap() {
    Map<String, Object> map = new LinkedHashMap<>();
    map.put("setting", this.getSetting());
    map.put("value", this.getValue());
    return map;
  }

  /**
   * Constructs an OrganizationSettings object from the specified Map.
   *
   * @param data a Map containing the data to construct an OrganizationSettings object
   * @return an OrganizationSettings object constructed from the specified Map
   */
  @NotNull
  @Contract("_ -> new")
  public static OrganizationSettings fromMap(@NotNull Map<String, Object> data) {
    return new OrganizationSettings((String) data.get("setting"), (String) data.get("value"));
  }
}
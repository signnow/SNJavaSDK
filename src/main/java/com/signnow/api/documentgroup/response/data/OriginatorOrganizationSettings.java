/*
 * This file is a part of signNow SDK API client.
 *
 * (с) Copyright © 2011-present airSlate Inc. (https://www.signnow.com)
 *
 * For more details on copyright, see LICENSE.md file
 * that was distributed with this source code.
 */

package com.signnow.api.documentgroup.response.data;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.signnow.core.data.ApiData;
import java.util.LinkedHashMap;
import java.util.Map;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

/**
 * This class represents the settings of the originator organization.
 */
public final class OriginatorOrganizationSettings extends ApiData {

  /**
   * The setting of the originator organization.
   */
  @JsonProperty("setting")
  private final String setting;

  /**
   * The value of the setting.
   */
  @JsonProperty("value")
  private final String value;

  /**
   * Constructs a new OriginatorOrganizationSettings with the specified setting and value.
   *
   * @param setting the setting of the originator organization
   * @param value the value of the setting
   */
  @JsonCreator
  public OriginatorOrganizationSettings(
      @JsonProperty("setting") String setting, @JsonProperty("value") String value) {
    this.setting = setting;
    this.value = value;
  }

  /**
   * Returns the setting of the originator organization.
   *
   * @return the setting of the originator organization
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
   * Returns a map representation of this OriginatorOrganizationSettings.
   *
   * @return a map representation of this OriginatorOrganizationSettings
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
   * Returns a new OriginatorOrganizationSettings created from the specified map.
   *
   * @param data the map from which to create the OriginatorOrganizationSettings
   * @return a new OriginatorOrganizationSettings created from the specified map
   */
  @NotNull
  @Contract("_ -> new")
  public static OriginatorOrganizationSettings fromMap(@NotNull Map<String, Object> data) {
    return new OriginatorOrganizationSettings(
        (String) data.get("setting"), (String) data.get("value"));
  }
}
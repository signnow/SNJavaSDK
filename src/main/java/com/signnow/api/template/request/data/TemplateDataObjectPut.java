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

/**
 * This class represents a template data object for a PUT request.
 */
public final class TemplateDataObjectPut extends ApiData {

  /**
   * The name of the template.
   */
  @JsonProperty("name")
  private final String name;

  /**
   * The role ID associated with the template.
   */
  @JsonProperty("role_id")
  private final String roleId;

  /**
   * Constructs a new TemplateDataObjectPut with the specified name and role ID.
   *
   * @param name the name of the template
   * @param roleId the role ID associated with the template
   */
  @JsonCreator
  public TemplateDataObjectPut(
      @JsonProperty("name") String name, @JsonProperty("role_id") String roleId) {
    this.name = name;
    this.roleId = roleId;
  }

  /**
   * Returns the name of the template.
   *
   * @return the name of the template
   */
  public String getName() {
    return this.name;
  }

  /**
   * Returns the role ID associated with the template.
   *
   * @return the role ID associated with the template
   */
  public String getRoleId() {
    return this.roleId;
  }

  /**
   * Converts this object to a map.
   *
   * @return a map representation of this object
   */
  @NotNull
  @Override
  public Map<String, Object> toMap() {
    Map<String, Object> map = new LinkedHashMap<>();
    map.put("name", this.getName());
    map.put("role_id", this.getRoleId());
    return map;
  }

  /**
   * Creates a new TemplateDataObjectPut from the specified map.
   *
   * @param data the map to create the TemplateDataObjectPut from
   * @return a new TemplateDataObjectPut created from the specified map
   */
  @NotNull
  @Contract("_ -> new")
  public static TemplateDataObjectPut fromMap(@NotNull Map<String, Object> data) {
    return new TemplateDataObjectPut(
        (String) data.getOrDefault("name", null), (String) data.getOrDefault("role_id", null));
  }
}
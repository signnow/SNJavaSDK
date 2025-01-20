/*
 * This file is a part of signNow SDK API client.
 *
 * (с) Copyright © 2011-present airSlate Inc. (https://www.signnow.com)
 *
 * For more details on copyright, see LICENSE.md file
 * that was distributed with this source code.
 */

package com.signnow.api.folder.response.data.document;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.signnow.core.data.ApiData;
import java.util.LinkedHashMap;
import java.util.Map;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

/**
 * This class represents a Field in the signNow API.
 */
public final class Field extends ApiData {

  /**
   * The id of the field.
   */
  @JsonProperty("id")
  private final String id;

  /**
   * The type of the field.
   */
  @JsonProperty("type")
  private final String type;

  /**
   * The role id associated with the field.
   */
  @JsonProperty("role_id")
  private final String roleId;

  /**
   * The json attributes of the field.
   */
  @JsonProperty("json_attributes")
  private final JsonAttribute jsonAttributes;

  /**
   * The role associated with the field.
   */
  @JsonProperty("role")
  private final String role;

  /**
   * The originator of the field.
   */
  @JsonProperty("originator")
  private final String originator;

  /**
   * The template field id of the field.
   */
  @JsonProperty("template_field_id")
  private final String templateFieldId;

  /**
   * The field id of the field.
   */
  @JsonProperty("field_id")
  private final String fieldId;

  /**
   * The fulfiller of the field.
   */
  @JsonProperty("fulfiller")
  private final String fulfiller;

  /**
   * The field request id of the field.
   */
  @JsonProperty("field_request_id")
  private final String fieldRequestId;

  /**
   * The element id of the field.
   */
  @JsonProperty("element_id")
  private final String elementId;

  /**
   * Constructor for the Field class.
   *
   * @param id The id of the field.
   * @param type The type of the field.
   * @param roleId The role id associated with the field.
   * @param jsonAttributes The json attributes of the field.
   * @param role The role associated with the field.
   * @param originator The originator of the field.
   * @param templateFieldId The template field id of the field.
   * @param fieldId The field id of the field.
   * @param fulfiller The fulfiller of the field.
   * @param fieldRequestId The field request id of the field.
   * @param elementId The element id of the field.
   */
  @JsonCreator
  public Field(
      @JsonProperty("id") String id,
      @JsonProperty("type") String type,
      @JsonProperty("role_id") String roleId,
      @JsonProperty("json_attributes") JsonAttribute jsonAttributes,
      @JsonProperty("role") String role,
      @JsonProperty("originator") String originator,
      @JsonProperty("template_field_id") String templateFieldId,
      @JsonProperty("field_id") String fieldId,
      @JsonProperty("fulfiller") String fulfiller,
      @JsonProperty("field_request_id") String fieldRequestId,
      @JsonProperty("element_id") String elementId) {
    this.id = id;
    this.type = type;
    this.roleId = roleId;
    this.jsonAttributes = jsonAttributes;
    this.role = role;
    this.originator = originator;
    this.templateFieldId = templateFieldId;
    this.fieldId = fieldId;
    this.fulfiller = fulfiller;
    this.fieldRequestId = fieldRequestId;
    this.elementId = elementId;
  }

  /**
   * @return The id of the field.
   */
  public String getId() {
    return this.id;
  }

  /**
   * @return The type of the field.
   */
  public String getType() {
    return this.type;
  }

  /**
   * @return The role id associated with the field.
   */
  public String getRoleId() {
    return this.roleId;
  }

  /**
   * @return The json attributes of the field.
   */
  public JsonAttribute getJsonAttributes() {
    return this.jsonAttributes;
  }

  /**
   * @return The role associated with the field.
   */
  public String getRole() {
    return this.role;
  }

  /**
   * @return The originator of the field.
   */
  public String getOriginator() {
    return this.originator;
  }

  /**
   * @return The fulfiller of the field.
   */
  public String getFulfiller() {
    return this.fulfiller;
  }

  /**
   * @return The field request id of the field.
   */
  public String getFieldRequestId() {
    return this.fieldRequestId;
  }

  /**
   * @return The element id of the field.
   */
  public String getElementId() {
    return this.elementId;
  }

  /**
   * @return The template field id of the field.
   */
  public String getTemplateFieldId() {
    return this.templateFieldId;
  }

  /**
   * @return The field id of the field.
   */
  public String getFieldId() {
    return this.fieldId;
  }

  /**
   * Converts the field to a map.
   *
   * @return A map representation of the field.
   */
  @NotNull
  @Override
  public Map<String, Object> toMap() {
    Map<String, Object> map = new LinkedHashMap<>();
    map.put("id", this.getId());
    map.put("type", this.getType());
    map.put("role_id", this.getRoleId());
    map.put("json_attributes", this.getJsonAttributes());
    map.put("role", this.getRole());
    map.put("originator", this.getOriginator());
    map.put("fulfiller", this.getFulfiller());
    map.put("field_request_id", this.getFieldRequestId());
    map.put("element_id", this.getElementId());
    map.put("template_field_id", this.getTemplateFieldId());
    map.put("field_id", this.getFieldId());
    return map;
  }

  /**
   * Creates a new Field from a map.
   *
   * @param data The map to create the Field from.
   * @return A new Field created from the map.
   */
  @NotNull
  @Contract("_ -> new")
  public static Field fromMap(@NotNull Map<String, Object> data) {
    return new Field(
        (String) data.get("id"),
        (String) data.get("type"),
        (String) data.get("role_id"),
        JsonAttribute.fromMap((Map<String, Object>) data.get("json_attributes")),
        (String) data.get("role"),
        (String) data.get("originator"),
        (String) data.get("template_field_id"),
        (String) data.get("field_id"),
        (String) data.get("fulfiller"),
        (String) data.get("field_request_id"),
        (String) data.get("element_id"));
  }
}
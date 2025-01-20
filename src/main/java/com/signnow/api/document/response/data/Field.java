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
 * This class represents a Field in the signNow API.
 */
public final class Field extends ApiData {

  /**
   * The unique identifier of the field.
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
   * The JSON attributes of the field.
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
   * The fulfiller of the field.
   */
  @JsonProperty("fulfiller")
  private final String fulfiller;

  /**
   * The request id of the field.
   */
  @JsonProperty("field_request_id")
  private final String fieldRequestId;

  /**
   * The status of the field request.
   */
  @JsonProperty("field_request_canceled")
  private final String fieldRequestCanceled;

  /**
   * The element id of the field.
   */
  @JsonProperty("element_id")
  private final String elementId;

  /**
   * The field id.
   */
  @JsonProperty("field_id")
  private final String fieldId;

  /**
   * The template field id.
   */
  @JsonProperty("template_field_id")
  private final String templateFieldId;

  /**
   * Constructor for the Field class.
   *
   * @param id The unique identifier of the field.
   * @param type The type of the field.
   * @param roleId The role id associated with the field.
   * @param jsonAttributes The JSON attributes of the field.
   * @param role The role associated with the field.
   * @param originator The originator of the field.
   * @param fulfiller The fulfiller of the field.
   * @param fieldRequestId The request id of the field.
   * @param fieldRequestCanceled The status of the field request.
   * @param elementId The element id of the field.
   * @param fieldId The field id.
   * @param templateFieldId The template field id.
   */
  @JsonCreator
  public Field(
      @JsonProperty("id") String id,
      @JsonProperty("type") String type,
      @JsonProperty("role_id") String roleId,
      @JsonProperty("json_attributes") JsonAttribute jsonAttributes,
      @JsonProperty("role") String role,
      @JsonProperty("originator") String originator,
      @JsonProperty("fulfiller") String fulfiller,
      @JsonProperty("field_request_id") String fieldRequestId,
      @JsonProperty("field_request_canceled") String fieldRequestCanceled,
      @JsonProperty("element_id") String elementId,
      @JsonProperty("field_id") String fieldId,
      @JsonProperty("template_field_id") String templateFieldId) {
    this.id = id;
    this.type = type;
    this.roleId = roleId;
    this.jsonAttributes = jsonAttributes;
    this.role = role;
    this.originator = originator;
    this.fulfiller = fulfiller;
    this.fieldRequestId = fieldRequestId;
    this.fieldRequestCanceled = fieldRequestCanceled;
    this.elementId = elementId;
    this.fieldId = fieldId;
    this.templateFieldId = templateFieldId;
  }

  /**
   * Returns the id of the field.
   *
   * @return The id of the field.
   */
  public String getId() {
    return this.id;
  }

  /**
   * Returns the type of the field.
   *
   * @return The type of the field.
   */
  public String getType() {
    return this.type;
  }

  /**
   * Returns the role id of the field.
   *
   * @return The role id of the field.
   */
  public String getRoleId() {
    return this.roleId;
  }

  /**
   * Returns the JSON attributes of the field.
   *
   * @return The JSON attributes of the field.
   */
  public JsonAttribute getJsonAttributes() {
    return this.jsonAttributes;
  }

  /**
   * Returns the role of the field.
   *
   * @return The role of the field.
   */
  public String getRole() {
    return this.role;
  }

  /**
   * Returns the originator of the field.
   *
   * @return The originator of the field.
   */
  public String getOriginator() {
    return this.originator;
  }

  /**
   * Returns the fulfiller of the field.
   *
   * @return The fulfiller of the field.
   */
  public String getFulfiller() {
    return this.fulfiller;
  }

  /**
   * Returns the request id of the field.
   *
   * @return The request id of the field.
   */
  public String getFieldRequestId() {
    return this.fieldRequestId;
  }

  /**
   * Returns the status of the field request.
   *
   * @return The status of the field request.
   */
  public String getFieldRequestCanceled() {
    return this.fieldRequestCanceled;
  }

  /**
   * Returns the element id of the field.
   *
   * @return The element id of the field.
   */
  public String getElementId() {
    return this.elementId;
  }

  /**
   * Returns the field id.
   *
   * @return The field id.
   */
  public String getFieldId() {
    return this.fieldId;
  }

  /**
   * Returns the template field id.
   *
   * @return The template field id.
   */
  public String getTemplateFieldId() {
    return this.templateFieldId;
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
    map.put("field_request_canceled", this.getFieldRequestCanceled());
    map.put("element_id", this.getElementId());
    map.put("field_id", this.getFieldId());
    map.put("template_field_id", this.getTemplateFieldId());
    return map;
  }

  /**
   * Creates a new Field object from a map.
   *
   * @param data The map containing the field data.
   * @return A new Field object.
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
        (String) data.getOrDefault("fulfiller", null),
        (String) data.getOrDefault("field_request_id", null),
        (String) data.getOrDefault("field_request_canceled", null),
        (String) data.getOrDefault("element_id", null),
        (String) data.getOrDefault("field_id", null),
        (String) data.getOrDefault("template_field_id", null));
  }
}
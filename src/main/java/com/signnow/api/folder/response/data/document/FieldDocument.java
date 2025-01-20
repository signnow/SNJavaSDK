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
 * This class represents a FieldDocument object.
 */
public final class FieldDocument extends ApiData {

  /**
   * The id of the FieldDocument.
   */
  @JsonProperty("id")
  private final String id;

  /**
   * The type of the FieldDocument.
   */
  @JsonProperty("type")
  private final String type;

  /**
   * The role id of the FieldDocument.
   */
  @JsonProperty("role_id")
  private final String roleId;

  /**
   * The json attributes of the FieldDocument.
   */
  @JsonProperty("json_attributes")
  private final JsonAttribute jsonAttributes;

  /**
   * The role of the FieldDocument.
   */
  @JsonProperty("role")
  private final String role;

  /**
   * The originator of the FieldDocument.
   */
  @JsonProperty("originator")
  private final String originator;

  /**
   * The fulfiller of the FieldDocument.
   */
  @JsonProperty("fulfiller")
  private final String fulfiller;

  /**
   * The field request id of the FieldDocument.
   */
  @JsonProperty("field_request_id")
  private final String fieldRequestId;

  /**
   * The element id of the FieldDocument.
   */
  @JsonProperty("element_id")
  private final String elementId;

  /**
   * The template field id of the FieldDocument.
   */
  @JsonProperty("template_field_id")
  private final String templateFieldId;

  /**
   * The field id of the FieldDocument.
   */
  @JsonProperty("field_id")
  private final String fieldId;

  /**
   * Constructor for FieldDocument.
   *
   * @param id The id of the FieldDocument.
   * @param type The type of the FieldDocument.
   * @param roleId The role id of the FieldDocument.
   * @param jsonAttributes The json attributes of the FieldDocument.
   * @param role The role of the FieldDocument.
   * @param originator The originator of the FieldDocument.
   * @param fulfiller The fulfiller of the FieldDocument.
   * @param fieldRequestId The field request id of the FieldDocument.
   * @param elementId The element id of the FieldDocument.
   * @param templateFieldId The template field id of the FieldDocument.
   * @param fieldId The field id of the FieldDocument.
   */
  @JsonCreator
  public FieldDocument(
      @JsonProperty("id") String id,
      @JsonProperty("type") String type,
      @JsonProperty("role_id") String roleId,
      @JsonProperty("json_attributes") JsonAttribute jsonAttributes,
      @JsonProperty("role") String role,
      @JsonProperty("originator") String originator,
      @JsonProperty("fulfiller") String fulfiller,
      @JsonProperty("field_request_id") String fieldRequestId,
      @JsonProperty("element_id") String elementId,
      @JsonProperty("template_field_id") String templateFieldId,
      @JsonProperty("field_id") String fieldId) {
    this.id = id;
    this.type = type;
    this.roleId = roleId;
    this.jsonAttributes = jsonAttributes;
    this.role = role;
    this.originator = originator;
    this.fulfiller = fulfiller;
    this.fieldRequestId = fieldRequestId;
    this.elementId = elementId;
    this.templateFieldId = templateFieldId;
    this.fieldId = fieldId;
  }

  /**
   * Returns the id of the FieldDocument.
   *
   * @return The id of the FieldDocument.
   */
  public String getId() {
    return this.id;
  }

  /**
   * Returns the type of the FieldDocument.
   *
   * @return The type of the FieldDocument.
   */
  public String getType() {
    return this.type;
  }

  /**
   * Returns the role id of the FieldDocument.
   *
   * @return The role id of the FieldDocument.
   */
  public String getRoleId() {
    return this.roleId;
  }

  /**
   * Returns the json attributes of the FieldDocument.
   *
   * @return The json attributes of the FieldDocument.
   */
  public JsonAttribute getJsonAttributes() {
    return this.jsonAttributes;
  }

  /**
   * Returns the role of the FieldDocument.
   *
   * @return The role of the FieldDocument.
   */
  public String getRole() {
    return this.role;
  }

  /**
   * Returns the originator of the FieldDocument.
   *
   * @return The originator of the FieldDocument.
   */
  public String getOriginator() {
    return this.originator;
  }

  /**
   * Returns the fulfiller of the FieldDocument.
   *
   * @return The fulfiller of the FieldDocument.
   */
  public String getFulfiller() {
    return this.fulfiller;
  }

  /**
   * Returns the field request id of the FieldDocument.
   *
   * @return The field request id of the FieldDocument.
   */
  public String getFieldRequestId() {
    return this.fieldRequestId;
  }

  /**
   * Returns the element id of the FieldDocument.
   *
   * @return The element id of the FieldDocument.
   */
  public String getElementId() {
    return this.elementId;
  }

  /**
   * Returns the template field id of the FieldDocument.
   *
   * @return The template field id of the FieldDocument.
   */
  public String getTemplateFieldId() {
    return this.templateFieldId;
  }

  /**
   * Returns the field id of the FieldDocument.
   *
   * @return The field id of the FieldDocument.
   */
  public String getFieldId() {
    return this.fieldId;
  }

  /**
   * Converts the FieldDocument object to a Map.
   *
   * @return A Map representation of the FieldDocument object.
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
   * Creates a FieldDocument object from a Map.
   *
   * @param data The Map to convert to a FieldDocument object.
   * @return A FieldDocument object.
   */
  @NotNull
  @Contract("_ -> new")
  public static FieldDocument fromMap(@NotNull Map<String, Object> data) {
    return new FieldDocument(
        (String) data.get("id"),
        (String) data.get("type"),
        (String) data.get("role_id"),
        (JsonAttribute) data.get("json_attributes"),
        (String) data.get("role"),
        (String) data.get("originator"),
        (String) data.getOrDefault("fulfiller", null),
        (String) data.getOrDefault("field_request_id", null),
        (String) data.getOrDefault("element_id", null),
        (String) data.getOrDefault("template_field_id", null),
        (String) data.getOrDefault("field_id", null));
  }
}

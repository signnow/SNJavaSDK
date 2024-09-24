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

public final class Field extends ApiData {

  @JsonProperty("id")
  private final String id;

  @JsonProperty("type")
  private final String type;

  @JsonProperty("role_id")
  private final String roleId;

  @JsonProperty("json_attributes")
  private final JsonAttribute jsonAttributes;

  @JsonProperty("role")
  private final String role;

  @JsonProperty("originator")
  private final String originator;

  @JsonProperty("fulfiller")
  private final String fulfiller;

  @JsonProperty("field_request_id")
  private final String fieldRequestId;

  @JsonProperty("field_request_canceled")
  private final String fieldRequestCanceled;

  @JsonProperty("element_id")
  private final String elementId;

  @JsonProperty("field_id")
  private final String fieldId;

  @JsonProperty("template_field_id")
  private final String templateFieldId;

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

  public String getId() {
    return this.id;
  }

  public String getType() {
    return this.type;
  }

  public String getRoleId() {
    return this.roleId;
  }

  public JsonAttribute getJsonAttributes() {
    return this.jsonAttributes;
  }

  public String getRole() {
    return this.role;
  }

  public String getOriginator() {
    return this.originator;
  }

  public String getFulfiller() {
    return this.fulfiller;
  }

  public String getFieldRequestId() {
    return this.fieldRequestId;
  }

  public String getFieldRequestCanceled() {
    return this.fieldRequestCanceled;
  }

  public String getElementId() {
    return this.elementId;
  }

  public String getFieldId() {
    return this.fieldId;
  }

  public String getTemplateFieldId() {
    return this.templateFieldId;
  }

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

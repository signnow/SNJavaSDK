/*
 * This file is a part of signNow SDK API client.
 *
 * (с) Copyright © 2011-present airSlate Inc. (https://www.signnow.com)
 *
 * For more details on copyright, see LICENSE.md file
 * that was distributed with this source code.
 */

package com.signnow.api.documentfield.request.data;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.HashMap;
import java.util.Map;

/**
 * This class represents a Field with a name and prefilled text.
 */
public final class Field {

  /**
   * The name of the field.
   */
  @JsonProperty("field_name")
  private final String fieldName;

  /**
   * The prefilled text of the field.
   */
  @JsonProperty("prefilled_text")
  private final String prefilledText;

  /**
   * Constructs a new Field with the specified name and prefilled text.
   *
   * @param fieldName the name of the field
   * @param prefilledText the prefilled text of the field
   */
  @JsonCreator
  public Field(
          @JsonProperty("field_name") String fieldName,
          @JsonProperty("prefilled_text") String prefilledText) {
    this.fieldName = fieldName;
    this.prefilledText = prefilledText;
  }

  /**
   * Returns the name of the field.
   *
   * @return the name of the field
   */
  public String getFieldName() {
    return fieldName;
  }

  /**
   * Returns the prefilled text of the field.
   *
   * @return the prefilled text of the field
   */
  public String getPrefilledText() {
    return prefilledText;
  }

  /**
   * Converts this Field to a Map with keys "field_name" and "prefilled_text".
   *
   * @return a Map representation of this Field
   */
  public Map<String, String> toMap() {
    Map<String, String> map = new HashMap<>();
    map.put("field_name", this.getFieldName());
    map.put("prefilled_text", this.getPrefilledText());
    return map;
  }

  /**
   * Constructs a new Field from the specified Map.
   * The Map must contain keys "field_name" and "prefilled_text".
   *
   * @param data the Map to convert to a Field
   * @return a new Field constructed from the specified Map
   */
  public static Field fromMap(Map<String, String> data) {
    return new Field(data.get("field_name"), data.get("prefilled_text"));
  }
}
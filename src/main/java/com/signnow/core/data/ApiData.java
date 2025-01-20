/*
 * This file is a part of signNow SDK API client.
 *
 * (с) Copyright © 2011-present airSlate Inc. (https://www.signnow.com)
 *
 * For more details on copyright, see LICENSE.md file
 * that was distributed with this source code.
 */

package com.signnow.core.data;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.signnow.core.contract.JsonSerializable;
import com.signnow.core.contract.Mappable;
import com.signnow.core.util.Cast;
import java.lang.reflect.Field;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Abstract class ApiData that implements JsonSerializable and Mappable interfaces.
 */
public abstract class ApiData implements JsonSerializable, Mappable {
  /**
   * Constructs an empty {@code ApiData}.
   */
  public ApiData() {
  }

  /**
   * Converts the object to a Map.
   * 
   * @return a Map with the object's fields as keys and their values as map values.
   */
  public Map<String, Object> toMap() {
    Map<String, Object> map = new LinkedHashMap<>();

    Field[] fields = this.getClass().getDeclaredFields();
    for (Field field : fields) {
      field.setAccessible(true);
      try {
        String snakeCase = field.getName().replaceAll("([a-z])([A-Z]+)", "$1_$2").toLowerCase();
        Object value = field.get(this);
        if (value instanceof Mappable) {
          Map<?, ?> nestedMap = ((Mappable) value).toMap();
          map.put(snakeCase, nestedMap);
          continue;
        }
        map.put(snakeCase, value);
      } catch (IllegalAccessException ignored) {
      }
    }
    Cast.clearEmpties(map);
    return map;
  }

  /**
   * Overrides the toString method to return the JSON representation of the object.
   * 
   * @return a JSON string representation of the object.
   */
  @Override
  public String toString() {
    return this.toJson();
  }

  /**
   * Converts the object to a JSON string.
   * 
   * @return a JSON string representation of the object. If an error occurs during conversion, returns an empty JSON object string.
   */
  public String toJson() {
    ObjectMapper objectMapper = new ObjectMapper();
    objectMapper.setVisibility(
        objectMapper
            .getSerializationConfig()
            .getDefaultVisibilityChecker()
            .withIsGetterVisibility(JsonAutoDetect.Visibility.NONE));
    try {
      var map = this.toMap();
      Cast.clearEmpties(map);
      return objectMapper.writeValueAsString(map);
    } catch (Exception e) {
      return "{}";
    }
  }
}
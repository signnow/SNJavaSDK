/*
 * This file is a part of signNow SDK API client.
 *
 * (с) Copyright © 2011-present airSlate Inc. (https://www.signnow.com)
 *
 * For more details on copyright, see LICENSE.md file
 * that was distributed with this source code.
 */

package com.signnow.mock.expectation;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.signnow.core.util.Cast;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/**
 * This class represents expected response's properties, matching those returned by WireMock during
 * the testing phase. This class is ideal for use in comparing response values to verify if a test
 * has passed.
 */
public class Expectation {

  /** The name of expectation. It corresponds with their file name. * */
  private final String name;

  /** Map of response properties expected in testing. * */
  private final LinkedHashMap<String, Object> data;

  public Expectation(String name, LinkedHashMap<String, Object> data) {
    this.name = name;
    this.data = data;
  }

  public String getName() {
    return name;
  }

  /*
   * Allows to use dot notation to get nested data.
   * Examples: emails.0, user.name
   */
  public Object get(String propertyName) {
    String[] parts = propertyName.split("\\.");
    Object value = this.getValue(this.data, parts, 0);

    if (value == null) {
      return null;
    }
    if (value instanceof Number) {
      return value;
    }
    if (value instanceof Boolean) {
      return value;
    }
    if (value instanceof List || value instanceof Map || value.getClass().isArray()) {
      return this.toJson(value);
    }
    return String.valueOf(value);
  }

  /*
   * Recursive method to traverse through maps and arrays
   */
  private Object getValue(Object current, String[] parts, int index) {
    if (index >= parts.length) {
      return null;
    }

    Object value = current;

    if (value instanceof Map) {
      Map<String, Object> map = Cast.safeToMap(value, String.class, Object.class);
      value = map.get(parts[index]);

      if (value != null && index < parts.length - 1) {
        return getValue(value, parts, index + 1);
      }
    } else if (value instanceof List) {
      List<?> list = (List<?>) value;
      int arrayIndex;
      try {
        arrayIndex = Integer.parseInt(parts[index]);
      } catch (NumberFormatException e) {
        return null;
      }

      if (arrayIndex >= 0 && arrayIndex < list.size()) {
        value = list.get(arrayIndex);

        if (index < parts.length - 1) {
          return getValue(value, parts, index + 1);
        }
      } else {
        return null;
      }
    }
    return index == parts.length - 1 ? value : null;
  }

  private String toJson(Object data) {
    ObjectMapper objectMapper = new ObjectMapper();
    try {
      return objectMapper.writeValueAsString(data);
    } catch (Exception e) {
      return null;
    }
  }
}

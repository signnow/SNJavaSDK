/*
 * This file is a part of signNow SDK API client.
 *
 * (с) Copyright © 2011-present airSlate Inc. (https://www.signnow.com)
 *
 * For more details on copyright, see LICENSE.md file
 * that was distributed with this source code.
 */

package com.signnow.api.documentfield.request.data;

import java.util.HashMap;
import java.util.Map;

public final class Field {

  private final String fieldName;

  private final String prefilledText;

  public Field(String fieldName, String prefilledText) {
    this.fieldName = fieldName;
    this.prefilledText = prefilledText;
  }

  public String getFieldName() {
    return fieldName;
  }

  public String getPrefilledText() {
    return prefilledText;
  }

  public Map<String, String> toMap() {
    Map<String, String> map = new HashMap<>();
    map.put("field_name", getFieldName());
    map.put("prefilled_text", getPrefilledText());
    return map;
  }

  public static Field fromMap(Map<String, String> data) {
    return new Field(data.get("field_name"), data.get("prefilled_text"));
  }
}

/*
 * This file is a part of signNow SDK API client.
 *
 * (с) Copyright © 2011-present airSlate Inc. (https://www.signnow.com)
 *
 * For more details on copyright, see LICENSE.md file
 * that was distributed with this source code.
 */

package com.signnow.api.documentinvite.request.data;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.signnow.core.data.ApiData;
import java.util.LinkedHashMap;
import java.util.Map;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

public final class Signature extends ApiData {

  @JsonProperty("type")
  private final String type;

  @JsonCreator
  public Signature(@JsonProperty("type") String type) {
    this.type = type;
  }

  public String getType() {
    return this.type;
  }

  @NotNull
  @Override
  public Map<String, Object> toMap() {
    Map<String, Object> map = new LinkedHashMap<>();
    map.put("type", this.getType());
    return map;
  }

  @NotNull
  @Contract("_ -> new")
  public static Signature fromMap(@NotNull Map<String, Object> data) {
    return new Signature((String) data.get("type"));
  }
}

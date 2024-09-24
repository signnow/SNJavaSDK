/*
 * This file is a part of signNow SDK API client.
 *
 * (с) Copyright © 2011-present airSlate Inc. (https://www.signnow.com)
 *
 * For more details on copyright, see LICENSE.md file
 * that was distributed with this source code.
 */

package com.signnow.api.documentinvite.response.data.meta;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.signnow.core.data.ApiData;
import java.util.LinkedHashMap;
import java.util.Map;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

public class Meta extends ApiData {

  @JsonProperty("pagination")
  private final Pagination pagination;

  @JsonCreator
  Meta(@JsonProperty("pagination") Pagination pagination) {
    this.pagination = pagination;
  }

  public Pagination getPagination() {
    return this.pagination;
  }

  @NotNull
  @Override
  public Map<String, Object> toMap() {
    Map<String, Object> map = new LinkedHashMap<>();
    map.put("pagination", this.getPagination());
    return map;
  }

  @NotNull
  @Contract("_ -> new")
  public static Meta fromMap(Map<String, Object> data) {
    return new Meta((Pagination) data.get("pagination"));
  }
}

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

/**
 * Meta class extends ApiData and represents metadata for a document invite response.
 */
public class Meta extends ApiData {

  /**
   * Pagination details for the document invite response.
   */
  @JsonProperty("pagination")
  private final Pagination pagination;

  /**
   * Constructor for Meta class.
   *
   * @param pagination Pagination details for the document invite response.
   */
  @JsonCreator
  Meta(@JsonProperty("pagination") Pagination pagination) {
    this.pagination = pagination;
  }

  /**
   * Getter for pagination property.
   *
   * @return Pagination details for the document invite response.
   */
  public Pagination getPagination() {
    return this.pagination;
  }

  /**
   * Converts the Meta object to a Map.
   *
   * @return Map representation of the Meta object.
   */
  @NotNull
  @Override
  public Map<String, Object> toMap() {
    Map<String, Object> map = new LinkedHashMap<>();
    map.put("pagination", this.getPagination());
    return map;
  }

  /**
   * Static factory method to create a Meta object from a Map.
   *
   * @param data Map containing the data to populate the Meta object.
   * @return A new Meta object populated with the data from the Map.
   */
  @NotNull
  @Contract("_ -> new")
  public static Meta fromMap(Map<String, Object> data) {
    return new Meta((Pagination) data.get("pagination"));
  }
}
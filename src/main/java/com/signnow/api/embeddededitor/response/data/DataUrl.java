/*
 * This file is a part of signNow SDK API client.
 *
 * (с) Copyright © 2011-present airSlate Inc. (https://www.signnow.com)
 *
 * For more details on copyright, see LICENSE.md file
 * that was distributed with this source code.
 */

package com.signnow.api.embeddededitor.response.data;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.signnow.core.data.ApiData;
import java.util.LinkedHashMap;
import java.util.Map;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

/** Represents a DataUrl object with a URL property. */
public final class DataUrl extends ApiData {

  @JsonProperty("url")
  private final String url;

  /**
   * Constructs a DataUrl instance with the specified URL.
   *
   * @param url the URL string
   */
  @JsonCreator
  public DataUrl(@JsonProperty("url") String url) {
    this.url = url;
  }

  /**
   * Returns the URL string.
   *
   * @return the URL string
   */
  public String getUrl() {
    return this.url;
  }

  /**
   * Converts the DataUrl object to a map representation.
   *
   * @return a map containing the URL
   */
  @NotNull
  @Override
  public Map<String, Object> toMap() {
    Map<String, Object> map = new LinkedHashMap<>();
    map.put("url", this.getUrl());
    return map;
  }

  /**
   * Creates a DataUrl instance from a map representation.
   *
   * @param data the map containing the URL
   * @return a new DataUrl instance
   */
  @NotNull
  @Contract("_ -> new")
  public static DataUrl fromMap(@NotNull Map<String, Object> data) {
    return new DataUrl((String) data.get("url"));
  }
}

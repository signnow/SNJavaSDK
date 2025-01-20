/*
 * This file is a part of signNow SDK API client.
 *
 * (с) Copyright © 2011-present airSlate Inc. (https://www.signnow.com)
 *
 * For more details on copyright, see LICENSE.md file
 * that was distributed with this source code.
 */

package com.signnow.api.embeddedgroupinvite.response.data;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.signnow.core.data.ApiData;
import java.util.LinkedHashMap;
import java.util.Map;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

/**
 * This class represents a DataLink object that extends ApiData.
 */
public final class DataLink extends ApiData {

  /**
   * The link property of the DataLink object.
   */
  @JsonProperty("link")
  private final String link;

  /**
   * This is a constructor for the DataLink class.
   *
   * @param link The link to be set for the DataLink object.
   */
  @JsonCreator
  public DataLink(@JsonProperty("link") String link) {
    this.link = link;
  }

  /**
   * This method returns the link of the DataLink object.
   *
   * @return The link of the DataLink object.
   */
  public String getLink() {
    return this.link;
  }

  /**
   * This method converts the DataLink object to a Map.
   *
   * @return A Map representation of the DataLink object.
   */
  @NotNull
  @Override
  public Map<String, Object> toMap() {
    Map<String, Object> map = new LinkedHashMap<>();
    map.put("link", this.getLink());
    return map;
  }

  /**
   * This method creates a new DataLink object from a Map.
   *
   * @param data The Map to be converted to a DataLink object.
   * @return A new DataLink object.
   */
  @NotNull
  @Contract("_ -> new")
  public static DataLink fromMap(@NotNull Map<String, Object> data) {
    return new DataLink((String) data.get("link"));
  }
}
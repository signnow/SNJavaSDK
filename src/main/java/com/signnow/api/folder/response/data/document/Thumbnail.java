/*
 * This file is a part of signNow SDK API client.
 *
 * (с) Copyright © 2011-present airSlate Inc. (https://www.signnow.com)
 *
 * For more details on copyright, see LICENSE.md file
 * that was distributed with this source code.
 */

package com.signnow.api.folder.response.data.document;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.signnow.core.data.ApiData;
import java.util.LinkedHashMap;
import java.util.Map;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

/**
 * This class represents a Thumbnail object with small, medium, and large properties.
 */
public final class Thumbnail extends ApiData {

  /**
   * The small property of the Thumbnail.
   */
  @JsonProperty("small")
  private final String small;

  /**
   * The medium property of the Thumbnail.
   */
  @JsonProperty("medium")
  private final String medium;

  /**
   * The large property of the Thumbnail.
   */
  @JsonProperty("large")
  private final String large;

  /**
   * Constructs a Thumbnail object with the specified small, medium, and large properties.
   *
   * @param small  the small property of the Thumbnail
   * @param medium the medium property of the Thumbnail
   * @param large  the large property of the Thumbnail
   */
  @JsonCreator
  public Thumbnail(
      @JsonProperty("small") String small,
      @JsonProperty("medium") String medium,
      @JsonProperty("large") String large) {
    this.small = small;
    this.medium = medium;
    this.large = large;
  }

  /**
   * Returns the small property of the Thumbnail.
   *
   * @return the small property of the Thumbnail
   */
  public String getSmall() {
    return this.small;
  }

  /**
   * Returns the medium property of the Thumbnail.
   *
   * @return the medium property of the Thumbnail
   */
  public String getMedium() {
    return this.medium;
  }

  /**
   * Returns the large property of the Thumbnail.
   *
   * @return the large property of the Thumbnail
   */
  public String getLarge() {
    return this.large;
  }

  /**
   * Returns a Map representation of the Thumbnail object.
   *
   * @return a Map with keys "small", "medium", and "large" and corresponding Thumbnail properties as values
   */
  @NotNull
  @Override
  public Map<String, Object> toMap() {
    Map<String, Object> map = new LinkedHashMap<>();
    map.put("small", this.getSmall());
    map.put("medium", this.getMedium());
    map.put("large", this.getLarge());
    return map;
  }

  /**
   * Creates a Thumbnail object from a Map.
   *
   * @param data a Map with keys "small", "medium", and "large" and corresponding Thumbnail properties as values
   * @return a new Thumbnail object with properties set from the Map
   */
  @NotNull
  @Contract("_ -> new")
  public static Thumbnail fromMap(@NotNull Map<String, Object> data) {
    return new Thumbnail(
        (String) data.get("small"), (String) data.get("medium"), (String) data.get("large"));
  }
}
/*
 * This file is a part of signNow SDK API client.
 *
 * (с) Copyright © 2011-present airSlate Inc. (https://www.signnow.com)
 *
 * For more details on copyright, see LICENSE.md file
 * that was distributed with this source code.
 */

package com.signnow.api.documentgroup.response.data.document;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.signnow.core.data.ApiData;
import java.util.LinkedHashMap;
import java.util.Map;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

/**
 * This class represents a Thumbnail object with different sizes.
 */
public final class Thumbnail extends ApiData {

  /**
   * Small size thumbnail URL.
   */
  @JsonProperty("small")
  private final String small;

  /**
   * Medium size thumbnail URL.
   */
  @JsonProperty("medium")
  private final String medium;

  /**
   * Large size thumbnail URL.
   */
  @JsonProperty("large")
  private final String large;

  /**
   * Constructor for Thumbnail class.
   *
   * @param small  URL for small size thumbnail.
   * @param medium URL for medium size thumbnail.
   * @param large  URL for large size thumbnail.
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
   * Getter for small size thumbnail URL.
   *
   * @return URL for small size thumbnail.
   */
  public String getSmall() {
    return this.small;
  }

  /**
   * Getter for medium size thumbnail URL.
   *
   * @return URL for medium size thumbnail.
   */
  public String getMedium() {
    return this.medium;
  }

  /**
   * Getter for large size thumbnail URL.
   *
   * @return URL for large size thumbnail.
   */
  public String getLarge() {
    return this.large;
  }

  /**
   * Converts the Thumbnail object to a Map.
   *
   * @return Map representation of the Thumbnail object.
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
   * @param data Map containing the data for the Thumbnail object.
   * @return New Thumbnail object.
   */
  @NotNull
  @Contract("_ -> new")
  public static Thumbnail fromMap(@NotNull Map<String, Object> data) {
    return new Thumbnail(
        (String) data.get("small"), (String) data.get("medium"), (String) data.get("large"));
  }
}
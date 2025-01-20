/*
 * This file is a part of signNow SDK API client.
 *
 * (с) Copyright © 2011-present airSlate Inc. (https://www.signnow.com)
 *
 * For more details on copyright, see LICENSE.md file
 * that was distributed with this source code.
 */

package com.signnow.api.document.response.data;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.signnow.core.data.ApiData;
import java.util.LinkedHashMap;
import java.util.Map;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

/**
 * This class represents the Size of an object with width and height properties.
 */
public final class Size extends ApiData {

  /**
   * The width of the object.
   */
  @JsonProperty("width")
  private final int width;

  /**
   * The height of the object.
   */
  @JsonProperty("height")
  private final int height;

  /**
   * Constructor for Size class.
   *
   * @param width  The width of the object.
   * @param height The height of the object.
   */
  @JsonCreator
  public Size(@JsonProperty("width") int width, @JsonProperty("height") int height) {
    this.width = width;
    this.height = height;
  }

  /**
   * Returns the width of the object.
   *
   * @return The width of the object.
   */
  public int getWidth() {
    return this.width;
  }

  /**
   * Returns the height of the object.
   *
   * @return The height of the object.
   */
  public int getHeight() {
    return this.height;
  }

  /**
   * Converts the Size object to a Map.
   *
   * @return A Map representation of the Size object.
   */
  @NotNull
  @Override
  public Map<String, Object> toMap() {
    Map<String, Object> map = new LinkedHashMap<>();
    map.put("width", this.getWidth());
    map.put("height", this.getHeight());
    return map;
  }

  /**
   * Creates a Size object from a Map.
   *
   * @param data The Map containing the data for the Size object.
   * @return A new Size object.
   */
  @NotNull
  @Contract("_ -> new")
  public static Size fromMap(@NotNull Map<String, Object> data) {
    return new Size((int) data.get("width"), (int) data.get("height"));
  }
}
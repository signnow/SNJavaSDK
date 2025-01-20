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
import com.signnow.core.util.Cast;
import java.util.LinkedHashMap;
import java.util.Map;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

/**
 * This class represents a Page in the signNow API.
 */
public final class Page extends ApiData {

  /**
   * The source of the page.
   */
  @JsonProperty("src")
  private final String src;

  /**
   * The size of the page.
   */
  @JsonProperty("size")
  private final Size size;

  /**
   * Constructor for the Page class.
   *
   * @param src  The source of the page.
   * @param size The size of the page.
   */
  @JsonCreator
  public Page(@JsonProperty("src") String src, @JsonProperty("size") Size size) {
    this.src = src;
    this.size = size;
  }

  /**
   * Returns the source of the page.
   *
   * @return The source of the page.
   */
  public String getSrc() {
    return this.src;
  }

  /**
   * Returns the size of the page.
   *
   * @return The size of the page.
   */
  public Size getSize() {
    return this.size;
  }

  /**
   * Converts the Page object to a Map.
   *
   * @return A Map representation of the Page object.
   */
  @NotNull
  @Override
  public Map<String, Object> toMap() {
    Map<String, Object> map = new LinkedHashMap<>();
    map.put("src", this.getSrc());
    map.put("size", this.getSize());
    return map;
  }

  /**
   * Creates a Page object from a Map.
   *
   * @param data The Map to convert to a Page object.
   * @return A new Page object.
   */
  @NotNull
  @Contract("_ -> new")
  public static Page fromMap(@NotNull Map<String, Object> data) {
    return new Page(
        (String) data.get("src"),
        Size.fromMap(Cast.safeToMap(data.get("size"), String.class, Object.class)));
  }
}
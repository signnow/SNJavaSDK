/*
 * This file is a part of signNow SDK API client.
 *
 * (с) Copyright © 2011-present airSlate Inc. (https://www.signnow.com)
 *
 * For more details on copyright, see LICENSE.md file
 * that was distributed with this source code.
 */

package com.signnow.api.embeddedinvite.response.data;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.signnow.core.data.ApiData;
import java.util.LinkedHashMap;
import java.util.Map;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

/**
 * This class represents a data link in the signNow API.
 */
public final class DataLink extends ApiData {

  /**
   * The link property of the data link.
   */
  @JsonProperty("link")
  private final String link;

  /**
   * Constructs a new DataLink with the specified link.
   *
   * @param link the link of the data link
   */
  @JsonCreator
  public DataLink(@JsonProperty("link") String link) {
    this.link = link;
  }

  /**
   * Returns the link of this data link.
   *
   * @return the link of this data link
   */
  public String getLink() {
    return this.link;
  }

  /**
   * Converts this data link to a map.
   *
   * @return a map representing this data link
   */
  @NotNull
  @Override
  public Map<String, Object> toMap() {
    Map<String, Object> map = new LinkedHashMap<>();
    map.put("link", this.getLink());
    return map;
  }

  /**
   * Creates a new DataLink from the specified map.
   *
   * @param data the map to create the data link from
   * @return a new DataLink created from the specified map
   */
  @NotNull
  @Contract("_ -> new")
  public static DataLink fromMap(@NotNull Map<String, Object> data) {
    return new DataLink((String) data.get("link"));
  }
}
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

public final class Thumbnail extends ApiData {

  @JsonProperty("small")
  private final String small;

  @JsonProperty("medium")
  private final String medium;

  @JsonProperty("large")
  private final String large;

  @JsonCreator
  public Thumbnail(
      @JsonProperty("small") String small,
      @JsonProperty("medium") String medium,
      @JsonProperty("large") String large) {
    this.small = small;
    this.medium = medium;
    this.large = large;
  }

  public String getSmall() {
    return this.small;
  }

  public String getMedium() {
    return this.medium;
  }

  public String getLarge() {
    return this.large;
  }

  @NotNull
  @Override
  public Map<String, Object> toMap() {
    Map<String, Object> map = new LinkedHashMap<>();
    map.put("small", this.getSmall());
    map.put("medium", this.getMedium());
    map.put("large", this.getLarge());
    return map;
  }

  @NotNull
  @Contract("_ -> new")
  public static Thumbnail fromMap(@NotNull Map<String, Object> data) {
    return new Thumbnail(
        (String) data.get("small"), (String) data.get("medium"), (String) data.get("large"));
  }
}

/*
 * This file is a part of signNow SDK API client.
 *
 * (с) Copyright © 2011-present airSlate Inc. (https://www.signnow.com)
 *
 * For more details on copyright, see LICENSE.md file
 * that was distributed with this source code.
 */

package com.signnow.api.user.response.data;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.signnow.core.data.ApiData;
import java.util.LinkedHashMap;
import java.util.Map;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

public final class ActiveLogo extends ApiData {

  @JsonProperty("id")
  private final String id;

  @JsonProperty("uri")
  private final String uri;

  @JsonCreator
  public ActiveLogo(@JsonProperty("id") String id, @JsonProperty("uri") String uri) {
    this.id = id;
    this.uri = uri;
  }

  public String getId() {
    return this.id;
  }

  public String getUri() {
    return this.uri;
  }

  @NotNull
  @Override
  public Map<String, Object> toMap() {
    Map<String, Object> map = new LinkedHashMap<>();
    map.put("id", this.getId());
    map.put("uri", this.getUri());
    return map;
  }

  @NotNull
  @Contract("_ -> new")
  public static ActiveLogo fromMap(@NotNull Map<String, Object> data) {
    return new ActiveLogo(
        (String) data.getOrDefault("id", null), (String) data.getOrDefault("uri", null));
  }
}

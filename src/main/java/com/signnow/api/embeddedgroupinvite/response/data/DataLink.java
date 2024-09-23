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

public final class DataLink extends ApiData {

  @JsonProperty("link")
  private final String link;

  @JsonCreator
  public DataLink(@JsonProperty("link") String link) {
    this.link = link;
  }

  public String getLink() {
    return this.link;
  }

  @NotNull
  @Override
  public Map<String, Object> toMap() {
    Map<String, Object> map = new LinkedHashMap<>();
    map.put("link", this.getLink());
    return map;
  }

  @NotNull
  @Contract("_ -> new")
  public static DataLink fromMap(@NotNull Map<String, Object> data) {
    return new DataLink((String) data.get("link"));
  }
}

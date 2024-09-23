/*
 * This file is a part of signNow SDK API client.
 *
 * (с) Copyright © 2011-present airSlate Inc. (https://www.signnow.com)
 *
 * For more details on copyright, see LICENSE.md file
 * that was distributed with this source code.
 */

package com.signnow.api.document.response.data.fieldinvite;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.signnow.core.data.ApiData;
import java.util.LinkedHashMap;
import java.util.Map;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

public final class EmailGroup extends ApiData {

  @JsonProperty("id")
  private final String id;

  @JsonProperty("name")
  private final String name;

  @JsonCreator
  public EmailGroup(@JsonProperty("id") String id, @JsonProperty("name") String name) {
    this.id = id;
    this.name = name;
  }

  public String getId() {
    return this.id;
  }

  public String getName() {
    return this.name;
  }

  @NotNull
  @Override
  public Map<String, Object> toMap() {
    Map<String, Object> map = new LinkedHashMap<>();
    map.put("id", this.getId());
    map.put("name", this.getName());
    return map;
  }

  @NotNull
  @Contract("_ -> new")
  public static EmailGroup fromMap(@NotNull Map<String, Object> data) {
    return new EmailGroup(
        (String) data.getOrDefault("id", null), (String) data.getOrDefault("name", null));
  }
}

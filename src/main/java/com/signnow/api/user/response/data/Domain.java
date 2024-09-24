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

public final class Domain extends ApiData {

  @JsonProperty("id")
  private final String id;

  @JsonProperty("domain")
  private final String domain;

  @JsonCreator
  public Domain(@JsonProperty("id") String id, @JsonProperty("domain") String domain) {
    this.id = id;
    this.domain = domain;
  }

  public String getId() {
    return this.id;
  }

  public String getDomain() {
    return this.domain;
  }

  @NotNull
  @Override
  public Map<String, Object> toMap() {
    Map<String, Object> map = new LinkedHashMap<>();
    map.put("id", this.getId());
    map.put("domain", this.getDomain());
    return map;
  }

  @NotNull
  @Contract("_ -> new")
  public static Domain fromMap(@NotNull Map<String, Object> data) {
    return new Domain((String) data.get("id"), (String) data.get("domain"));
  }
}

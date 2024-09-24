/*
 * This file is a part of signNow SDK API client.
 *
 * (с) Copyright © 2011-present airSlate Inc. (https://www.signnow.com)
 *
 * For more details on copyright, see LICENSE.md file
 * that was distributed with this source code.
 */

package com.signnow.api.webhookv2.response.data.data;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.signnow.core.data.ApiData;
import com.signnow.core.util.Cast;
import java.util.LinkedHashMap;
import java.util.Map;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

public final class RequestContent extends ApiData {

  @JsonProperty("meta")
  private final Meta meta;

  @JsonProperty("content")
  private final Content content;

  @JsonCreator
  public RequestContent(@JsonProperty("meta") Meta meta, @JsonProperty("content") Content content) {
    this.meta = meta;
    this.content = content;
  }

  public Meta getMeta() {
    return this.meta;
  }

  public Content getContent() {
    return this.content;
  }

  @NotNull
  @Override
  public Map<String, Object> toMap() {
    Map<String, Object> map = new LinkedHashMap<>();
    map.put("meta", this.getMeta());
    map.put("content", this.getContent());
    return map;
  }

  @NotNull
  @Contract("_ -> new")
  public static RequestContent fromMap(@NotNull Map<String, Object> data) {
    return new RequestContent(
        Meta.fromMap(Cast.safeToMap(data.get("meta"), String.class, Object.class)),
        Content.fromMap(Cast.safeToMap(data.get("content"), String.class, Object.class)));
  }
}

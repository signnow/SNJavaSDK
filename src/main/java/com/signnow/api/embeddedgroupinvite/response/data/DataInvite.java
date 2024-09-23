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
import java.util.HashMap;
import java.util.Map;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

public final class DataInvite extends ApiData {

  @JsonProperty("id")
  private final String id;

  @JsonCreator
  DataInvite(@JsonProperty("id") String id) {
    this.id = id;
  }

  public String getId() {
    return this.id;
  }

  @NotNull
  @Override
  public Map<String, Object> toMap() {
    Map<String, Object> map = new HashMap<>();
    map.put("id", this.getId());
    return map;
  }

  @NotNull
  @Contract("_ -> new")
  public static DataInvite fromMap(@NotNull Map<String, Object> data) {
    return new DataInvite((String) data.get("id"));
  }
}

/*
 * This file is a part of signNow SDK API client.
 *
 * (с) Copyright © 2011-present airSlate Inc. (https://www.signnow.com)
 *
 * For more details on copyright, see LICENSE.md file
 * that was distributed with this source code.
 */

package com.signnow.api.document.response.data.exportedto;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.signnow.core.data.ApiData;
import java.util.LinkedHashMap;
import java.util.Map;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

public final class Storage extends ApiData {

  @JsonProperty("is_active")
  private final boolean isActive;

  @JsonProperty("account")
  private final String account;

  @JsonCreator
  public Storage(
      @JsonProperty("is_active") boolean isActive, @JsonProperty("account") String account) {
    this.isActive = isActive;
    this.account = account;
  }

  public boolean isActive() {
    return this.isActive;
  }

  public String getAccount() {
    return this.account;
  }

  @NotNull
  @Override
  public Map<String, Object> toMap() {
    Map<String, Object> map = new LinkedHashMap<>();
    map.put("is_active", this.isActive());
    map.put("account", this.getAccount());
    return map;
  }

  @NotNull
  @Contract("_ -> new")
  public static Storage fromMap(@NotNull Map<String, Object> data) {
    return new Storage(
        (boolean) data.getOrDefault("is_active", false), (String) data.getOrDefault("account", ""));
  }
}

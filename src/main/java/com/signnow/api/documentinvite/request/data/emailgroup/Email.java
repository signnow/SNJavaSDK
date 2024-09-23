/*
 * This file is a part of signNow SDK API client.
 *
 * (с) Copyright © 2011-present airSlate Inc. (https://www.signnow.com)
 *
 * For more details on copyright, see LICENSE.md file
 * that was distributed with this source code.
 */

package com.signnow.api.documentinvite.request.data.emailgroup;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.signnow.core.data.ApiData;
import java.util.LinkedHashMap;
import java.util.Map;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

public class Email extends ApiData {

  @JsonProperty("email")
  private final String email;

  @JsonCreator
  public Email(@JsonProperty("email") String email) {
    this.email = email;
  }

  public String getEmail() {
    return this.email;
  }

  @NotNull
  @Override
  public Map<String, Object> toMap() {
    Map<String, Object> map = new LinkedHashMap<>();
    map.put("email", this.getEmail());
    return map;
  }

  @NotNull
  @Contract("_ -> new")
  public static Email fromMap(@NotNull Map<String, Object> data) {
    return new Email((String) data.get("email"));
  }
}

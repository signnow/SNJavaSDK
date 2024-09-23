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

public final class EmbeddedSigner extends ApiData {

  @JsonProperty("first_name")
  private final String firstName;

  @JsonProperty("last_name")
  private final String lastName;

  @JsonCreator
  public EmbeddedSigner(
      @JsonProperty("first_name") String firstName, @JsonProperty("last_name") String lastName) {
    this.firstName = firstName;
    this.lastName = lastName;
  }

  public String getFirstName() {
    return this.firstName;
  }

  public String getLastName() {
    return this.lastName;
  }

  @NotNull
  @Override
  public Map<String, Object> toMap() {
    Map<String, Object> map = new LinkedHashMap<>();
    map.put("first_name", this.getFirstName());
    map.put("last_name", this.getLastName());
    return map;
  }

  @NotNull
  @Contract("_ -> new")
  public static EmbeddedSigner fromMap(@NotNull Map<String, Object> data) {
    return new EmbeddedSigner((String) data.get("first_name"), (String) data.get("last_name"));
  }
}

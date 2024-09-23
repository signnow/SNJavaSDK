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

public final class Declined extends ApiData {

  @JsonProperty("declined_text")
  private final String declinedText;

  @JsonCreator
  public Declined(@JsonProperty("declined_text") String declinedText) {
    this.declinedText = declinedText;
  }

  public String getDeclinedText() {
    return this.declinedText;
  }

  @NotNull
  @Override
  public Map<String, Object> toMap() {
    Map<String, Object> map = new LinkedHashMap<>();
    map.put("declined_text", this.getDeclinedText());
    return map;
  }

  @NotNull
  @Contract("_ -> new")
  public static Declined fromMap(@NotNull Map<String, Object> data) {
    return new Declined((String) data.get("declined_text"));
  }
}

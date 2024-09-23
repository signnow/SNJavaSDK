/*
 * This file is a part of signNow SDK API client.
 *
 * (с) Copyright © 2011-present airSlate Inc. (https://www.signnow.com)
 *
 * For more details on copyright, see LICENSE.md file
 * that was distributed with this source code.
 */

package com.signnow.api.document.response.data;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.signnow.core.data.ApiData;
import java.util.LinkedHashMap;
import java.util.Map;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

public final class SigningSessionSettings extends ApiData {

  @JsonProperty("welcome_message")
  private final String welcomeMessage;

  @JsonCreator
  public SigningSessionSettings(@JsonProperty("welcome_message") String welcomeMessage) {
    this.welcomeMessage = welcomeMessage;
  }

  public String getWelcomeMessage() {
    return this.welcomeMessage;
  }

  @NotNull
  @Override
  public Map<String, Object> toMap() {
    Map<String, Object> map = new LinkedHashMap<>();
    map.put("welcome_message", this.getWelcomeMessage());
    return map;
  }

  @NotNull
  @Contract("_ -> new")
  public static SigningSessionSettings fromMap(@NotNull Map<String, Object> data) {
    return new SigningSessionSettings((String) data.get("welcome_message"));
  }
}

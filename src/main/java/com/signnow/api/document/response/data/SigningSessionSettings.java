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

/**
 * This class represents the settings for a signing session.
 */
public final class SigningSessionSettings extends ApiData {

  /**
   * The welcome message for the signing session.
   */
  @JsonProperty("welcome_message")
  private final String welcomeMessage;

  /**
   * Constructs a new SigningSessionSettings with the specified welcome message.
   *
   * @param welcomeMessage the welcome message for the signing session
   */
  @JsonCreator
  public SigningSessionSettings(@JsonProperty("welcome_message") String welcomeMessage) {
    this.welcomeMessage = welcomeMessage;
  }

  /**
   * Returns the welcome message for the signing session.
   *
   * @return the welcome message for the signing session
   */
  public String getWelcomeMessage() {
    return this.welcomeMessage;
  }

  /**
   * Converts this SigningSessionSettings to a Map.
   *
   * @return a Map representing this SigningSessionSettings
   */
  @NotNull
  @Override
  public Map<String, Object> toMap() {
    Map<String, Object> map = new LinkedHashMap<>();
    map.put("welcome_message", this.getWelcomeMessage());
    return map;
  }

  /**
   * Creates a new SigningSessionSettings from the specified Map.
   *
   * @param data a Map containing the data for the SigningSessionSettings
   * @return a new SigningSessionSettings created from the specified Map
   */
  @NotNull
  @Contract("_ -> new")
  public static SigningSessionSettings fromMap(@NotNull Map<String, Object> data) {
    return new SigningSessionSettings((String) data.get("welcome_message"));
  }
}
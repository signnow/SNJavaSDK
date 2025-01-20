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

/**
 * Declined class extends ApiData.
 * Represents the declined data in the API response.
 */
public final class Declined extends ApiData {

  /**
   * Declined text property.
   */
  @JsonProperty("declined_text")
  private final String declinedText;

  /**
   * Declined class constructor.
   *
   * @param declinedText The declined text from the API response.
   */
  @JsonCreator
  public Declined(@JsonProperty("declined_text") String declinedText) {
    this.declinedText = declinedText;
  }

  /**
   * Getter for declined text.
   *
   * @return The declined text.
   */
  public String getDeclinedText() {
    return this.declinedText;
  }

  /**
   * Converts the Declined object to a Map.
   *
   * @return A map representation of the Declined object.
   */
  @NotNull
  @Override
  public Map<String, Object> toMap() {
    Map<String, Object> map = new LinkedHashMap<>();
    map.put("declined_text", this.getDeclinedText());
    return map;
  }

  /**
   * Static method to create a Declined object from a Map.
   *
   * @param data The map containing the declined data.
   * @return A new Declined object.
   */
  @NotNull
  @Contract("_ -> new")
  public static Declined fromMap(@NotNull Map<String, Object> data) {
    return new Declined((String) data.get("declined_text"));
  }
}
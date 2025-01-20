/*
 * This file is a part of signNow SDK API client.
 *
 * (с) Copyright © 2011-present airSlate Inc. (https://www.signnow.com)
 *
 * For more details on copyright, see LICENSE.md file
 * that was distributed with this source code.
 */

package com.signnow.api.template.response.data;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.signnow.core.data.ApiData;
import java.util.LinkedHashMap;
import java.util.Map;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

/**
 * This class represents the data for a CC step.
 */
public final class CcStepGet extends ApiData {

  /**
   * The email of the CC step.
   */
  @JsonProperty("email")
  private final String email;

  /**
   * The name of the CC step.
   */
  @JsonProperty("name")
  private final String name;

  /**
   * The step number of the CC step.
   */
  @JsonProperty("step")
  private final int step;

  /**
   * Constructs a new CC step with the specified email, name, and step number.
   *
   * @param email the email of the CC step
   * @param name the name of the CC step
   * @param step the step number of the CC step
   */
  @JsonCreator
  public CcStepGet(
      @JsonProperty("email") String email,
      @JsonProperty("name") String name,
      @JsonProperty("step") int step) {
    this.email = email;
    this.name = name;
    this.step = step;
  }

  /**
   * Returns the email of this CC step.
   *
   * @return the email of this CC step
   */
  public String getEmail() {
    return this.email;
  }

  /**
   * Returns the name of this CC step.
   *
   * @return the name of this CC step
   */
  public String getName() {
    return this.name;
  }

  /**
   * Returns the step number of this CC step.
   *
   * @return the step number of this CC step
   */
  public int getStep() {
    return this.step;
  }

  /**
   * Returns a map representation of this CC step.
   *
   * @return a map representation of this CC step
   */
  @NotNull
  @Override
  public Map<String, Object> toMap() {
    Map<String, Object> map = new LinkedHashMap<>();
    map.put("email", this.getEmail());
    map.put("name", this.getName());
    map.put("step", this.getStep());
    return map;
  }

  /**
   * Returns a new CC step created from the specified map.
   *
   * @param data the map from which to create the CC step
   * @return a new CC step created from the specified map
   */
  @NotNull
  @Contract("_ -> new")
  public static CcStepGet fromMap(@NotNull Map<String, Object> data) {
    return new CcStepGet(
        (String) data.get("email"), (String) data.get("name"), (Integer) data.get("step"));
  }
}
/*
 * This file is a part of signNow SDK API client.
 *
 * (с) Copyright © 2011-present airSlate Inc. (https://www.signnow.com)
 *
 * For more details on copyright, see LICENSE.md file
 * that was distributed with this source code.
 */

package com.signnow.api.template.request.data;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.signnow.core.data.ApiData;
import java.util.LinkedHashMap;
import java.util.Map;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

/**
 * This class represents a step in the CC process.
 */
public final class CcStepPut extends ApiData {

  /**
   * The email of the user.
   */
  @JsonProperty("email")
  private final String email;

  /**
   * The name of the user.
   */
  @JsonProperty("name")
  private final String name;

  /**
   * The step number in the process.
   */
  @JsonProperty("step")
  private final int step;

  /**
   * Constructor for the CcStepPut class.
   *
   * @param email The email of the user.
   * @param name The name of the user.
   * @param step The step number in the process.
   */
  @JsonCreator
  public CcStepPut(
      @JsonProperty("email") String email,
      @JsonProperty("name") String name,
      @JsonProperty("step") int step) {
    this.email = email;
    this.name = name;
    this.step = step;
  }

  /**
   * Returns the email of the user.
   *
   * @return The email of the user.
   */
  public String getEmail() {
    return this.email;
  }

  /**
   * Returns the name of the user.
   *
   * @return The name of the user.
   */
  public String getName() {
    return this.name;
  }

  /**
   * Returns the step number in the process.
   *
   * @return The step number in the process.
   */
  public int getStep() {
    return this.step;
  }

  /**
   * Converts the CcStepPut object to a Map.
   *
   * @return A Map representation of the CcStepPut object.
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
   * Creates a CcStepPut object from a Map.
   *
   * @param data The Map to convert to a CcStepPut object.
   * @return A new CcStepPut object.
   */
  @NotNull
  @Contract("_ -> new")
  public static CcStepPut fromMap(@NotNull Map<String, Object> data) {
    return new CcStepPut(
        (String) data.get("email"), (String) data.get("name"), (Integer) data.get("step"));
  }
}
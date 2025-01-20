/*
 * This file is a part of signNow SDK API client.
 *
 * (с) Copyright © 2011-present airSlate Inc. (https://www.signnow.com)
 *
 * For more details on copyright, see LICENSE.md file
 * that was distributed with this source code.
 */

package com.signnow.api.documentinvite.request.data;

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
public final class CcStep extends ApiData {

  /**
   * The name of the person involved in this step.
   */
  @JsonProperty("name")
  private final String name;

  /**
   * The email of the person involved in this step.
   */
  @JsonProperty("email")
  private final String email;

  /**
   * The order of this step in the process.
   */
  @JsonProperty("step")
  private final int step;

  /**
   * Constructs a new CcStep with the given name, email, and step order.
   *
   * @param name the name of the person involved in this step
   * @param email the email of the person involved in this step
   * @param step the order of this step in the process
   */
  @JsonCreator
  public CcStep(
      @JsonProperty("name") String name,
      @JsonProperty("email") String email,
      @JsonProperty("step") int step) {
    this.name = name;
    this.email = email;
    this.step = step;
  }

  /**
   * Returns the name of the person involved in this step.
   *
   * @return the name of the person
   */
  public String getName() {
    return this.name;
  }

  /**
   * Returns the email of the person involved in this step.
   *
   * @return the email of the person
   */
  public String getEmail() {
    return this.email;
  }

  /**
   * Returns the order of this step in the process.
   *
   * @return the order of this step
   */
  public int getStep() {
    return this.step;
  }

  /**
   * Converts this CcStep to a Map.
   *
   * @return a Map with keys "name", "email", and "step", and values from this CcStep
   */
  @NotNull
  @Override
  public Map<String, Object> toMap() {
    Map<String, Object> map = new LinkedHashMap<>();
    map.put("name", this.getName());
    map.put("email", this.getEmail());
    map.put("step", this.getStep());
    return map;
  }

  /**
   * Creates a new CcStep from the given Map.
   *
   * @param data a Map with keys "name", "email", and "step", and corresponding values
   * @return a new CcStep with values from the Map
   */
  @NotNull
  @Contract("_ -> new")
  public static CcStep fromMap(@NotNull Map<String, Object> data) {
    return new CcStep(
        (String) data.get("name"), (String) data.get("email"), (Integer) data.get("step"));
  }
}
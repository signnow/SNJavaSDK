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
 * This class represents a post step for CC in signNow API.
 */
public final class CcStepPost extends ApiData {

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
   * The step number.
   */
  @JsonProperty("step")
  private final int step;

  /**
   * Constructs a new CcStepPost with the specified email, name, and step.
   *
   * @param email the email of the user
   * @param name the name of the user
   * @param step the step number
   */
  @JsonCreator
  public CcStepPost(
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
   * @return the email
   */
  public String getEmail() {
    return this.email;
  }

  /**
   * Returns the name of the user.
   *
   * @return the name
   */
  public String getName() {
    return this.name;
  }

  /**
   * Returns the step number.
   *
   * @return the step
   */
  public int getStep() {
    return this.step;
  }

  /**
   * Converts this CcStepPost to a Map.
   *
   * @return a Map with keys "email", "name", and "step"
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
   * Creates a new CcStepPost from the specified Map.
   *
   * @param data a Map with keys "email", "name", and "step"
   * @return a new CcStepPost
   */
  @NotNull
  @Contract("_ -> new")
  public static CcStepPost fromMap(@NotNull Map<String, Object> data) {
    return new CcStepPost(
        (String) data.get("email"), (String) data.get("name"), (Integer) data.get("step"));
  }
}
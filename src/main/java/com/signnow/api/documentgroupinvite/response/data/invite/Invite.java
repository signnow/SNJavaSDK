/*
 * This file is a part of signNow SDK API client.
 *
 * (с) Copyright © 2011-present airSlate Inc. (https://www.signnow.com)
 *
 * For more details on copyright, see LICENSE.md file
 * that was distributed with this source code.
 */

package com.signnow.api.documentgroupinvite.response.data.invite;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.signnow.core.data.ApiData;
import java.util.LinkedHashMap;
import java.util.Map;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

/**
 * This class represents an Invite which extends ApiData.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public final class Invite extends ApiData {

  /**
   * The id of the invite.
   */
  @JsonProperty("id")
  private final String id;

  /**
   * The status of the invite.
   */
  @JsonProperty("status")
  private final String status;

  /**
   * The steps of the invite.
   */
  @JsonProperty("steps")
  private final StepCollection steps;

  /**
   * Constructs an Invite object with the specified id, status and steps.
   *
   * @param id the id of the invite
   * @param status the status of the invite
   * @param steps the steps of the invite
   */
  @JsonCreator
  public Invite(
      @JsonProperty("id") String id,
      @JsonProperty("status") String status,
      @JsonProperty("steps") StepCollection steps) {
    this.id = id;
    this.status = status;
    this.steps = steps;
  }

  /**
   * Returns the id of the invite.
   *
   * @return the id of the invite
   */
  public String getId() {
    return this.id;
  }

  /**
   * Returns the status of the invite.
   *
   * @return the status of the invite
   */
  public String getStatus() {
    return this.status;
  }

  /**
   * Returns the steps of the invite.
   *
   * @return the steps of the invite
   */
  public StepCollection getSteps() {
    return this.steps;
  }

  /**
   * Converts the Invite object to a Map.
   *
   * @return a Map representing the Invite object
   */
  @NotNull
  @Override
  public Map<String, Object> toMap() {
    Map<String, Object> map = new LinkedHashMap<>();
    map.put("id", this.getId());
    map.put("status", this.getStatus());
    map.put("steps", this.getSteps());
    return map;
  }

  /**
   * Constructs an Invite object from a Map.
   *
   * @param data a Map containing the data to construct an Invite object
   * @return a new Invite object constructed from the specified Map
   */
  @NotNull
  @Contract("_ -> new")
  public static Invite fromMap(@NotNull Map<String, Object> data) {
    return new Invite(
        (String) data.get("id"), (String) data.get("status"), (StepCollection) data.get("steps"));
  }
}
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
import com.fasterxml.jackson.annotation.JsonProperty;
import com.signnow.core.data.ApiData;
import java.util.LinkedHashMap;
import java.util.Map;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

/**
 * This class represents a Step in the signNow API.
 */
public final class Step extends ApiData {

  /**
   * The unique identifier for the Step.
   */
  @JsonProperty("id")
  private final String id;

  /**
   * The status of the Step.
   */
  @JsonProperty("status")
  private final String status;

  /**
   * The order of the Step.
   */
  @JsonProperty("order")
  private final int order;

  /**
   * The actions associated with the Step.
   */
  @JsonProperty("actions")
  private final ActionCollection actions;

  /**
   * Constructs a new Step with the specified id, status, order, and actions.
   *
   * @param id the unique identifier for the Step
   * @param status the status of the Step
   * @param order the order of the Step
   * @param actions the actions associated with the Step
   */
  @JsonCreator
  public Step(
      @JsonProperty("id") String id,
      @JsonProperty("status") String status,
      @JsonProperty("order") int order,
      @JsonProperty("actions") ActionCollection actions) {
    this.id = id;
    this.status = status;
    this.order = order;
    this.actions = actions;
  }

  /**
   * Returns the unique identifier for the Step.
   *
   * @return the unique identifier for the Step
   */
  public String getId() {
    return this.id;
  }

  /**
   * Returns the status of the Step.
   *
   * @return the status of the Step
   */
  public String getStatus() {
    return this.status;
  }

  /**
   * Returns the order of the Step.
   *
   * @return the order of the Step
   */
  public int getOrder() {
    return this.order;
  }

  /**
   * Returns the actions associated with the Step.
   *
   * @return the actions associated with the Step
   */
  public ActionCollection getActions() {
    return this.actions;
  }

  /**
   * Converts this Step to a Map.
   *
   * @return a Map representing this Step
   */
  @NotNull
  @Override
  public Map<String, Object> toMap() {
    Map<String, Object> map = new LinkedHashMap<>();
    map.put("id", this.getId());
    map.put("status", this.getStatus());
    map.put("order", this.getOrder());
    map.put("actions", this.getActions());
    return map;
  }

  /**
   * Creates a new Step from the specified Map.
   *
   * @param data a Map containing the data for the Step
   * @return a new Step created from the specified Map
   */
  @NotNull
  @Contract("_ -> new")
  public static Step fromMap(@NotNull Map<String, Object> data) {
    return new Step(
        (String) data.get("id"),
        (String) data.get("status"),
        (Integer) data.get("order"),
        (ActionCollection) data.get("actions"));
  }
}
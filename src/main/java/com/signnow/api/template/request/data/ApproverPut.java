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
 * This class represents an ApproverPut object.
 */
public final class ApproverPut extends ApiData {

  /**
   * The name of the approver.
   */
  @JsonProperty("name")
  private final String name;

  /**
   * The signing order of the approver.
   */
  @JsonProperty("signing_order")
  private final int signingOrder;

  /**
   * The default email of the approver.
   */
  @JsonProperty("default_email")
  private final String defaultEmail;

  /**
   * The inviter role of the approver.
   */
  @JsonProperty("inviter_role")
  private final boolean inviterRole;

  /**
   * Constructor for ApproverPut.
   *
   * @param name The name of the approver.
   * @param signingOrder The signing order of the approver.
   * @param defaultEmail The default email of the approver.
   * @param inviterRole The inviter role of the approver.
   */
  @JsonCreator
  public ApproverPut(
      @JsonProperty("name") String name,
      @JsonProperty("signing_order") int signingOrder,
      @JsonProperty("default_email") String defaultEmail,
      @JsonProperty("inviter_role") boolean inviterRole) {
    this.name = name;
    this.signingOrder = signingOrder;
    this.defaultEmail = defaultEmail;
    this.inviterRole = inviterRole;
  }

  /**
   * Overloaded constructor for ApproverPut.
   *
   * @param name The name of the approver.
   * @param signingOrder The signing order of the approver.
   */
  public ApproverPut(
      @JsonProperty("name") String name, @JsonProperty("signing_order") int signingOrder) {
    this.name = name;
    this.signingOrder = signingOrder;
    this.defaultEmail = null;
    this.inviterRole = false;
  }

  /**
   * Returns the name of the approver.
   *
   * @return The name of the approver.
   */
  public String getName() {
    return this.name;
  }

  /**
   * Returns the signing order of the approver.
   *
   * @return The signing order of the approver.
   */
  public int getSigningOrder() {
    return this.signingOrder;
  }

  /**
   * Returns the default email of the approver.
   *
   * @return The default email of the approver.
   */
  public String getDefaultEmail() {
    return this.defaultEmail;
  }

  /**
   * Returns the inviter role of the approver.
   *
   * @return The inviter role of the approver.
   */
  public boolean isInviterRole() {
    return this.inviterRole;
  }

  /**
   * Converts the ApproverPut object to a Map.
   *
   * @return A Map representation of the ApproverPut object.
   */
  @NotNull
  @Override
  public Map<String, Object> toMap() {
    Map<String, Object> map = new LinkedHashMap<>();
    map.put("name", this.getName());
    map.put("signing_order", this.getSigningOrder());
    map.put("default_email", this.getDefaultEmail());
    map.put("inviter_role", this.isInviterRole());
    return map;
  }

  /**
   * Creates an ApproverPut object from a Map.
   *
   * @param data The Map to convert to an ApproverPut object.
   * @return An ApproverPut object.
   */
  @NotNull
  @Contract("_ -> new")
  public static ApproverPut fromMap(@NotNull Map<String, Object> data) {
    return new ApproverPut(
        (String) data.get("name"),
        (Integer) data.get("signing_order"),
        (String) data.getOrDefault("default_email", ""),
        (Boolean) data.getOrDefault("inviter_role", false));
  }
}
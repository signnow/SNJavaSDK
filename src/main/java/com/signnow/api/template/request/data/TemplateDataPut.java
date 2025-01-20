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
 * This class represents the data for a template put request.
 */
public final class TemplateDataPut extends ApiData {

  /**
   * Represents the role of the inviter.
   */
  @JsonProperty("inviter_role")
  private final boolean inviterRole;

  /**
   * Represents the name of the template.
   */
  @JsonProperty("name")
  private final String name;

  /**
   * Represents the role id of the template.
   */
  @JsonProperty("role_id")
  private final String roleId;

  /**
   * Represents the signing order of the template.
   */
  @JsonProperty("signing_order")
  private final int signingOrder;

  /**
   * Represents the default email of the template.
   */
  @JsonProperty("default_email")
  private final String defaultEmail;

  /**
   * Constructor for TemplateDataPut.
   *
   * @param inviterRole the role of the inviter
   * @param name the name of the template
   * @param roleId the role id of the template
   * @param signingOrder the signing order of the template
   * @param defaultEmail the default email of the template
   */
  @JsonCreator
  public TemplateDataPut(
      @JsonProperty("inviter_role") boolean inviterRole,
      @JsonProperty("name") String name,
      @JsonProperty("role_id") String roleId,
      @JsonProperty("signing_order") int signingOrder,
      @JsonProperty("default_email") String defaultEmail) {
    this.inviterRole = inviterRole;
    this.name = name;
    this.roleId = roleId;
    this.signingOrder = signingOrder;
    this.defaultEmail = defaultEmail;
  }

  /**
   * Overloaded constructor for TemplateDataPut.
   *
   * @param inviterRole the role of the inviter
   * @param name the name of the template
   * @param roleId the role id of the template
   * @param signingOrder the signing order of the template
   */
  public TemplateDataPut(
      @JsonProperty("inviter_role") boolean inviterRole,
      @JsonProperty("name") String name,
      @JsonProperty("role_id") String roleId,
      @JsonProperty("signing_order") int signingOrder) {
    this.inviterRole = inviterRole;
    this.name = name;
    this.roleId = roleId;
    this.signingOrder = signingOrder;
    this.defaultEmail = null;
  }

  /**
   * Returns the inviter role.
   *
   * @return the inviter role
   */
  public boolean isInviterRole() {
    return this.inviterRole;
  }

  /**
   * Returns the name of the template.
   *
   * @return the name of the template
   */
  public String getName() {
    return this.name;
  }

  /**
   * Returns the role id of the template.
   *
   * @return the role id of the template
   */
  public String getRoleId() {
    return this.roleId;
  }

  /**
   * Returns the signing order of the template.
   *
   * @return the signing order of the template
   */
  public int getSigningOrder() {
    return this.signingOrder;
  }

  /**
   * Returns the default email of the template.
   *
   * @return the default email of the template
   */
  public String getDefaultEmail() {
    return this.defaultEmail;
  }

  /**
   * Converts the TemplateDataPut object to a Map.
   *
   * @return a Map representation of the TemplateDataPut object
   */
  @NotNull
  @Override
  public Map<String, Object> toMap() {
    Map<String, Object> map = new LinkedHashMap<>();
    map.put("default_email", this.getDefaultEmail());
    map.put("inviter_role", this.isInviterRole());
    map.put("name", this.getName());
    map.put("role_id", this.getRoleId());
    map.put("signing_order", this.getSigningOrder());
    return map;
  }

  /**
   * Creates a TemplateDataPut object from a Map.
   *
   * @param data a Map containing the data for a TemplateDataPut object
   * @return a new TemplateDataPut object
   */
  @NotNull
  @Contract("_ -> new")
  public static TemplateDataPut fromMap(@NotNull Map<String, Object> data) {
    return new TemplateDataPut(
        (boolean) data.get("inviter_role"),
        (String) data.get("name"),
        (String) data.get("role_id"),
        (int) data.get("signing_order"),
        (String) data.getOrDefault("default_email", ""));
  }
}
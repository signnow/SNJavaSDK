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
 * This class represents the ViewerPut data model.
 */
public final class ViewerPut extends ApiData {

  /**
   * The name of the viewer.
   */
  @JsonProperty("name")
  private final String name;

  /**
   * The signing order of the viewer.
   */
  @JsonProperty("signing_order")
  private final int signingOrder;

  /**
   * The default email of the viewer.
   */
  @JsonProperty("default_email")
  private final String defaultEmail;

  /**
   * The inviter role of the viewer.
   */
  @JsonProperty("inviter_role")
  private final boolean inviterRole;

  /**
   * Constructs a new ViewerPut object with the specified name, signing order, default email, and inviter role.
   *
   * @param name the name of the viewer
   * @param signingOrder the signing order of the viewer
   * @param defaultEmail the default email of the viewer
   * @param inviterRole the inviter role of the viewer
   */
  @JsonCreator
  public ViewerPut(
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
   * Returns the name of the viewer.
   *
   * @return the name of the viewer
   */
  public String getName() {
    return this.name;
  }

  /**
   * Returns the signing order of the viewer.
   *
   * @return the signing order of the viewer
   */
  public int getSigningOrder() {
    return this.signingOrder;
  }

  /**
   * Returns the default email of the viewer.
   *
   * @return the default email of the viewer
   */
  public String getDefaultEmail() {
    return this.defaultEmail;
  }

  /**
   * Returns the inviter role of the viewer.
   *
   * @return the inviter role of the viewer
   */
  public boolean isInviterRole() {
    return this.inviterRole;
  }

  /**
   * Converts this ViewerPut object to a Map.
   *
   * @return a Map representing this ViewerPut object
   */
  @NotNull
  @Override
  public Map<String, Object> toMap() {
    Map<String, Object> map = new LinkedHashMap<>();
    map.put("default_email", this.getDefaultEmail());
    map.put("name", this.getName());
    map.put("signing_order", this.getSigningOrder());
    map.put("inviter_role", this.isInviterRole());
    return map;
  }

  /**
   * Creates a new ViewerPut object from the specified Map.
   *
   * @param data a Map containing the data to be used to create the ViewerPut object
   * @return a new ViewerPut object created from the specified Map
   */
  @NotNull
  @Contract("_ -> new")
  public static ViewerPut fromMap(@NotNull Map<String, Object> data) {
    return new ViewerPut(
        (String) data.get("name"),
        (Integer) data.get("signing_order"),
        (String) data.getOrDefault("default_email", ""),
        (Boolean) data.getOrDefault("inviter_role", false));
  }
}
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
 * This class represents the ApproverGet data model.
 */
public final class ApproverGet extends ApiData {

  /**
   * The default email of the approver.
   */
  @JsonProperty("default_email")
  private final String defaultEmail;

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
   * Constructs a new ApproverGet object.
   *
   * @param defaultEmail the default email of the approver
   * @param name the name of the approver
   * @param signingOrder the signing order of the approver
   */
  @JsonCreator
  public ApproverGet(
      @JsonProperty("default_email") String defaultEmail,
      @JsonProperty("name") String name,
      @JsonProperty("signing_order") int signingOrder) {
    this.defaultEmail = defaultEmail;
    this.name = name;
    this.signingOrder = signingOrder;
  }

  /**
   * Returns the default email of the approver.
   *
   * @return the default email
   */
  public String getDefaultEmail() {
    return this.defaultEmail;
  }

  /**
   * Returns the name of the approver.
   *
   * @return the name
   */
  public String getName() {
    return this.name;
  }

  /**
   * Returns the signing order of the approver.
   *
   * @return the signing order
   */
  public int getSigningOrder() {
    return this.signingOrder;
  }

  /**
   * Converts this object to a Map.
   *
   * @return a Map representation of this object
   */
  @NotNull
  @Override
  public Map<String, Object> toMap() {
    Map<String, Object> map = new LinkedHashMap<>();
    map.put("default_email", this.getDefaultEmail());
    map.put("name", this.getName());
    map.put("signing_order", this.getSigningOrder());
    return map;
  }

  /**
   * Creates a new ApproverGet object from a Map.
   *
   * @param data a Map containing the data to create the object
   * @return a new ApproverGet object
   */
  @NotNull
  @Contract("_ -> new")
  public static ApproverGet fromMap(@NotNull Map<String, Object> data) {
    return new ApproverGet(
        (String) data.get("default_email"),
        (String) data.get("name"),
        (Integer) data.get("signing_order"));
  }
}
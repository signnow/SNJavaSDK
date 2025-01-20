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
 * This class represents an ApproverPut object.
 */
public final class ApproverPut extends ApiData {

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
   * Constructs an ApproverPut object.
   *
   * @param defaultEmail The default email of the approver.
   * @param name The name of the approver.
   * @param signingOrder The signing order of the approver.
   */
  @JsonCreator
  public ApproverPut(
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
   * @return The default email of the approver.
   */
  public String getDefaultEmail() {
    return this.defaultEmail;
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
   * Converts this object to a Map.
   *
   * @return A Map representation of this object.
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
   * Creates an ApproverPut object from a Map.
   *
   * @param data The Map to convert.
   * @return An ApproverPut object.
   */
  @NotNull
  @Contract("_ -> new")
  public static ApproverPut fromMap(@NotNull Map<String, Object> data) {
    return new ApproverPut(
        (String) data.get("default_email"),
        (String) data.get("name"),
        (Integer) data.get("signing_order"));
  }
}
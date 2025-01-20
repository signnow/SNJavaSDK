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
 * This class represents the ViewerPut data model.
 */
public final class ViewerPut extends ApiData {

  /**
   * The default email of the viewer.
   */
  @JsonProperty("default_email")
  private final String defaultEmail;

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
   * Constructs a new ViewerPut object.
   *
   * @param defaultEmail the default email of the viewer.
   * @param name the name of the viewer.
   * @param signingOrder the signing order of the viewer.
   */
  @JsonCreator
  public ViewerPut(
      @JsonProperty("default_email") String defaultEmail,
      @JsonProperty("name") String name,
      @JsonProperty("signing_order") int signingOrder) {
    this.defaultEmail = defaultEmail;
    this.name = name;
    this.signingOrder = signingOrder;
  }

  /**
   * Returns the default email of the viewer.
   *
   * @return the default email of the viewer.
   */
  public String getDefaultEmail() {
    return this.defaultEmail;
  }

  /**
   * Returns the name of the viewer.
   *
   * @return the name of the viewer.
   */
  public String getName() {
    return this.name;
  }

  /**
   * Returns the signing order of the viewer.
   *
   * @return the signing order of the viewer.
   */
  public int getSigningOrder() {
    return this.signingOrder;
  }

  /**
   * Converts this ViewerPut object to a Map.
   *
   * @return a Map representing this ViewerPut object.
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
   * Creates a new ViewerPut object from a Map.
   *
   * @param data a Map containing the data for the new ViewerPut object.
   * @return a new ViewerPut object.
   */
  @NotNull
  @Contract("_ -> new")
  public static ViewerPut fromMap(@NotNull Map<String, Object> data) {
    return new ViewerPut(
        (String) data.get("default_email"),
        (String) data.get("name"),
        (Integer) data.get("signing_order"));
  }
}
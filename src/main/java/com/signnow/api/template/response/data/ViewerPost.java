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
 * This class represents a ViewerPost object.
 */
public final class ViewerPost extends ApiData {

  /**
   * The default email of the ViewerPost.
   */
  @JsonProperty("default_email")
  private final String defaultEmail;

  /**
   * The name of the ViewerPost.
   */
  @JsonProperty("name")
  private final String name;

  /**
   * The signing order of the ViewerPost.
   */
  @JsonProperty("signing_order")
  private final int signingOrder;

  /**
   * Constructs a ViewerPost object.
   *
   * @param defaultEmail the default email of the ViewerPost
   * @param name the name of the ViewerPost
   * @param signingOrder the signing order of the ViewerPost
   */
  @JsonCreator
  public ViewerPost(
      @JsonProperty("default_email") String defaultEmail,
      @JsonProperty("name") String name,
      @JsonProperty("signing_order") int signingOrder) {
    this.defaultEmail = defaultEmail;
    this.name = name;
    this.signingOrder = signingOrder;
  }

  /**
   * Returns the default email of the ViewerPost.
   *
   * @return the default email
   */
  public String getDefaultEmail() {
    return this.defaultEmail;
  }

  /**
   * Returns the name of the ViewerPost.
   *
   * @return the name
   */
  public String getName() {
    return this.name;
  }

  /**
   * Returns the signing order of the ViewerPost.
   *
   * @return the signing order
   */
  public int getSigningOrder() {
    return this.signingOrder;
  }

  /**
   * Converts the ViewerPost object to a Map.
   *
   * @return a Map representation of the ViewerPost object
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
   * Creates a ViewerPost object from a Map.
   *
   * @param data a Map containing the data for the ViewerPost object
   * @return a new ViewerPost object
   */
  @NotNull
  @Contract("_ -> new")
  public static ViewerPost fromMap(@NotNull Map<String, Object> data) {
    return new ViewerPost(
        (String) data.get("default_email"),
        (String) data.get("name"),
        (Integer) data.get("signing_order"));
  }
}
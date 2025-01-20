/*
 * This file is a part of signNow SDK API client.
 *
 * (с) Copyright © 2011-present airSlate Inc. (https://www.signnow.com)
 *
 * For more details on copyright, see LICENSE.md file
 * that was distributed with this source code.
 */

package com.signnow.api.documentinvite.request.data;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.signnow.core.data.ApiData;
import java.util.LinkedHashMap;
import java.util.Map;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

/**
 * This class represents an Email Group in the signNow API.
 */
public final class EmailGroup extends ApiData {

  /**
   * The name of the Email Group.
   */
  @JsonProperty("name")
  private final String name;

  /**
   * Constructor for the EmailGroup class.
   *
   * @param name The name of the Email Group.
   */
  @JsonCreator
  public EmailGroup(@JsonProperty("name") String name) {
    this.name = name;
  }

  /**
   * Returns the name of the Email Group.
   *
   * @return The name of the Email Group.
   */
  public String getName() {
    return this.name;
  }

  /**
   * Converts the EmailGroup object to a Map.
   *
   * @return A Map representation of the EmailGroup object.
   */
  @NotNull
  @Override
  public Map<String, Object> toMap() {
    Map<String, Object> map = new LinkedHashMap<>();
    map.put("name", this.getName());
    return map;
  }

  /**
   * Creates an EmailGroup object from a Map.
   *
   * @param data A Map containing the data for the EmailGroup.
   * @return A new EmailGroup object.
   */
  @NotNull
  @Contract("_ -> new")
  public static EmailGroup fromMap(@NotNull Map<String, Object> data) {
    return new EmailGroup((String) data.get("name"));
  }
}
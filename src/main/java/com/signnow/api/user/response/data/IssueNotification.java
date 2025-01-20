/*
 * This file is a part of signNow SDK API client.
 *
 * (с) Copyright © 2011-present airSlate Inc. (https://www.signnow.com)
 *
 * For more details on copyright, see LICENSE.md file
 * that was distributed with this source code.
 */

package com.signnow.api.user.response.data;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.signnow.core.data.ApiData;
import java.util.LinkedHashMap;
import java.util.Map;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

/**
 * This class represents an issue notification.
 */
public final class IssueNotification extends ApiData {

  /**
   * The title of the issue notification.
   */
  @JsonProperty("title")
  private final String title;

  /**
   * The description of the issue notification.
   */
  @JsonProperty("description")
  private final String description;

  /**
   * Constructs an IssueNotification object with the specified title and description.
   *
   * @param title the title of the issue notification
   * @param description the description of the issue notification
   */
  @JsonCreator
  public IssueNotification(
      @JsonProperty("title") String title, @JsonProperty("description") String description) {
    this.title = title;
    this.description = description;
  }

  /**
   * Returns the title of this issue notification.
   *
   * @return the title of this issue notification
   */
  public String getTitle() {
    return this.title;
  }

  /**
   * Returns the description of this issue notification.
   *
   * @return the description of this issue notification
   */
  public String getDescription() {
    return this.description;
  }

  /**
   * Returns a map representation of this issue notification.
   *
   * @return a map representation of this issue notification
   */
  @NotNull
  @Override
  public Map<String, Object> toMap() {
    Map<String, Object> map = new LinkedHashMap<>();
    map.put("title", this.getTitle());
    map.put("description", this.getDescription());
    return map;
  }

  /**
   * Returns an IssueNotification object created from the specified map.
   *
   * @param data the map from which to create the IssueNotification object
   * @return an IssueNotification object created from the specified map
   */
  @NotNull
  @Contract("_ -> new")
  public static IssueNotification fromMap(@NotNull Map<String, Object> data) {
    return new IssueNotification((String) data.get("title"), (String) data.get("description"));
  }
}
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

public final class IssueNotification extends ApiData {

  @JsonProperty("title")
  private final String title;

  @JsonProperty("description")
  private final String description;

  @JsonCreator
  public IssueNotification(
      @JsonProperty("title") String title, @JsonProperty("description") String description) {
    this.title = title;
    this.description = description;
  }

  public String getTitle() {
    return this.title;
  }

  public String getDescription() {
    return this.description;
  }

  @NotNull
  @Override
  public Map<String, Object> toMap() {
    Map<String, Object> map = new LinkedHashMap<>();
    map.put("title", this.getTitle());
    map.put("description", this.getDescription());
    return map;
  }

  @NotNull
  @Contract("_ -> new")
  public static IssueNotification fromMap(@NotNull Map<String, Object> data) {
    return new IssueNotification((String) data.get("title"), (String) data.get("description"));
  }
}

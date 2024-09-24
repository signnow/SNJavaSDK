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

public final class CloudExportAccountDetail extends ApiData {

  @JsonProperty("username")
  private final String username;

  @JsonProperty("short_files_servicename")
  private final String shortFilesServicename;

  @JsonProperty("long_files_servicename")
  private final String longFilesServicename;

  @JsonCreator
  public CloudExportAccountDetail(
      @JsonProperty("username") String username,
      @JsonProperty("short_files_servicename") String shortFilesServicename,
      @JsonProperty("long_files_servicename") String longFilesServicename) {
    this.username = username;
    this.shortFilesServicename = shortFilesServicename;
    this.longFilesServicename = longFilesServicename;
  }

  public String getUsername() {
    return this.username;
  }

  public String getShortFilesServicename() {
    return this.shortFilesServicename;
  }

  public String getLongFilesServicename() {
    return this.longFilesServicename;
  }

  @NotNull
  @Override
  public Map<String, Object> toMap() {
    Map<String, Object> map = new LinkedHashMap<>();
    map.put("username", this.getUsername());
    map.put("short_files_servicename", this.getShortFilesServicename());
    map.put("long_files_servicename", this.getLongFilesServicename());
    return map;
  }

  @NotNull
  @Contract("_ -> new")
  public static CloudExportAccountDetail fromMap(@NotNull Map<String, Object> data) {
    return new CloudExportAccountDetail(
        (String) data.getOrDefault("username", null),
        (String) data.getOrDefault("short_files_servicename", null),
        (String) data.getOrDefault("long_files_servicename", null));
  }
}

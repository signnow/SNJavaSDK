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
 * This class represents the details of a cloud export account.
 */
public final class CloudExportAccountDetail extends ApiData {

  /**
   * The username of the cloud export account.
   */
  @JsonProperty("username")
  private final String username;

  /**
   * The short service name for files in the cloud export account.
   */
  @JsonProperty("short_files_servicename")
  private final String shortFilesServicename;

  /**
   * The long service name for files in the cloud export account.
   */
  @JsonProperty("long_files_servicename")
  private final String longFilesServicename;

  /**
   * Constructor for CloudExportAccountDetail.
   *
   * @param username the username of the cloud export account.
   * @param shortFilesServicename the short service name for files.
   * @param longFilesServicename the long service name for files.
   */
  @JsonCreator
  public CloudExportAccountDetail(
      @JsonProperty("username") String username,
      @JsonProperty("short_files_servicename") String shortFilesServicename,
      @JsonProperty("long_files_servicename") String longFilesServicename) {
    this.username = username;
    this.shortFilesServicename = shortFilesServicename;
    this.longFilesServicename = longFilesServicename;
  }

  /**
   * Returns the username of the cloud export account.
   *
   * @return the username.
   */
  public String getUsername() {
    return this.username;
  }

  /**
   * Returns the short service name for files.
   *
   * @return the short service name.
   */
  public String getShortFilesServicename() {
    return this.shortFilesServicename;
  }

  /**
   * Returns the long service name for files.
   *
   * @return the long service name.
   */
  public String getLongFilesServicename() {
    return this.longFilesServicename;
  }

  /**
   * Converts the cloud export account details to a map.
   *
   * @return a map containing the cloud export account details.
   */
  @NotNull
  @Override
  public Map<String, Object> toMap() {
    Map<String, Object> map = new LinkedHashMap<>();
    map.put("username", this.getUsername());
    map.put("short_files_servicename", this.getShortFilesServicename());
    map.put("long_files_servicename", this.getLongFilesServicename());
    return map;
  }

  /**
   * Creates a new CloudExportAccountDetail from a map.
   *
   * @param data a map containing the cloud export account details.
   * @return a new CloudExportAccountDetail.
   */
  @NotNull
  @Contract("_ -> new")
  public static CloudExportAccountDetail fromMap(@NotNull Map<String, Object> data) {
    return new CloudExportAccountDetail(
        (String) data.getOrDefault("username", null),
        (String) data.getOrDefault("short_files_servicename", null),
        (String) data.getOrDefault("long_files_servicename", null));
  }
}

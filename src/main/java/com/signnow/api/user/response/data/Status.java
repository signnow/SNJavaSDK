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

public final class Status extends ApiData {

  @JsonProperty("bad_copy_token")
  private final boolean badCopyToken;

  @JsonProperty("has_copy_token")
  private final boolean hasCopyToken;

  @JsonProperty("has_cloud_export_token")
  private final boolean hasCloudExportToken;

  @JsonProperty("bad_cloud_export_token")
  private final boolean badCloudExportToken;

  @JsonProperty("has_salesforce_token")
  private final boolean hasSalesforceToken;

  @JsonCreator
  public Status(
      @JsonProperty("bad_copy_token") boolean badCopyToken,
      @JsonProperty("has_copy_token") boolean hasCopyToken,
      @JsonProperty("has_cloud_export_token") boolean hasCloudExportToken,
      @JsonProperty("bad_cloud_export_token") boolean badCloudExportToken,
      @JsonProperty("has_salesforce_token") boolean hasSalesforceToken) {
    this.badCopyToken = badCopyToken;
    this.hasCopyToken = hasCopyToken;
    this.hasCloudExportToken = hasCloudExportToken;
    this.badCloudExportToken = badCloudExportToken;
    this.hasSalesforceToken = hasSalesforceToken;
  }

  public boolean isBadCopyToken() {
    return this.badCopyToken;
  }

  public boolean hasCopyToken() {
    return this.hasCopyToken;
  }

  public boolean hasCloudExportToken() {
    return this.hasCloudExportToken;
  }

  public boolean isBadCloudExportToken() {
    return this.badCloudExportToken;
  }

  public boolean hasSalesforceToken() {
    return this.hasSalesforceToken;
  }

  @NotNull
  @Override
  public Map<String, Object> toMap() {
    Map<String, Object> map = new LinkedHashMap<>();
    map.put("bad_copy_token", this.isBadCopyToken());
    map.put("has_copy_token", this.hasCopyToken());
    map.put("has_cloud_export_token", this.hasCloudExportToken());
    map.put("bad_cloud_export_token", this.isBadCloudExportToken());
    map.put("has_salesforce_token", this.hasSalesforceToken());
    return map;
  }

  @NotNull
  @Contract("_ -> new")
  public static Status fromMap(@NotNull Map<String, Object> data) {
    return new Status(
        (boolean) data.getOrDefault("bad_copy_token", false),
        (boolean) data.getOrDefault("has_copy_token", false),
        (boolean) data.getOrDefault("has_cloud_export_token", false),
        (boolean) data.getOrDefault("bad_cloud_export_token", false),
        (boolean) data.getOrDefault("has_salesforce_token", false));
  }
}

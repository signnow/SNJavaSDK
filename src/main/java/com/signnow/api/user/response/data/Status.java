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
 * Status class extends ApiData.
 * It represents the status of various tokens.
 */
public final class Status extends ApiData {

  /**
   * Represents the status of bad copy token.
   */
  @JsonProperty("bad_copy_token")
  private final boolean badCopyToken;

  /**
   * Represents the status of copy token.
   */
  @JsonProperty("has_copy_token")
  private final boolean hasCopyToken;

  /**
   * Represents the status of cloud export token.
   */
  @JsonProperty("has_cloud_export_token")
  private final boolean hasCloudExportToken;

  /**
   * Represents the status of bad cloud export token.
   */
  @JsonProperty("bad_cloud_export_token")
  private final boolean badCloudExportToken;

  /**
   * Represents the status of salesforce token.
   */
  @JsonProperty("has_salesforce_token")
  private final boolean hasSalesforceToken;

  /**
   * Constructor for Status class.
   *
   * @param badCopyToken status of bad copy token.
   * @param hasCopyToken status of copy token.
   * @param hasCloudExportToken status of cloud export token.
   * @param badCloudExportToken status of bad cloud export token.
   * @param hasSalesforceToken status of salesforce token.
   */
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

  /**
   * @return the status of bad copy token.
   */
  public boolean isBadCopyToken() {
    return this.badCopyToken;
  }

  /**
   * @return the status of copy token.
   */
  public boolean hasCopyToken() {
    return this.hasCopyToken;
  }

  /**
   * @return the status of cloud export token.
   */
  public boolean hasCloudExportToken() {
    return this.hasCloudExportToken;
  }

  /**
   * @return the status of bad cloud export token.
   */
  public boolean isBadCloudExportToken() {
    return this.badCloudExportToken;
  }

  /**
   * @return the status of salesforce token.
   */
  public boolean hasSalesforceToken() {
    return this.hasSalesforceToken;
  }

  /**
   * Converts the status of tokens to a map.
   *
   * @return a map of token statuses.
   */
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

  /**
   * Creates a Status object from a map.
   *
   * @param data a map of token statuses.
   * @return a new Status object.
   */
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
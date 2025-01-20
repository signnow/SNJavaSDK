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
 * This class represents the billing period data.
 */
public final class BillingPeriod extends ApiData {

  /**
   * The start date of the billing period.
   */
  @JsonProperty("start_date")
  private final String startDate;

  /**
   * The end date of the billing period.
   */
  @JsonProperty("end_date")
  private final String endDate;

  /**
   * The start timestamp of the billing period.
   */
  @JsonProperty("start_timestamp")
  private final int startTimestamp;

  /**
   * The end timestamp of the billing period.
   */
  @JsonProperty("end_timestamp")
  private final int endTimestamp;

  /**
   * Constructs a new BillingPeriod with the specified start date, end date, start timestamp, and end timestamp.
   *
   * @param startDate the start date of the billing period
   * @param endDate the end date of the billing period
   * @param startTimestamp the start timestamp of the billing period
   * @param endTimestamp the end timestamp of the billing period
   */
  @JsonCreator
  public BillingPeriod(
      @JsonProperty("start_date") String startDate,
      @JsonProperty("end_date") String endDate,
      @JsonProperty("start_timestamp") int startTimestamp,
      @JsonProperty("end_timestamp") int endTimestamp) {
    this.startDate = startDate;
    this.endDate = endDate;
    this.startTimestamp = startTimestamp;
    this.endTimestamp = endTimestamp;
  }

  /**
   * Returns the start date of the billing period.
   *
   * @return the start date of the billing period
   */
  public String getStartDate() {
    return this.startDate;
  }

  /**
   * Returns the end date of the billing period.
   *
   * @return the end date of the billing period
   */
  public String getEndDate() {
    return this.endDate;
  }

  /**
   * Returns the start timestamp of the billing period.
   *
   * @return the start timestamp of the billing period
   */
  public int getStartTimestamp() {
    return this.startTimestamp;
  }

  /**
   * Returns the end timestamp of the billing period.
   *
   * @return the end timestamp of the billing period
   */
  public int getEndTimestamp() {
    return this.endTimestamp;
  }

  /**
   * Converts this BillingPeriod to a Map.
   *
   * @return a Map representing this BillingPeriod
   */
  @NotNull
  @Override
  public Map<String, Object> toMap() {
    Map<String, Object> map = new LinkedHashMap<>();
    map.put("start_date", this.getStartDate());
    map.put("end_date", this.getEndDate());
    map.put("start_timestamp", this.getStartTimestamp());
    map.put("end_timestamp", this.getEndTimestamp());
    return map;
  }

  /**
   * Creates a new BillingPeriod from the specified Map.
   *
   * @param data a Map containing the data to create the BillingPeriod from
   * @return a new BillingPeriod created from the specified Map
   */
  @NotNull
  @Contract("_ -> new")
  public static BillingPeriod fromMap(@NotNull Map<String, Object> data) {
    return new BillingPeriod(
        (String) data.get("start_date"),
        (String) data.get("end_date"),
        (Integer) data.get("start_timestamp"),
        (Integer) data.get("end_timestamp"));
  }
}
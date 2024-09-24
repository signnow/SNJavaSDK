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

public final class BillingPeriod extends ApiData {

  @JsonProperty("start_date")
  private final String startDate;

  @JsonProperty("end_date")
  private final String endDate;

  @JsonProperty("start_timestamp")
  private final int startTimestamp;

  @JsonProperty("end_timestamp")
  private final int endTimestamp;

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

  public String getStartDate() {
    return this.startDate;
  }

  public String getEndDate() {
    return this.endDate;
  }

  public int getStartTimestamp() {
    return this.startTimestamp;
  }

  public int getEndTimestamp() {
    return this.endTimestamp;
  }

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

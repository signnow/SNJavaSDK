/*
 * This file is a part of signNow SDK API client.
 *
 * (с) Copyright © 2011-present airSlate Inc. (https://www.signnow.com)
 *
 * For more details on copyright, see LICENSE.md file
 * that was distributed with this source code.
 */

package com.signnow.api.document.response.data;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.signnow.core.data.ApiData;
import java.util.LinkedHashMap;
import java.util.Map;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

/**
 * This class represents an Integration object with its properties and methods.
 */
public final class Integration extends ApiData {

  /**
   * The id of the Integration.
   */
  @JsonProperty("id")
  private final String id;

  /**
   * The integration id of the Integration.
   */
  @JsonProperty("integration_id")
  private final String integrationId;

  /**
   * The data of the Integration.
   */
  @JsonProperty("data")
  private final String data;

  /**
   * Constructs an Integration object with the specified id, integration id and data.
   *
   * @param id the id of the Integration.
   * @param integrationId the integration id of the Integration.
   * @param data the data of the Integration.
   */
  @JsonCreator
  public Integration(
      @JsonProperty("id") String id,
      @JsonProperty("integration_id") String integrationId,
      @JsonProperty("data") String data) {
    this.id = id;
    this.integrationId = integrationId;
    this.data = data;
  }

  /**
   * Returns the id of this Integration.
   *
   * @return the id of this Integration.
   */
  public String getId() {
    return this.id;
  }

  /**
   * Returns the integration id of this Integration.
   *
   * @return the integration id of this Integration.
   */
  public String getIntegrationId() {
    return this.integrationId;
  }

  /**
   * Returns the data of this Integration.
   *
   * @return the data of this Integration.
   */
  public String getData() {
    return this.data;
  }

  /**
   * Returns a Map representation of this Integration.
   *
   * @return a Map representation of this Integration.
   */
  @NotNull
  @Override
  public Map<String, Object> toMap() {
    Map<String, Object> map = new LinkedHashMap<>();
    map.put("id", this.getId());
    map.put("integration_id", this.getIntegrationId());
    map.put("data", this.getData());
    return map;
  }

  /**
   * Returns a new Integration object created from the specified Map.
   *
   * @param data the Map to create the Integration from.
   * @return a new Integration object created from the specified Map.
   */
  @NotNull
  @Contract("_ -> new")
  public static Integration fromMap(@NotNull Map<String, Object> data) {
    return new Integration(
        (String) data.get("id"),
        (String) data.getOrDefault("integration_id", null),
        (String) data.getOrDefault("data", ""));
  }
}

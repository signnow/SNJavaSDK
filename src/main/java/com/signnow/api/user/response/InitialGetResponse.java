/*
 * This file is a part of signNow SDK API client.
 *
 * (с) Copyright © 2011-present airSlate Inc. (https://www.signnow.com)
 *
 * For more details on copyright, see LICENSE.md file
 * that was distributed with this source code.
 */

package com.signnow.api.user.response;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * This class represents the initial response from the API.
 * It ignores unknown properties and maps JSON properties to Java fields.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class InitialGetResponse {

  /**
   * The unique identifier of the response.
   */
  @JsonProperty("unique_id")
  private final String uniqueId;

  /**
   * The width of the response.
   */
  @JsonProperty("width")
  private final String width;

  /**
   * The height of the response.
   */
  @JsonProperty("height")
  private final String height;

  /**
   * The data of the response.
   */
  @JsonProperty("data")
  private final String data;

  /**
   * The creation time of the response.
   */
  @JsonProperty("created")
  private final String created;

  /**
   * Constructs a new InitialGetResponse with the specified values.
   *
   * @param uniqueId the unique identifier of the response
   * @param width the width of the response
   * @param height the height of the response
   * @param data the data of the response
   * @param created the creation time of the response
   */
  public InitialGetResponse(
      @JsonProperty("unique_id") String uniqueId,
      @JsonProperty("width") String width,
      @JsonProperty("height") String height,
      @JsonProperty("data") String data,
      @JsonProperty("created") String created) {
    this.uniqueId = uniqueId;
    this.width = width;
    this.height = height;
    this.data = data;
    this.created = created;
  }

  /**
   * Returns the unique identifier of the response.
   *
   * @return the unique identifier of the response
   */
  public String getUniqueId() {
    return this.uniqueId;
  }

  /**
   * Returns the width of the response.
   *
   * @return the width of the response
   */
  public String getWidth() {
    return this.width;
  }

  /**
   * Returns the height of the response.
   *
   * @return the height of the response
   */
  public String getHeight() {
    return this.height;
  }

  /**
   * Returns the data of the response.
   *
   * @return the data of the response
   */
  public String getData() {
    return this.data;
  }

  /**
   * Returns the creation time of the response.
   *
   * @return the creation time of the response
   */
  public String getCreated() {
    return this.created;
  }
}
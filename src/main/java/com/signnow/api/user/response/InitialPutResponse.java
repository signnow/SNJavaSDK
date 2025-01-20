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
 * This class represents the initial put response.
 * It ignores unknown properties when parsing JSON.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class InitialPutResponse {

  /**
   * The id of the response.
   */
  @JsonProperty("id")
  private final String id;

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
   * The creation time of the response.
   */
  @JsonProperty("created")
  private final String created;

  /**
   * Constructs a new InitialPutResponse with the specified id, width, height, and creation time.
   *
   * @param id the id of the response
   * @param width the width of the response
   * @param height the height of the response
   * @param created the creation time of the response
   */
  public InitialPutResponse(
      @JsonProperty("id") String id,
      @JsonProperty("width") String width,
      @JsonProperty("height") String height,
      @JsonProperty("created") String created) {
    this.id = id;
    this.width = width;
    this.height = height;
    this.created = created;
  }

  /**
   * Returns the id of the response.
   *
   * @return the id of the response
   */
  public String getId() {
    return this.id;
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
   * Returns the creation time of the response.
   *
   * @return the creation time of the response
   */
  public String getCreated() {
    return this.created;
  }
}
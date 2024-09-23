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

@JsonIgnoreProperties(ignoreUnknown = true)
public class InitialGetResponse {

  @JsonProperty("unique_id")
  private final String uniqueId;

  @JsonProperty("width")
  private final String width;

  @JsonProperty("height")
  private final String height;

  @JsonProperty("data")
  private final String data;

  @JsonProperty("created")
  private final String created;

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

  public String getUniqueId() {
    return this.uniqueId;
  }

  public String getWidth() {
    return this.width;
  }

  public String getHeight() {
    return this.height;
  }

  public String getData() {
    return this.data;
  }

  public String getCreated() {
    return this.created;
  }
}

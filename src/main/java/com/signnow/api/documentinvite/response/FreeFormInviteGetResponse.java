/*
 * This file is a part of signNow SDK API client.
 *
 * (с) Copyright © 2011-present airSlate Inc. (https://www.signnow.com)
 *
 * For more details on copyright, see LICENSE.md file
 * that was distributed with this source code.
 */

package com.signnow.api.documentinvite.response;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.signnow.api.documentinvite.response.data.DataCollection;
import com.signnow.api.documentinvite.response.data.meta.Meta;

/**
 * This class represents the response from a FreeFormInviteGet API call.
 * It ignores unknown properties during JSON serialization/deserialization.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class FreeFormInviteGetResponse {

  /**
   * Meta information about the response.
   */
  @JsonProperty("meta")
  private final Meta meta;

  /**
   * Data collection of the response.
   */
  @JsonProperty("data")
  private final DataCollection data;

  /**
   * Constructs a new FreeFormInviteGetResponse with the provided meta and data.
   *
   * @param meta The meta information about the response.
   * @param data The data collection of the response. If null, a new DataCollection is created.
   */
  public FreeFormInviteGetResponse(
      @JsonProperty("meta") Meta meta, @JsonProperty("data") DataCollection data) {
    this.meta = meta;
    this.data = data != null ? data : new DataCollection();
  }

  /**
   * Returns the data collection of the response.
   *
   * @return The data collection of the response.
   */
  public DataCollection getData() {
    return this.data;
  }

  /**
   * Returns the meta information about the response.
   *
   * @return The meta information about the response.
   */
  public Meta getMeta() {
    return this.meta;
  }
}
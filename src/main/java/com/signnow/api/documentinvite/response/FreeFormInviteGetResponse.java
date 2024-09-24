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

@JsonIgnoreProperties(ignoreUnknown = true)
public class FreeFormInviteGetResponse {

  @JsonProperty("meta")
  private final Meta meta;

  @JsonProperty("data")
  private final DataCollection data;

  public FreeFormInviteGetResponse(
      @JsonProperty("meta") Meta meta, @JsonProperty("data") DataCollection data) {
    this.meta = meta;
    this.data = data != null ? data : new DataCollection();
  }

  public DataCollection getData() {
    return this.data;
  }

  public Meta getMeta() {
    return this.meta;
  }
}

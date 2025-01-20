/*
 * This file is a part of signNow SDK API client.
 *
 * (с) Copyright © 2011-present airSlate Inc. (https://www.signnow.com)
 *
 * For more details on copyright, see LICENSE.md file
 * that was distributed with this source code.
 */

package com.signnow.api.embeddedinvite.response;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.signnow.api.embeddedinvite.response.data.DataLink;

/**
 * This class is used to ignore unknown properties from JSON input and to bind JSON to this class.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class DocumentInviteLinkPostResponse {

  /**
   * This property is used to bind JSON property "data" to this Java property.
   */
  @JsonProperty("data")
  private final DataLink data;

  /**
   * This is a constructor for DocumentInviteLinkPostResponse class.
   *
   * @param data The data link object that is to be set.
   */
  public DocumentInviteLinkPostResponse(@JsonProperty("data") DataLink data) {
    this.data = data;
  }

  /**
   * This method is used to get the data link object.
   *
   * @return The data link object.
   */
  public DataLink getData() {
    return this.data;
  }
}
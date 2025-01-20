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

/**
 * This class represents the response received after cancelling a free form invite.
 * It ignores unknown properties during JSON serialization and deserialization.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class CancelFreeFormInvitePutResponse {

  /**
   * The unique identifier of the cancelled free form invite.
   */
  @JsonProperty("id")
  private final String id;

  /**
   * Constructs a new CancelFreeFormInvitePutResponse with the specified id.
   *
   * @param id the unique identifier of the cancelled free form invite
   */
  public CancelFreeFormInvitePutResponse(@JsonProperty("id") String id) {
    this.id = id;
  }

  /**
   * Returns the unique identifier of the cancelled free form invite.
   *
   * @return the unique identifier of the cancelled free form invite
   */
  public String getId() {
    return this.id;
  }
}
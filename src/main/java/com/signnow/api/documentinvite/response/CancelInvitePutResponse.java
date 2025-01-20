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
 * This class represents the response received after cancelling an invite.
 * It ignores unknown properties during JSON processing.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class CancelInvitePutResponse {

  /**
   * The status of the cancellation response.
   */
  @JsonProperty("status")
  private final String status;

  /**
   * Constructs a new CancelInvitePutResponse with the specified status.
   *
   * @param status the status of the cancellation response
   */
  public CancelInvitePutResponse(@JsonProperty("status") String status) {
    this.status = status;
  }

  /**
   * Returns the status of the cancellation response.
   *
   * @return the status of the cancellation response
   */
  public String getStatus() {
    return this.status;
  }
}
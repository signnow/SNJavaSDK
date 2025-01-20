/*
 * This file is a part of signNow SDK API client.
 *
 * (с) Copyright © 2011-present airSlate Inc. (https://www.signnow.com)
 *
 * For more details on copyright, see LICENSE.md file
 * that was distributed with this source code.
 */

package com.signnow.api.documentgroupinvite.response;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * This class represents the response received after cancelling a group invite.
 * It ignores unknown properties during JSON processing.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class CancelGroupInvitePostResponse {

  /**
   * The status of the cancellation request.
   */
  @JsonProperty("status")
  private final String status;

  /**
   * Constructs a new CancelGroupInvitePostResponse with the specified status.
   *
   * @param status the status of the cancellation request
   */
  public CancelGroupInvitePostResponse(@JsonProperty("status") String status) {
    this.status = status;
  }

  /**
   * Returns the status of the cancellation request.
   *
   * @return the status of the cancellation request
   */
  public String getStatus() {
    return this.status;
  }
}
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
 * This class is used to handle the response from the ResendGroupInvitePost API.
 * It ignores unknown JSON properties using Jackson annotation.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class ResendGroupInvitePostResponse {

  /**
   * The status of the resend group invite post response.
   */
  @JsonProperty("status")
  private final String status;

  /**
   * Constructs a new ResendGroupInvitePostResponse with the specified status.
   *
   * @param status the status of the resend group invite post response
   */
  public ResendGroupInvitePostResponse(@JsonProperty("status") String status) {
    this.status = status;
  }

  /**
   * Returns the status of the resend group invite post response.
   *
   * @return the status of the resend group invite post response
   */
  public String getStatus() {
    return this.status;
  }
}
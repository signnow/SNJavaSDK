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
 * This class is used to handle the response from the Reset Password API.
 * It ignores unknown properties using the @JsonIgnoreProperties annotation.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class ResetPasswordPostResponse {

  /**
   * The status of the reset password response.
   */
  @JsonProperty("status")
  private final String status;

  /**
   * Constructor for the ResetPasswordPostResponse class.
   *
   * @param status The status of the reset password response.
   */
  public ResetPasswordPostResponse(@JsonProperty("status") String status) {
    this.status = status;
  }

  /**
   * This method is used to get the status of the reset password response.
   *
   * @return String This returns the status of the reset password response.
   */
  public String getStatus() {
    return this.status;
  }
}
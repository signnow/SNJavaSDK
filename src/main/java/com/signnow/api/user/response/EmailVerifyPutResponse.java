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
 * This class is used to handle the response from the Email verification API.
 * It ignores unknown properties in the JSON response using the @JsonIgnoreProperties annotation.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class EmailVerifyPutResponse {

  /**
   * The email address that was verified.
   */
  @JsonProperty("email")
  private final String email;

  /**
   * Constructor for the EmailVerifyPutResponse class.
   *
   * @param email The email address that was verified. It is annotated with @JsonProperty to map the JSON property to this field.
   */
  public EmailVerifyPutResponse(@JsonProperty("email") String email) {
    this.email = email;
  }

  /**
   * This method is used to get the verified email address.
   *
   * @return String This returns the verified email address.
   */
  public String getEmail() {
    return this.email;
  }
}
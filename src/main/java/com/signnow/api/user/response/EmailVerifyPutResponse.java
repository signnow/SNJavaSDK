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
public class EmailVerifyPutResponse {

  @JsonProperty("email")
  private final String email;

  public EmailVerifyPutResponse(@JsonProperty("email") String email) {
    this.email = email;
  }

  public String getEmail() {
    return this.email;
  }
}

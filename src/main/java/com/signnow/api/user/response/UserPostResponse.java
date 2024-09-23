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
public class UserPostResponse {

  @JsonProperty("id")
  private final String id;

  @JsonProperty("verified")
  private final int verified;

  @JsonProperty("email")
  private final String email;

  public UserPostResponse(
      @JsonProperty("id") String id,
      @JsonProperty("verified") int verified,
      @JsonProperty("email") String email) {
    this.id = id;
    this.verified = verified;
    this.email = email;
  }

  public String getId() {
    return this.id;
  }

  public int getVerified() {
    return this.verified;
  }

  public String getEmail() {
    return this.email;
  }
}

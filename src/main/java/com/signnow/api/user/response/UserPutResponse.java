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
public class UserPutResponse {

  @JsonProperty("id")
  private final String id;

  @JsonProperty("first_name")
  private final String firstName;

  @JsonProperty("last_name")
  private final String lastName;

  public UserPutResponse(
      @JsonProperty("id") String id,
      @JsonProperty("first_name") String firstName,
      @JsonProperty("last_name") String lastName) {
    this.id = id;
    this.firstName = firstName;
    this.lastName = lastName;
  }

  public String getId() {
    return this.id;
  }

  public String getFirstName() {
    return this.firstName;
  }

  public String getLastName() {
    return this.lastName;
  }
}

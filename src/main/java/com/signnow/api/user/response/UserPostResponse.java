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
 * This class represents the response from a User POST request.
 * It ignores unknown properties in the JSON response.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class UserPostResponse {

  /**
   * The unique identifier of the user.
   */
  @JsonProperty("id")
  private final String id;

  /**
   * The verification status of the user.
   */
  @JsonProperty("verified")
  private final int verified;

  /**
   * The email address of the user.
   */
  @JsonProperty("email")
  private final String email;

  /**
   * Constructs a new UserPostResponse with the specified id, verification status, and email.
   *
   * @param id the unique identifier of the user
   * @param verified the verification status of the user
   * @param email the email address of the user
   */
  public UserPostResponse(
      @JsonProperty("id") String id,
      @JsonProperty("verified") int verified,
      @JsonProperty("email") String email) {
    this.id = id;
    this.verified = verified;
    this.email = email;
  }

  /**
   * Returns the unique identifier of the user.
   *
   * @return the unique identifier of the user
   */
  public String getId() {
    return this.id;
  }

  /**
   * Returns the verification status of the user.
   *
   * @return the verification status of the user
   */
  public int getVerified() {
    return this.verified;
  }

  /**
   * Returns the email address of the user.
   *
   * @return the email address of the user
   */
  public String getEmail() {
    return this.email;
  }
}
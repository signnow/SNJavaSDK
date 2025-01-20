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
 * This class represents the response from a PUT request to the User API.
 * It ignores unknown properties in the JSON response using the @JsonIgnoreProperties annotation.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class UserPutResponse {

  /**
   * The unique identifier for the user.
   */
  @JsonProperty("id")
  private final String id;

  /**
   * The first name of the user.
   */
  @JsonProperty("first_name")
  private final String firstName;

  /**
   * The last name of the user.
   */
  @JsonProperty("last_name")
  private final String lastName;

  /**
   * Constructs a new UserPutResponse with the specified id, first name, and last name.
   *
   * @param id        the unique identifier for the user
   * @param firstName the first name of the user
   * @param lastName  the last name of the user
   */
  public UserPutResponse(
      @JsonProperty("id") String id,
      @JsonProperty("first_name") String firstName,
      @JsonProperty("last_name") String lastName) {
    this.id = id;
    this.firstName = firstName;
    this.lastName = lastName;
  }

  /**
   * Returns the unique identifier for the user.
   *
   * @return the unique identifier for the user
   */
  public String getId() {
    return this.id;
  }

  /**
   * Returns the first name of the user.
   *
   * @return the first name of the user
   */
  public String getFirstName() {
    return this.firstName;
  }

  /**
   * Returns the last name of the user.
   *
   * @return the last name of the user
   */
  public String getLastName() {
    return this.lastName;
  }
}
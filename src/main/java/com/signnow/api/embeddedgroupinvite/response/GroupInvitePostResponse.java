/*
 * This file is a part of signNow SDK API client.
 *
 * (с) Copyright © 2011-present airSlate Inc. (https://www.signnow.com)
 *
 * For more details on copyright, see LICENSE.md file
 * that was distributed with this source code.
 */

package com.signnow.api.embeddedgroupinvite.response;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.signnow.api.embeddedgroupinvite.response.data.DataInvite;

/**
 * This class is used to handle the response from the Group Invite Post API.
 * It ignores unknown properties using the @JsonIgnoreProperties annotation.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class GroupInvitePostResponse {

  /**
   * The data property holds the response data from the Group Invite Post API.
   * It is annotated with @JsonProperty to map the JSON property to this Java field.
   */
  @JsonProperty("data")
  private final DataInvite data;

  /**
   * This is the constructor for the GroupInvitePostResponse class.
   * It initializes the data property with the provided DataInvite object.
   *
   * @param data The DataInvite object that contains the response data from the Group Invite Post API.
   */
  public GroupInvitePostResponse(@JsonProperty("data") DataInvite data) {
    this.data = data;
  }

  /**
   * This method is used to get the DataInvite object that contains the response data from the Group Invite Post API.
   *
   * @return The DataInvite object that contains the response data from the Group Invite Post API.
   */
  public DataInvite getData() {
    return this.data;
  }
}
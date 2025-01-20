/*
 * This file is a part of signNow SDK API client.
 *
 * (с) Copyright © 2011-present airSlate Inc. (https://www.signnow.com)
 *
 * For more details on copyright, see LICENSE.md file
 * that was distributed with this source code.
 */

package com.signnow.api.embeddedinvite.response;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.signnow.api.embeddedinvite.response.data.DataInviteCollection;

/**
 * This class is used to handle the response from the Document Invite Post API.
 * It ignores unknown properties during the JSON parsing process.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class DocumentInvitePostResponse {

  /**
   * The data property holds the collection of data invites.
   */
  @JsonProperty("data")
  private final DataInviteCollection data;

  /**
   * This is the constructor for the DocumentInvitePostResponse class.
   *
   * @param data The collection of data invites. It is annotated with @JsonProperty to map the JSON property to this Java field.
   */
  public DocumentInvitePostResponse(@JsonProperty("data") DataInviteCollection data) {
    this.data = data;
  }

  /**
   * This method is used to get the collection of data invites.
   *
   * @return The collection of data invites.
   */
  public DataInviteCollection getData() {
    return this.data;
  }
}
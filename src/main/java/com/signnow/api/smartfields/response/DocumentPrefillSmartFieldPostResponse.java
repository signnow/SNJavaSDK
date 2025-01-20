/*
 * This file is a part of signNow SDK API client.
 *
 * (с) Copyright © 2011-present airSlate Inc. (https://www.signnow.com)
 *
 * For more details on copyright, see LICENSE.md file
 * that was distributed with this source code.
 */

package com.signnow.api.smartfields.response;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * This class is used to handle the response from the DocumentPrefillSmartFieldPost API.
 * It ignores unknown JSON properties using the @JsonIgnoreProperties annotation.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class DocumentPrefillSmartFieldPostResponse {

  /**
   * The status of the response.
   */
  @JsonProperty("status")
  private final String status;

  /**
   * This constructor is used to create a new instance of DocumentPrefillSmartFieldPostResponse.
   * It takes a string parameter which represents the status of the response.
   *
   * @param status The status of the response.
   */
  public DocumentPrefillSmartFieldPostResponse(@JsonProperty("status") String status) {
    this.status = status;
  }

  /**
   * This method is used to get the status of the response.
   *
   * @return String This returns the status of the response.
   */
  public String getStatus() {
    return this.status;
  }
}
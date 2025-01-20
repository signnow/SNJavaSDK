/*
 * This file is a part of signNow SDK API client.
 *
 * (с) Copyright © 2011-present airSlate Inc. (https://www.signnow.com)
 *
 * For more details on copyright, see LICENSE.md file
 * that was distributed with this source code.
 */

package com.signnow.api.template.response;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * This class represents the response from a POST request to a Template API.
 * It ignores any unknown properties in the JSON response.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class TemplatePostResponse {

  /**
   * The unique identifier of the template.
   */
  @JsonProperty("id")
  private String id;

  /**
   * This method is used to get the unique identifier of the template.
   *
   * @return String This returns the unique identifier of the template.
   */
  public String getId() {
    return this.id;
  }
}
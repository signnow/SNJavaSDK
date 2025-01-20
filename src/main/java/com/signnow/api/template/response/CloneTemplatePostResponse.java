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
 * This class represents the response received after cloning a template.
 * It ignores unknown properties during JSON serialization and deserialization.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class CloneTemplatePostResponse {

  /**
   * The unique identifier of the cloned template.
   */
  @JsonProperty("id")
  private final String id;

  /**
   * The name of the cloned template.
   */
  @JsonProperty("name")
  private final String name;

  /**
   * Constructs a new CloneTemplatePostResponse with the specified id and name.
   *
   * @param id   the unique identifier of the cloned template
   * @param name the name of the cloned template
   */
  public CloneTemplatePostResponse(
      @JsonProperty("id") String id, @JsonProperty("name") String name) {
    this.id = id;
    this.name = name;
  }

  /**
   * Returns the unique identifier of the cloned template.
   *
   * @return the id of the cloned template
   */
  public String getId() {
    return this.id;
  }

  /**
   * Returns the name of the cloned template.
   *
   * @return the name of the cloned template
   */
  public String getName() {
    return this.name;
  }
}
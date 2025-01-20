/*
 * This file is a part of signNow SDK API client.
 *
 * (с) Copyright © 2011-present airSlate Inc. (https://www.signnow.com)
 *
 * For more details on copyright, see LICENSE.md file
 * that was distributed with this source code.
 */

package com.signnow.api.documentinvite.response;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * This class represents the response from a FreeFormInvite post request.
 * It ignores unknown properties when parsing JSON.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class FreeFormInvitePostResponse {

  /**
   * The result of the post request.
   */
  @JsonProperty("result")
  private final String result;

  /**
   * The id of the post request.
   */
  @JsonProperty("id")
  private final String id;

  /**
   * The callback URL of the post request.
   */
  @JsonProperty("callback_url")
  private final String callbackUrl;

  /**
   * Constructs a new FreeFormInvitePostResponse with the specified result, id, and callback URL.
   *
   * @param result the result of the post request
   * @param id the id of the post request
   * @param callbackUrl the callback URL of the post request
   */
  public FreeFormInvitePostResponse(
      @JsonProperty("result") String result,
      @JsonProperty("id") String id,
      @JsonProperty("callback_url") String callbackUrl) {
    this.result = result;
    this.id = id;
    this.callbackUrl = callbackUrl;
  }

  /**
   * Returns the result of the post request.
   *
   * @return the result of the post request
   */
  public String getResult() {
    return this.result;
  }

  /**
   * Returns the id of the post request.
   *
   * @return the id of the post request
   */
  public String getId() {
    return this.id;
  }

  /**
   * Returns the callback URL of the post request.
   *
   * @return the callback URL of the post request
   */
  public String getCallbackUrl() {
    return this.callbackUrl;
  }
}
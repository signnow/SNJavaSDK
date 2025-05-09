/*
 * This file is a part of signNow SDK API client.
 *
 * (с) Copyright © 2011-present airSlate Inc. (https://www.signnow.com)
 *
 * For more details on copyright, see LICENSE.md file
 * that was distributed with this source code.
 */

package com.signnow.api.proxy.response;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.databind.JsonNode;

/**
 * This class represents the response received after a request to proxy any unimplemented endpoint
 * that returns JSON data.
 */
public class ProxyJsonResponse {
  /** The raw JSON content returned from the proxied endpoint. */
  private final JsonNode rawJson;

  /**
   * Constructs a new ProxyJsonResponse with the specified raw JSON.
   *
   * @param rawJson the raw JSON content returned from the proxied endpoint
   */
  @JsonCreator
  public ProxyJsonResponse(JsonNode rawJson) {
    this.rawJson = rawJson;
  }

  /**
   * Returns the raw JSON content returned from the proxied endpoint.
   *
   * @return the raw JSON content
   */
  public JsonNode getRawJson() {
    return rawJson;
  }

  /**
   * Returns the string representation of the raw JSON in pretty-print format.
   *
   * @return the pretty-printed JSON string
   */
  @Override
  public String toString() {
    return rawJson.toPrettyString();
  }
}

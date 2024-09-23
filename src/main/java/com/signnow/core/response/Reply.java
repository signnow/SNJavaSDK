/*
 * This file is a part of signNow SDK API client.
 *
 * (с) Copyright © 2011-present airSlate Inc. (https://www.signnow.com)
 *
 * For more details on copyright, see LICENSE.md file
 * that was distributed with this source code.
 */

package com.signnow.core.response;

public class Reply<R> {
  private final Integer httpStatusCode;
  private final String json;
  private final R response;

  public Reply(Integer httpStatusCode, String json, R response) {
    this.httpStatusCode = httpStatusCode;
    this.json = json;
    this.response = response;
  }

  // Returns the server response status code
  public int getStatusCode() {
    return this.httpStatusCode;
  }

  // Returns true for a successful response
  public boolean isOk() {
    return this.httpStatusCode >= 200 && this.httpStatusCode < 300;
  }

  // Returns true when the response has no body
  public boolean isEmpty() {
    if (this.response == null) {
      return true;
    }
    return this.response.getClass().getDeclaredFields().length == 0;
  }

  // Returns the raw JSON string of the response
  public String toJson() {
    return this.json;
  }

  // Returns a data object containing the deserialized response body
  public R getResponse() {
    return this.response;
  }
}

/*
 * This file is a part of signNow SDK API client.
 *
 * (с) Copyright © 2011-present airSlate Inc. (https://www.signnow.com)
 *
 * For more details on copyright, see LICENSE.md file
 * that was distributed with this source code.
 */

package com.signnow.core.response;

/**
 * This class represents a server reply.
 *
 * @param <R> the type of the response body
 */
public class Reply<R> {
  private final Integer httpStatusCode;
  private final String json;
  private final R response;

  /**
   * Constructs a new Reply object.
   *
   * @param httpStatusCode the HTTP status code of the server response
   * @param json the raw JSON string of the server response
   * @param response the deserialized response body
   */
  public Reply(Integer httpStatusCode, String json, R response) {
    this.httpStatusCode = httpStatusCode;
    this.json = json;
    this.response = response;
  }

  /**
   * Returns the HTTP status code of the server response.
   *
   * @return the HTTP status code
   */
  public int getStatusCode() {
    return this.httpStatusCode;
  }

  /**
   * Checks if the server response was successful.
   *
   * @return true if the HTTP status code is in the range 200-299, false otherwise
   */
  public boolean isOk() {
    return this.httpStatusCode >= 200 && this.httpStatusCode < 300;
  }

  /**
   * Checks if the server response has no body.
   *
   * @return true if the response body is null or has no fields, false otherwise
   */
  public boolean isEmpty() {
    if (this.response == null) {
      return true;
    }
    return this.response.getClass().getDeclaredFields().length == 0;
  }

  /**
   * Returns the raw JSON string of the server response.
   *
   * @return the raw JSON string
   */
  public String toJson() {
    return this.json;
  }

  /**
   * Returns the deserialized response body.
   *
   * @return the response body
   */
  public R getResponse() {
    return this.response;
  }
}
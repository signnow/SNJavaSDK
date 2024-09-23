/*
 * This file is a part of signNow SDK API client.
 *
 * (с) Copyright © 2011-present airSlate Inc. (https://www.signnow.com)
 *
 * For more details on copyright, see LICENSE.md file
 * that was distributed with this source code.
 */

package com.signnow.core.exception;

public class SignNowApiException extends Exception {
  private final String endpoint;
  private final String payload;
  private final String response;
  private final Integer responseCode;

  public SignNowApiException(String message, Throwable cause) {
    super(message, cause);

    this.endpoint = null;
    this.payload = null;
    this.response = null;
    this.responseCode = null;
  }

  public SignNowApiException(String message, String endpoint) {
    super(message);

    this.endpoint = endpoint;
    this.payload = null;
    this.response = null;
    this.responseCode = null;
  }

  public SignNowApiException(
      String message,
      String endpoint,
      String payload,
      String response,
      Integer responseCode,
      Throwable cause) {
    super(message, cause);

    this.endpoint = endpoint;
    this.payload = payload;
    this.response = response;
    this.responseCode = responseCode;
  }

  @Override
  public String getMessage() {
    return String.format(
        "%s\n%s\nStatus: %s,\nResponse: %s\nRequest: %s\nDetails: %s",
        super.getMessage(),
        this.endpoint == null ? "" : this.endpoint,
        this.responseCode == null ? "?" : String.format("%d", this.responseCode),
        this.response == null ? "" : this.response,
        this.payload == null ? "" : this.payload,
        this.getCause() == null ? "" : this.getCause().getMessage());
  }
}

/*
 * This file is a part of signNow SDK API client.
 *
 * (с) Copyright © 2011-present airSlate Inc. (https://www.signnow.com)
 *
 * For more details on copyright, see LICENSE.md file
 * that was distributed with this source code.
 */

package com.signnow.core.exception;

/**
 * This class represents an exception that is thrown when an error occurs in the SignNow API.
 */
public class SignNowApiException extends Exception {
  /**
   * The endpoint that was called when the exception occurred.
   */
  private final String endpoint;
  
  /**
   * The payload that was sent when the exception occurred.
   */
  private final String payload;
  
  /**
   * The response that was received when the exception occurred.
   */
  private final String response;
  
  /**
   * The HTTP status code that was received when the exception occurred.
   */
  private final Integer responseCode;

  /**
   * Constructs a new SignNowApiException with the specified detail message and cause.
   *
   * @param message the detail message (which is saved for later retrieval by the Throwable.getMessage() method).
   * @param cause the cause (which is saved for later retrieval by the Throwable.getCause() method).
   */
  public SignNowApiException(String message, Throwable cause) {
    super(message, cause);

    this.endpoint = null;
    this.payload = null;
    this.response = null;
    this.responseCode = null;
  }

  /**
   * Constructs a new SignNowApiException with the specified detail message and endpoint.
   *
   * @param message the detail message (which is saved for later retrieval by the Throwable.getMessage() method).
   * @param endpoint the endpoint that was called when the exception occurred.
   */
  public SignNowApiException(String message, String endpoint) {
    super(message);

    this.endpoint = endpoint;
    this.payload = null;
    this.response = null;
    this.responseCode = null;
  }

  /**
   * Constructs a new SignNowApiException with the specified detail message, endpoint, payload, response, response code and cause.
   *
   * @param message the detail message (which is saved for later retrieval by the Throwable.getMessage() method).
   * @param endpoint the endpoint that was called when the exception occurred.
   * @param payload the payload that was sent when the exception occurred.
   * @param response the response that was received when the exception occurred.
   * @param responseCode the HTTP status code that was received when the exception occurred.
   * @param cause the cause (which is saved for later retrieval by the Throwable.getCause() method).
   */
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

  /**
   * Returns the detail message string of this throwable.
   *
   * @return the detail message string of this Throwable instance (which may be null).
   */
  @Override
  public String getMessage() {
    return String.format(
        "%s\n%s\nStatus: %s,\nResponse: %s\nRequest: %s\nMessage: %s",
        super.getMessage(),
        this.endpoint == null ? "" : this.endpoint,
        this.responseCode == null ? "?" : String.format("%d", this.responseCode),
        this.response == null ? "" : this.response,
        this.payload == null ? "" : this.payload,
        this.getCause() == null ? "" : this.getCause().getMessage());
  }
}

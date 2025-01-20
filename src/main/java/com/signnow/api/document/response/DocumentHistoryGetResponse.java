/*
 * This file is a part of signNow SDK API client.
 *
 * (с) Copyright © 2011-present airSlate Inc. (https://www.signnow.com)
 *
 * For more details on copyright, see LICENSE.md file
 * that was distributed with this source code.
 */

package com.signnow.api.document.response;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.signnow.api.document.response.data.JsonAttribute;

/**
 * This class represents the response from the Document History Get API.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class DocumentHistoryGetResponse {

  /**
   * The unique identifier of the document history.
   */
  @JsonProperty("unique_id")
  private final String uniqueId;

  /**
   * The user identifier associated with the document history.
   */
  @JsonProperty("user_id")
  private final String userId;

  /**
   * The document identifier associated with the document history.
   */
  @JsonProperty("document_id")
  private final String documentId;

  /**
   * The client application name associated with the document history.
   */
  @JsonProperty("client_app_name")
  private final String clientAppName;

  /**
   * The IP address associated with the document history.
   */
  @JsonProperty("ip_address")
  private final String ipAddress;

  /**
   * The email associated with the document history.
   */
  @JsonProperty("email")
  private final String email;

  /**
   * The JSON attributes associated with the document history.
   */
  @JsonProperty("json_attributes")
  private final JsonAttribute jsonAttributes;

  /**
   * The creation timestamp of the document history.
   */
  @JsonProperty("created")
  private final int created;

  /**
   * The event associated with the document history.
   */
  @JsonProperty("event")
  private final String event;

  /**
   * The field identifier associated with the document history.
   */
  @JsonProperty("field_id")
  private final String fieldId;

  /**
   * The element identifier associated with the document history.
   */
  @JsonProperty("element_id")
  private final String elementId;

  /**
   * The client timestamp associated with the document history.
   */
  @JsonProperty("client_timestamp")
  private final int clientTimestamp;

  /**
   * The origin associated with the document history.
   */
  @JsonProperty("origin")
  private final String origin;

  /**
   * Constructs a new DocumentHistoryGetResponse with the specified details.
   *
   * @param uniqueId the unique identifier of the document history
   * @param userId the user identifier associated with the document history
   * @param documentId the document identifier associated with the document history
   * @param clientAppName the client application name associated with the document history
   * @param ipAddress the IP address associated with the document history
   * @param email the email associated with the document history
   * @param jsonAttributes the JSON attributes associated with the document history
   * @param created the creation timestamp of the document history
   * @param event the event associated with the document history
   * @param fieldId the field identifier associated with the document history
   * @param elementId the element identifier associated with the document history
   * @param clientTimestamp the client timestamp associated with the document history
   * @param origin the origin associated with the document history
   */
  public DocumentHistoryGetResponse(
      @JsonProperty("unique_id") String uniqueId,
      @JsonProperty("user_id") String userId,
      @JsonProperty("document_id") String documentId,
      @JsonProperty("client_app_name") String clientAppName,
      @JsonProperty("ip_address") String ipAddress,
      @JsonProperty("email") String email,
      @JsonProperty("json_attributes") JsonAttribute jsonAttributes,
      @JsonProperty("created") int created,
      @JsonProperty("event") String event,
      @JsonProperty("field_id") String fieldId,
      @JsonProperty("element_id") String elementId,
      @JsonProperty("client_timestamp") int clientTimestamp,
      @JsonProperty("origin") String origin) {
    this.uniqueId = uniqueId;
    this.userId = userId;
    this.documentId = documentId;
    this.clientAppName = clientAppName;
    this.ipAddress = ipAddress;
    this.email = email;
    this.jsonAttributes = jsonAttributes;
    this.created = created;
    this.event = event;
    this.fieldId = fieldId;
    this.elementId = elementId;
    this.clientTimestamp = clientTimestamp;
    this.origin = origin;
  }

  /**
   * Returns the unique identifier of the document history.
   *
   * @return the unique identifier of the document history
   */
  public String getUniqueId() {
    return this.uniqueId;
  }

  /**
   * Returns the user identifier associated with the document history.
   *
   * @return the user identifier associated with the document history
   */
  public String getUserId() {
    return this.userId;
  }

  /**
   * Returns the document identifier associated with the document history.
   *
   * @return the document identifier associated with the document history
   */
  public String getDocumentId() {
    return this.documentId;
  }

  /**
   * Returns the client application name associated with the document history.
   *
   * @return the client application name associated with the document history
   */
  public String getClientAppName() {
    return this.clientAppName;
  }

  /**
   * Returns the IP address associated with the document history.
   *
   * @return the IP address associated with the document history
   */
  public String getIpAddress() {
    return this.ipAddress;
  }

  /**
   * Returns the email associated with the document history.
   *
   * @return the email associated with the document history
   */
  public String getEmail() {
    return this.email;
  }

  /**
   * Returns the JSON attributes associated with the document history.
   *
   * @return the JSON attributes associated with the document history
   */
  public JsonAttribute getJsonAttributes() {
    return this.jsonAttributes;
  }

  /**
   * Returns the creation timestamp of the document history.
   *
   * @return the creation timestamp of the document history
   */
  public int getCreated() {
    return this.created;
  }

  /**
   * Returns the event associated with the document history.
   *
   * @return the event associated with the document history
   */
  public String getEvent() {
    return this.event;
  }

  /**
   * Returns the field identifier associated with the document history.
   *
   * @return the field identifier associated with the document history
   */
  public String getFieldId() {
    return this.fieldId;
  }

  /**
   * Returns the element identifier associated with the document history.
   *
   * @return the element identifier associated with the document history
   */
  public String getElementId() {
    return this.elementId;
  }

  /**
   * Returns the client timestamp associated with the document history.
   *
   * @return the client timestamp associated with the document history
   */
  public int getClientTimestamp() {
    return this.clientTimestamp;
  }

  /**
   * Returns the origin associated with the document history.
   *
   * @return the origin associated with the document history
   */
  public String getOrigin() {
    return this.origin;
  }
}
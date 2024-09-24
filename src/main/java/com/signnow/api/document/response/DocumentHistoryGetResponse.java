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

@JsonIgnoreProperties(ignoreUnknown = true)
public class DocumentHistoryGetResponse {

  @JsonProperty("unique_id")
  private final String uniqueId;

  @JsonProperty("user_id")
  private final String userId;

  @JsonProperty("document_id")
  private final String documentId;

  @JsonProperty("client_app_name")
  private final String clientAppName;

  @JsonProperty("ip_address")
  private final String ipAddress;

  @JsonProperty("email")
  private final String email;

  @JsonProperty("json_attributes")
  private final JsonAttribute jsonAttributes;

  @JsonProperty("created")
  private final int created;

  @JsonProperty("event")
  private final String event;

  @JsonProperty("field_id")
  private final String fieldId;

  @JsonProperty("element_id")
  private final String elementId;

  @JsonProperty("client_timestamp")
  private final int clientTimestamp;

  @JsonProperty("origin")
  private final String origin;

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

  public String getUniqueId() {
    return this.uniqueId;
  }

  public String getUserId() {
    return this.userId;
  }

  public String getDocumentId() {
    return this.documentId;
  }

  public String getClientAppName() {
    return this.clientAppName;
  }

  public String getIpAddress() {
    return this.ipAddress;
  }

  public String getEmail() {
    return this.email;
  }

  public JsonAttribute getJsonAttributes() {
    return this.jsonAttributes;
  }

  public int getCreated() {
    return this.created;
  }

  public String getEvent() {
    return this.event;
  }

  public String getFieldId() {
    return this.fieldId;
  }

  public String getElementId() {
    return this.elementId;
  }

  public int getClientTimestamp() {
    return this.clientTimestamp;
  }

  public String getOrigin() {
    return this.origin;
  }
}

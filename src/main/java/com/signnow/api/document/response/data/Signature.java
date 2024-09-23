/*
 * This file is a part of signNow SDK API client.
 *
 * (с) Copyright © 2011-present airSlate Inc. (https://www.signnow.com)
 *
 * For more details on copyright, see LICENSE.md file
 * that was distributed with this source code.
 */

package com.signnow.api.document.response.data;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.signnow.core.data.ApiData;
import java.util.LinkedHashMap;
import java.util.Map;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

public final class Signature extends ApiData {

  @JsonProperty("id")
  private final String id;

  @JsonProperty("user_id")
  private final String userId;

  @JsonProperty("signature_request_id")
  private final String signatureRequestId;

  @JsonProperty("email")
  private final String email;

  @JsonProperty("page_number")
  private final String pageNumber;

  @JsonProperty("width")
  private final String width;

  @JsonProperty("height")
  private final String height;

  @JsonProperty("x")
  private final String x;

  @JsonProperty("y")
  private final String y;

  @JsonProperty("subtype")
  private final String subtype;

  @JsonProperty("allow_editing")
  private final boolean allowEditing;

  @JsonProperty("created")
  private final int created;

  @JsonProperty("owner_as_recipient")
  private final boolean ownerAsRecipient;

  @JsonProperty("data")
  private final String data;

  @JsonCreator
  public Signature(
      @JsonProperty("id") String id,
      @JsonProperty("user_id") String userId,
      @JsonProperty("signature_request_id") String signatureRequestId,
      @JsonProperty("email") String email,
      @JsonProperty("page_number") String pageNumber,
      @JsonProperty("width") String width,
      @JsonProperty("height") String height,
      @JsonProperty("x") String x,
      @JsonProperty("y") String y,
      @JsonProperty("subtype") String subtype,
      @JsonProperty("allow_editing") boolean allowEditing,
      @JsonProperty("created") int created,
      @JsonProperty("owner_as_recipient") boolean ownerAsRecipient,
      @JsonProperty("data") String data) {
    this.id = id;
    this.userId = userId;
    this.signatureRequestId = signatureRequestId;
    this.email = email;
    this.pageNumber = pageNumber;
    this.width = width;
    this.height = height;
    this.x = x;
    this.y = y;
    this.subtype = subtype;
    this.allowEditing = allowEditing;
    this.created = created;
    this.ownerAsRecipient = ownerAsRecipient;
    this.data = data;
  }

  public String getId() {
    return this.id;
  }

  public String getUserId() {
    return this.userId;
  }

  public String getSignatureRequestId() {
    return this.signatureRequestId;
  }

  public String getEmail() {
    return this.email;
  }

  public String getPageNumber() {
    return this.pageNumber;
  }

  public String getWidth() {
    return this.width;
  }

  public String getHeight() {
    return this.height;
  }

  public String getX() {
    return this.x;
  }

  public String getY() {
    return this.y;
  }

  public String getSubtype() {
    return this.subtype;
  }

  public boolean isAllowEditing() {
    return this.allowEditing;
  }

  public boolean isOwnerAsRecipient() {
    return this.ownerAsRecipient;
  }

  public int getCreated() {
    return this.created;
  }

  public String getData() {
    return this.data;
  }

  @NotNull
  @Override
  public Map<String, Object> toMap() {
    Map<String, Object> map = new LinkedHashMap<>();
    map.put("id", this.getId());
    map.put("user_id", this.getUserId());
    map.put("signature_request_id", this.getSignatureRequestId());
    map.put("email", this.getEmail());
    map.put("page_number", this.getPageNumber());
    map.put("width", this.getWidth());
    map.put("height", this.getHeight());
    map.put("x", this.getX());
    map.put("y", this.getY());
    map.put("subtype", this.getSubtype());
    map.put("allow_editing", this.isAllowEditing());
    map.put("owner_as_recipient", this.isOwnerAsRecipient());
    map.put("created", this.getCreated());
    map.put("data", this.getData());
    return map;
  }

  @NotNull
  @Contract("_ -> new")
  public static Signature fromMap(@NotNull Map<String, Object> data) {
    return new Signature(
        (String) data.get("id"),
        (String) data.get("user_id"),
        (String) data.get("signature_request_id"),
        (String) data.get("email"),
        (String) data.get("page_number"),
        (String) data.get("width"),
        (String) data.get("height"),
        (String) data.get("x"),
        (String) data.get("y"),
        (String) data.get("subtype"),
        (Boolean) data.get("allow_editing"),
        (Integer) data.get("created"),
        (Boolean) data.getOrDefault("owner_as_recipient", false),
        (String) data.getOrDefault("data", ""));
  }
}

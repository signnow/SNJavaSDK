/*
 * This file is a part of signNow SDK API client.
 *
 * (с) Copyright © 2011-present airSlate Inc. (https://www.signnow.com)
 *
 * For more details on copyright, see LICENSE.md file
 * that was distributed with this source code.
 */

package com.signnow.api.document.request.data;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.signnow.core.data.ApiData;
import java.util.LinkedHashMap;
import java.util.Map;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

public final class Signature extends ApiData {

  @JsonProperty("x")
  private final int x;

  @JsonProperty("y")
  private final int y;

  @JsonProperty("width")
  private final int width;

  @JsonProperty("height")
  private final int height;

  @JsonProperty("page_number")
  private final int pageNumber;

  @JsonProperty("data")
  private final String data;

  @JsonProperty("subtype")
  private final String subtype;

  @JsonProperty("signature_request_id")
  private final String signatureRequestId;

  @JsonProperty("field_id")
  private final String fieldId;

  @JsonProperty("signing_reason")
  private final String signingReason;

  @JsonProperty("owner_as_recipient")
  private final boolean ownerAsRecipient;

  @JsonCreator
  public Signature(
      @JsonProperty("x") int x,
      @JsonProperty("y") int y,
      @JsonProperty("width") int width,
      @JsonProperty("height") int height,
      @JsonProperty("page_number") int pageNumber,
      @JsonProperty("data") String data,
      @JsonProperty("subtype") String subtype,
      @JsonProperty("signature_request_id") String signatureRequestId,
      @JsonProperty("field_id") String fieldId,
      @JsonProperty("signing_reason") String signingReason,
      @JsonProperty("owner_as_recipient") boolean ownerAsRecipient) {
    this.x = x;
    this.y = y;
    this.width = width;
    this.height = height;
    this.pageNumber = pageNumber;
    this.data = data;
    this.subtype = subtype;
    this.signatureRequestId = signatureRequestId;
    this.fieldId = fieldId;
    this.signingReason = signingReason;
    this.ownerAsRecipient = ownerAsRecipient;
  }

  public Signature(
      @JsonProperty("x") int x,
      @JsonProperty("y") int y,
      @JsonProperty("width") int width,
      @JsonProperty("height") int height,
      @JsonProperty("page_number") int pageNumber,
      @JsonProperty("data") String data) {
    this.x = x;
    this.y = y;
    this.width = width;
    this.height = height;
    this.pageNumber = pageNumber;
    this.data = data;
    this.subtype = "signature";
    this.signatureRequestId = null;
    this.fieldId = null;
    this.signingReason = null;
    this.ownerAsRecipient = false;
  }

  public int getX() {
    return this.x;
  }

  public int getY() {
    return this.y;
  }

  public int getWidth() {
    return this.width;
  }

  public int getHeight() {
    return this.height;
  }

  public int getPageNumber() {
    return this.pageNumber;
  }

  public String getSubtype() {
    return this.subtype;
  }

  public String getSignatureRequestId() {
    return this.signatureRequestId;
  }

  public String getFieldId() {
    return this.fieldId;
  }

  public String getSigningReason() {
    return this.signingReason;
  }

  public boolean isOwnerAsRecipient() {
    return this.ownerAsRecipient;
  }

  public String getData() {
    return this.data;
  }

  @NotNull
  @Override
  public Map<String, Object> toMap() {
    Map<String, Object> map = new LinkedHashMap<>();
    map.put("x", this.getX());
    map.put("y", this.getY());
    map.put("width", this.getWidth());
    map.put("height", this.getHeight());
    map.put("page_number", this.getPageNumber());
    map.put("subtype", this.getSubtype());
    map.put("signature_request_id", this.getSignatureRequestId());
    map.put("field_id", this.getFieldId());
    map.put("signing_reason", this.getSigningReason());
    map.put("owner_as_recipient", this.isOwnerAsRecipient());
    map.put("data", this.getData());
    return map;
  }

  @NotNull
  @Contract("_ -> new")
  public static Signature fromMap(@NotNull Map<String, Object> data) {
    return new Signature(
        (int) data.get("x"),
        (int) data.get("y"),
        (int) data.get("width"),
        (int) data.get("height"),
        (int) data.get("page_number"),
        (String) data.get("data"),
        (String) data.getOrDefault("subtype", ""),
        (String) data.getOrDefault("signature_request_id", ""),
        (String) data.getOrDefault("field_id", ""),
        (String) data.getOrDefault("signing_reason", ""),
        (boolean) data.getOrDefault("owner_as_recipient", false));
  }
}

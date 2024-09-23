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

public final class Text extends ApiData {

  @JsonProperty("id")
  private final String id;

  @JsonProperty("font")
  private final String font;

  @JsonProperty("size")
  private final String size;

  @JsonProperty("data")
  private final String data;

  @JsonProperty("page_number")
  private final String pageNumber;

  @JsonProperty("x")
  private final String x;

  @JsonProperty("y")
  private final String y;

  @JsonProperty("subtype")
  private final String subtype;

  @JsonProperty("created")
  private final String created;

  @JsonProperty("align")
  private final String align;

  @JsonProperty("is_width_fixed")
  private final boolean isWidthFixed;

  @JsonProperty("allow_editing")
  private final boolean allowEditing;

  @JsonProperty("owner_as_recipient")
  private final boolean ownerAsRecipient;

  @JsonProperty("user_id")
  private final String userId;

  @JsonProperty("email")
  private final String email;

  @JsonProperty("width")
  private final String width;

  @JsonProperty("height")
  private final String height;

  @JsonProperty("line_height")
  private final float lineHeight;

  @JsonProperty("color")
  private final String color;

  @JsonProperty("italic")
  private final boolean italic;

  @JsonProperty("underline")
  private final boolean underline;

  @JsonProperty("bold")
  private final boolean bold;

  @JsonProperty("original_font_size")
  private final String originalFontSize;

  @JsonProperty("prefill_content_type")
  private final String prefillContentType;

  @JsonProperty("integration_object_id")
  private final String integrationObjectId;

  @JsonCreator
  public Text(
      @JsonProperty("id") String id,
      @JsonProperty("font") String font,
      @JsonProperty("size") String size,
      @JsonProperty("data") String data,
      @JsonProperty("page_number") String pageNumber,
      @JsonProperty("x") String x,
      @JsonProperty("y") String y,
      @JsonProperty("subtype") String subtype,
      @JsonProperty("created") String created,
      @JsonProperty("align") String align,
      @JsonProperty("is_width_fixed") boolean isWidthFixed,
      @JsonProperty("allow_editing") boolean allowEditing,
      @JsonProperty("owner_as_recipient") boolean ownerAsRecipient,
      @JsonProperty("user_id") String userId,
      @JsonProperty("email") String email,
      @JsonProperty("width") String width,
      @JsonProperty("height") String height,
      @JsonProperty("line_height") float lineHeight,
      @JsonProperty("color") String color,
      @JsonProperty("italic") boolean italic,
      @JsonProperty("underline") boolean underline,
      @JsonProperty("bold") boolean bold,
      @JsonProperty("original_font_size") String originalFontSize,
      @JsonProperty("prefill_content_type") String prefillContentType,
      @JsonProperty("integration_object_id") String integrationObjectId) {
    this.id = id;
    this.font = font;
    this.size = size;
    this.data = data;
    this.pageNumber = pageNumber;
    this.x = x;
    this.y = y;
    this.subtype = subtype;
    this.created = created;
    this.align = align;
    this.isWidthFixed = isWidthFixed;
    this.allowEditing = allowEditing;
    this.ownerAsRecipient = ownerAsRecipient;
    this.userId = userId;
    this.email = email;
    this.width = width;
    this.height = height;
    this.lineHeight = lineHeight;
    this.color = color;
    this.italic = italic;
    this.underline = underline;
    this.bold = bold;
    this.originalFontSize = originalFontSize;
    this.prefillContentType = prefillContentType;
    this.integrationObjectId = integrationObjectId;
  }

  public String getId() {
    return this.id;
  }

  public String getUserId() {
    return this.userId;
  }

  public String getEmail() {
    return this.email;
  }

  public String getFont() {
    return this.font;
  }

  public String getSize() {
    return this.size;
  }

  public String getData() {
    return this.data;
  }

  public String getPageNumber() {
    return this.pageNumber;
  }

  public String getX() {
    return this.x;
  }

  public String getY() {
    return this.y;
  }

  public String getWidth() {
    return this.width;
  }

  public String getHeight() {
    return this.height;
  }

  public float getLineHeight() {
    return this.lineHeight;
  }

  public String getSubtype() {
    return this.subtype;
  }

  public String getCreated() {
    return this.created;
  }

  public String getColor() {
    return this.color;
  }

  public boolean isItalic() {
    return this.italic;
  }

  public boolean isUnderline() {
    return this.underline;
  }

  public boolean isBold() {
    return this.bold;
  }

  public String getAlign() {
    return this.align;
  }

  public String getOriginalFontSize() {
    return this.originalFontSize;
  }

  public String getPrefillContentType() {
    return this.prefillContentType;
  }

  public boolean isWidthFixed() {
    return this.isWidthFixed;
  }

  public boolean isAllowEditing() {
    return this.allowEditing;
  }

  public boolean isOwnerAsRecipient() {
    return this.ownerAsRecipient;
  }

  public String getIntegrationObjectId() {
    return this.integrationObjectId;
  }

  @NotNull
  @Override
  public Map<String, Object> toMap() {
    Map<String, Object> map = new LinkedHashMap<>();
    map.put("id", this.getId());
    map.put("user_id", this.getUserId());
    map.put("email", this.getEmail());
    map.put("font", this.getFont());
    map.put("size", this.getSize());
    map.put("data", this.getData());
    map.put("page_number", this.getPageNumber());
    map.put("x", this.getX());
    map.put("y", this.getY());
    map.put("width", this.getWidth());
    map.put("height", this.getHeight());
    map.put("line_height", this.getLineHeight());
    map.put("subtype", this.getSubtype());
    map.put("created", this.getCreated());
    map.put("color", this.getColor());
    map.put("italic", this.isItalic());
    map.put("underline", this.isUnderline());
    map.put("bold", this.isBold());
    map.put("align", this.getAlign());
    map.put("original_font_size", this.getOriginalFontSize());
    map.put("prefill_content_type", this.getPrefillContentType());
    map.put("is_width_fixed", this.isWidthFixed());
    map.put("allow_editing", this.isAllowEditing());
    map.put("owner_as_recipient", this.isOwnerAsRecipient());
    map.put("integration_object_id", this.getIntegrationObjectId());
    return map;
  }

  @NotNull
  @Contract("_ -> new")
  public static Text fromMap(@NotNull Map<String, Object> data) {
    return new Text(
        (String) data.get("id"),
        (String) data.get("font"),
        (String) data.get("size"),
        (String) data.get("data"),
        (String) data.get("page_number"),
        (String) data.get("x"),
        (String) data.get("y"),
        (String) data.get("subtype"),
        (String) data.get("created"),
        (String) data.get("align"),
        (Boolean) data.get("is_width_fixed"),
        (Boolean) data.get("allow_editing"),
        (Boolean) data.get("owner_as_recipient"),
        (String) data.getOrDefault("user_id", null),
        (String) data.getOrDefault("email", ""),
        (String) data.getOrDefault("width", ""),
        (String) data.getOrDefault("height", ""),
        (Float) data.getOrDefault("line_height", 0f),
        (String) data.getOrDefault("color", null),
        (Boolean) data.getOrDefault("italic", false),
        (Boolean) data.getOrDefault("underline", false),
        (Boolean) data.getOrDefault("bold", false),
        (String) data.getOrDefault("original_font_size", null),
        (String) data.getOrDefault("prefill_content_type", null),
        (String) data.getOrDefault("integration_object_id", null));
  }
}

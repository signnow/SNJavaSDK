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
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.signnow.core.data.ApiData;
import java.util.LinkedHashMap;
import java.util.Map;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

/**
 * Text class extends ApiData.
 * Represents the text data in a document.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public final class Text extends ApiData {

  /**
   * The unique identifier of the text.
   */
  @JsonProperty("id")
  private final String id;

  /**
   * The font of the text.
   */
  @JsonProperty("font")
  private final String font;

  /**
   * The size of the text.
   */
  @JsonProperty("size")
  private final String size;

  /**
   * The actual data of the text.
   */
  @JsonProperty("data")
  private final String data;

  /**
   * The page number where the text is located.
   */
  @JsonProperty("page_number")
  private final String pageNumber;

  /**
   * The x-coordinate of the text.
   */
  @JsonProperty("x")
  private final String x;

  /**
   * The y-coordinate of the text.
   */
  @JsonProperty("y")
  private final String y;

  /**
   * The subtype of the text.
   */
  @JsonProperty("subtype")
  private final String subtype;

  /**
   * The creation date of the text.
   */
  @JsonProperty("created")
  private final String created;

  /**
   * The alignment of the text.
   */
  @JsonProperty("align")
  private final String align;

  /**
   * The flag indicating if the width of the text is fixed.
   */
  @JsonProperty("is_width_fixed")
  private final boolean isWidthFixed;

  /**
   * The flag indicating if the text is editable.
   */
  @JsonProperty("allow_editing")
  private final boolean allowEditing;

  /**
   * The flag indicating if the owner is the recipient.
   */
  @JsonProperty("owner_as_recipient")
  private final boolean ownerAsRecipient;

  /**
   * The user id of the owner of the text.
   */
  @JsonProperty("user_id")
  private final String userId;

  /**
   * The email of the owner of the text.
   */
  @JsonProperty("email")
  private final String email;

  /**
   * The width of the text.
   */
  @JsonProperty("width")
  private final Integer width;

  /**
   * The height of the text.
   */
  @JsonProperty("height")
  private final Integer height;

  /**
   * The line height of the text.
   */
  @JsonProperty("line_height")
  private final String lineHeight;

  /**
   * The color of the text.
   */
  @JsonProperty("color")
  private final String color;

  /**
   * The flag indicating if the text is italic.
   */
  @JsonProperty("italic")
  private final boolean italic;

  /**
   * The flag indicating if the text is underlined.
   */
  @JsonProperty("underline")
  private final boolean underline;

  /**
   * The flag indicating if the text is bold.
   */
  @JsonProperty("bold")
  private final boolean bold;

  /**
   * The original font size of the text.
   */
  @JsonProperty("original_font_size")
  private final String originalFontSize;

  /**
   * The prefill content type of the text.
   */
  @JsonProperty("prefill_content_type")
  private final String prefillContentType;

  /**
   * The integration object id of the text.
   */
  @JsonProperty("integration_object_id")
  private final String integrationObjectId;

  /**
   * Constructor for Text class.
   *
   * @param id The unique identifier of the text.
   * @param font The font of the text.
   * @param size The size of the text.
   * @param data The actual data of the text.
   * @param pageNumber The page number where the text is located.
   * @param x The x-coordinate of the text.
   * @param y The y-coordinate of the text.
   * @param subtype The subtype of the text.
   * @param created The creation date of the text.
   * @param align The alignment of the text.
   * @param isWidthFixed The flag indicating if the width of the text is fixed.
   * @param allowEditing The flag indicating if the text is editable.
   * @param ownerAsRecipient The flag indicating if the owner is the recipient.
   * @param userId The user id of the owner of the text.
   * @param email The email of the owner of the text.
   * @param width The width of the text.
   * @param height The height of the text.
   * @param lineHeight The line height of the text.
   * @param color The color of the text.
   * @param italic The flag indicating if the text is italic.
   * @param underline The flag indicating if the text is underlined.
   * @param bold The flag indicating if the text is bold.
   * @param originalFontSize The original font size of the text.
   * @param prefillContentType The prefill content type of the text.
   * @param integrationObjectId The integration object id of the text.
   */
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
      @JsonProperty("width") Integer width,
      @JsonProperty("height") Integer height,
      @JsonProperty("line_height") String lineHeight,
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

  /**
   * Returns the id of the text.
   *
   * @return The id of the text.
   */
  public String getId() {
    return this.id;
  }

  /**
   * Returns the user id of the owner of the text.
   *
   * @return The user id of the owner of the text.
   */
  public String getUserId() {
    return this.userId;
  }

  /**
   * Returns the email of the owner of the text.
   *
   * @return The email of the owner of the text.
   */
  public String getEmail() {
    return this.email;
  }

  /**
   * Returns the font of the text.
   *
   * @return The font of the text.
   */
  public String getFont() {
    return this.font;
  }

  /**
   * Returns the size of the text.
   *
   * @return The size of the text.
   */
  public String getSize() {
    return this.size;
  }

  /**
   * Returns the actual data of the text.
   *
   * @return The actual data of the text.
   */
  public String getData() {
    return this.data;
  }

  /**
   * Returns the page number where the text is located.
   *
   * @return The page number where the text is located.
   */
  public String getPageNumber() {
    return this.pageNumber;
  }

  /**
   * Returns the x-coordinate of the text.
   *
   * @return The x-coordinate of the text.
   */
  public String getX() {
    return this.x;
  }

  /**
   * Returns the y-coordinate of the text.
   *
   * @return The y-coordinate of the text.
   */
  public String getY() {
    return this.y;
  }

  /**
   * Returns the width of the text.
   *
   * @return The width of the text.
   */
  public Integer getWidth() {
    return this.width;
  }

  /**
   * Returns the height of the text.
   *
   * @return The height of the text.
   */
  public Integer getHeight() {
    return this.height;
  }

  /**
   * Returns the line height of the text.
   *
   * @return The line height of the text.
   */
  public String getLineHeight() {
    return this.lineHeight;
  }

  /**
   * Returns the subtype of the text.
   *
   * @return The subtype of the text.
   */
  public String getSubtype() {
    return this.subtype;
  }

  /**
   * Returns the creation date of the text.
   *
   * @return The creation date of the text.
   */
  public String getCreated() {
    return this.created;
  }

  /**
   * Returns the color of the text.
   *
   * @return The color of the text.
   */
  public String getColor() {
    return this.color;
  }

  /**
   * Returns the flag indicating if the text is italic.
   *
   * @return True if the text is italic, false otherwise.
   */
  public boolean isItalic() {
    return this.italic;
  }

  /**
   * Returns the flag indicating if the text is underlined.
   *
   * @return True if the text is underlined, false otherwise.
   */
  public boolean isUnderline() {
    return this.underline;
  }

  /**
   * Returns the flag indicating if the text is bold.
   *
   * @return True if the text is bold, false otherwise.
   */
  public boolean isBold() {
    return this.bold;
  }

  /**
   * Returns the alignment of the text.
   *
   * @return The alignment of the text.
   */
  public String getAlign() {
    return this.align;
  }

  /**
   * Returns the original font size of the text.
   *
   * @return The original font size of the text.
   */
  public String getOriginalFontSize() {
    return this.originalFontSize;
  }

  /**
   * Returns the prefill content type of the text.
   *
   * @return The prefill content type of the text.
   */
  public String getPrefillContentType() {
    return this.prefillContentType;
  }

  /**
   * Returns the flag indicating if the width of the text is fixed.
   *
   * @return True if the width of the text is fixed, false otherwise.
   */
  public boolean isWidthFixed() {
    return this.isWidthFixed;
  }

  /**
   * Returns the flag indicating if the text is editable.
   *
   * @return True if the text is editable, false otherwise.
   */
  public boolean isAllowEditing() {
    return this.allowEditing;
  }

  /**
   * Returns the flag indicating if the owner is the recipient.
   *
   * @return True if the owner is the recipient, false otherwise.
   */
  public boolean isOwnerAsRecipient() {
    return this.ownerAsRecipient;
  }

  /**
   * Returns the integration object id of the text.
   *
   * @return The integration object id of the text.
   */
  public String getIntegrationObjectId() {
    return this.integrationObjectId;
  }

  /**
   * Converts the Text object to a Map.
   *
   * @return A Map representing the Text object.
   */
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

  /**
   * Creates a Text object from a Map.
   *
   * @param data The Map representing the Text object.
   * @return A new Text object.
   */
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
        (Integer) data.getOrDefault("width", null),
        (Integer) data.getOrDefault("height", null),
        (String) data.getOrDefault("line_height", "0"),
        (String) data.getOrDefault("color", null),
        (Boolean) data.getOrDefault("italic", false),
        (Boolean) data.getOrDefault("underline", false),
        (Boolean) data.getOrDefault("bold", false),
        (String) data.getOrDefault("original_font_size", null),
        (String) data.getOrDefault("prefill_content_type", null),
        (String) data.getOrDefault("integration_object_id", null));
  }
}

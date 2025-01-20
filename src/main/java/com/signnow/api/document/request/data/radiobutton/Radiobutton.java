/*
 * This file is a part of signNow SDK API client.
 *
 * (с) Copyright © 2011-present airSlate Inc. (https://www.signnow.com)
 *
 * For more details on copyright, see LICENSE.md file
 * that was distributed with this source code.
 */

package com.signnow.api.document.request.data.radiobutton;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.signnow.core.data.ApiData;
import java.util.LinkedHashMap;
import java.util.Map;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

/**
 * This class represents a Radio button in a document.
 */
public final class Radiobutton extends ApiData {

  /**
   * The page number where the radio button is located.
   */
  @JsonProperty("page_number")
  private final int pageNumber;

  /**
   * The x-coordinate of the radio button.
   */
  @JsonProperty("x")
  private final int x;

  /**
   * The y-coordinate of the radio button.
   */
  @JsonProperty("y")
  private final int y;

  /**
   * The line height of the radio button.
   */
  @JsonProperty("line_height")
  private final int lineHeight;

  /**
   * The status of the radio button.
   */
  @JsonProperty("status")
  private final int status;

  /**
   * Indicates if the radio button is printed.
   */
  @JsonProperty("is_printed")
  private final int isPrinted;

  /**
   * The size of the radio button.
   */
  @JsonProperty("size")
  private final int size;

  /**
   * The subtype of the radio button.
   */
  @JsonProperty("subtype")
  private final String subtype;

  /**
   * The name of the radio button.
   */
  @JsonProperty("name")
  private final String name;

  /**
   * The font of the radio button.
   */
  @JsonProperty("font")
  private final String font;

  /**
   * The collection of radio buttons.
   */
  @JsonProperty("radio")
  private final RadioCollection radio;

  /**
   * The field ID of the radio button.
   */
  @JsonProperty("field_id")
  private final String fieldId;

  /**
   * Constructor for the Radiobutton class.
   *
   * @param pageNumber the page number where the radio button is located
   * @param x the x-coordinate of the radio button
   * @param y the y-coordinate of the radio button
   * @param lineHeight the line height of the radio button
   * @param status the status of the radio button
   * @param isPrinted indicates if the radio button is printed
   * @param size the size of the radio button
   * @param subtype the subtype of the radio button
   * @param name the name of the radio button
   * @param font the font of the radio button
   * @param radio the collection of radio buttons
   * @param fieldId the field ID of the radio button
   */
  @JsonCreator
  public Radiobutton(
      @JsonProperty("page_number") int pageNumber,
      @JsonProperty("x") int x,
      @JsonProperty("y") int y,
      @JsonProperty("line_height") int lineHeight,
      @JsonProperty("status") int status,
      @JsonProperty("is_printed") int isPrinted,
      @JsonProperty("size") int size,
      @JsonProperty("subtype") String subtype,
      @JsonProperty("name") String name,
      @JsonProperty("font") String font,
      @JsonProperty("radio") RadioCollection radio,
      @JsonProperty("field_id") String fieldId) {
    this.pageNumber = pageNumber;
    this.x = x;
    this.y = y;
    this.lineHeight = lineHeight;
    this.status = status;
    this.isPrinted = isPrinted;
    this.size = size;
    this.subtype = subtype;
    this.name = name;
    this.font = font;
    this.radio = radio;
    this.fieldId = fieldId;
  }

  /**
   * Constructor for the Radiobutton class with default subtype and null font and fieldId.
   *
   * @param pageNumber the page number where the radio button is located
   * @param x the x-coordinate of the radio button
   * @param y the y-coordinate of the radio button
   * @param lineHeight the line height of the radio button
   * @param status the status of the radio button
   * @param isPrinted indicates if the radio button is printed
   * @param size the size of the radio button
   * @param name the name of the radio button
   * @param radio the collection of radio buttons
   */
  public Radiobutton(
      @JsonProperty("page_number") int pageNumber,
      @JsonProperty("x") int x,
      @JsonProperty("y") int y,
      @JsonProperty("line_height") int lineHeight,
      @JsonProperty("status") int status,
      @JsonProperty("is_printed") int isPrinted,
      @JsonProperty("size") int size,
      @JsonProperty("name") String name,
      @JsonProperty("radio") RadioCollection radio) {
    this.pageNumber = pageNumber;
    this.x = x;
    this.y = y;
    this.lineHeight = lineHeight;
    this.status = status;
    this.isPrinted = isPrinted;
    this.size = size;
    this.subtype = "radiobutton";
    this.name = name;
    this.font = null;
    this.radio = radio;
    this.fieldId = null;
  }

  /**
   * Returns the page number where the radio button is located.
   *
   * @return the page number
   */
  public int getPageNumber() {
    return this.pageNumber;
  }

  /**
   * Returns the x-coordinate of the radio button.
   *
   * @return the x-coordinate
   */
  public int getX() {
    return this.x;
  }

  /**
   * Returns the y-coordinate of the radio button.
   *
   * @return the y-coordinate
   */
  public int getY() {
    return this.y;
  }

  /**
   * Returns the line height of the radio button.
   *
   * @return the line height
   */
  public int getLineHeight() {
    return this.lineHeight;
  }

  /**
   * Returns the status of the radio button.
   *
   * @return the status
   */
  public int getStatus() {
    return this.status;
  }

  /**
   * Returns if the radio button is printed.
   *
   * @return true if the radio button is printed, false otherwise
   */
  public int getIsPrinted() {
    return this.isPrinted;
  }

  /**
   * Returns the size of the radio button.
   *
   * @return the size
   */
  public int getSize() {
    return this.size;
  }

  /**
   * Returns the subtype of the radio button.
   *
   * @return the subtype
   */
  public String getSubtype() {
    return this.subtype;
  }

  /**
   * Returns the name of the radio button.
   *
   * @return the name
   */
  public String getName() {
    return this.name;
  }

  /**
   * Returns the font of the radio button.
   *
   * @return the font
   */
  public String getFont() {
    return this.font;
  }

  /**
   * Returns the collection of radio buttons.
   *
   * @return the collection of radio buttons
   */
  public RadioCollection getRadio() {
    return this.radio;
  }

  /**
   * Returns the field ID of the radio button.
   *
   * @return the field ID
   */
  public String getFieldId() {
    return this.fieldId;
  }

  /**
   * Converts the radio button to a map.
   *
   * @return a map representing the radio button
   */
  @NotNull
  @Override
  public Map<String, Object> toMap() {
    Map<String, Object> map = new LinkedHashMap<>();
    map.put("page_number", this.getPageNumber());
    map.put("x", this.getX());
    map.put("y", this.getY());
    map.put("line_height", this.getLineHeight());
    map.put("status", this.getStatus());
    map.put("is_printed", this.getIsPrinted());
    map.put("size", this.getSize());
    map.put("subtype", this.getSubtype());
    map.put("name", this.getName());
    map.put("field_id", this.getFieldId());
    map.put("font", this.getFont());
    map.put("radio", this.getRadio());
    return map;
  }

  /**
   * Creates a new Radiobutton object from a map.
   *
   * @param data a map representing a radio button
   * @return a new Radiobutton object
   */
  @NotNull
  @Contract("_ -> new")
  public static Radiobutton fromMap(@NotNull Map<String, Object> data) {
    return new Radiobutton(
        (int) data.get("page_number"),
        (int) data.get("x"),
        (int) data.get("y"),
        (int) data.get("line_height"),
        (int) data.get("status"),
        (int) data.get("is_printed"),
        (int) data.get("size"),
        (String) data.get("subtype"),
        (String) data.get("name"),
        (String) data.get("font"),
        (RadioCollection) data.get("radio"),
        (String) data.getOrDefault("field_id", ""));
  }
}
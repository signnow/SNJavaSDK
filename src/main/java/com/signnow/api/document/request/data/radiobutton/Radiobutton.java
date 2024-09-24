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

public final class Radiobutton extends ApiData {

  @JsonProperty("page_number")
  private final int pageNumber;

  @JsonProperty("x")
  private final int x;

  @JsonProperty("y")
  private final int y;

  @JsonProperty("line_height")
  private final int lineHeight;

  @JsonProperty("status")
  private final int status;

  @JsonProperty("is_printed")
  private final int isPrinted;

  @JsonProperty("size")
  private final int size;

  @JsonProperty("subtype")
  private final String subtype;

  @JsonProperty("name")
  private final String name;

  @JsonProperty("font")
  private final String font;

  @JsonProperty("radio")
  private final RadioCollection radio;

  @JsonProperty("field_id")
  private final String fieldId;

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

  public int getPageNumber() {
    return this.pageNumber;
  }

  public int getX() {
    return this.x;
  }

  public int getY() {
    return this.y;
  }

  public int getLineHeight() {
    return this.lineHeight;
  }

  public int getStatus() {
    return this.status;
  }

  public int getIsPrinted() {
    return this.isPrinted;
  }

  public int getSize() {
    return this.size;
  }

  public String getSubtype() {
    return this.subtype;
  }

  public String getName() {
    return this.name;
  }

  public String getFont() {
    return this.font;
  }

  public RadioCollection getRadio() {
    return this.radio;
  }

  public String getFieldId() {
    return this.fieldId;
  }

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

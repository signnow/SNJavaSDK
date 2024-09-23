/*
 * This file is a part of signNow SDK API client.
 *
 * (с) Copyright © 2011-present airSlate Inc. (https://www.signnow.com)
 *
 * For more details on copyright, see LICENSE.md file
 * that was distributed with this source code.
 */

package com.signnow.api.document.request.data.tag;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.signnow.core.data.ApiData;
import java.util.LinkedHashMap;
import java.util.Map;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

public final class Tag extends ApiData {

  @JsonProperty("type")
  private final String type;

  @JsonProperty("x")
  private final int x;

  @JsonProperty("y")
  private final int y;

  @JsonProperty("page_number")
  private final int pageNumber;

  @JsonProperty("role")
  private final String role;

  @JsonProperty("required")
  private final boolean required;

  @JsonProperty("width")
  private final int width;

  @JsonProperty("height")
  private final int height;

  @JsonProperty("tag_name")
  private final String tagName;

  @JsonProperty("name")
  private final String name;

  @JsonProperty("label")
  private final String label;

  @JsonProperty("align")
  private final String align;

  @JsonProperty("valign")
  private final String valign;

  @JsonProperty("prefilled_text")
  private final String prefilledText;

  @JsonProperty("validator_id")
  private final String validatorId;

  @JsonProperty("dependency")
  private final String dependency;

  @JsonProperty("hint")
  private final String hint;

  @JsonProperty("link")
  private final String link;

  @JsonProperty("custom_defined_option")
  private final boolean customDefinedOption;

  @JsonProperty("lock_to_sign_date")
  private final boolean lockToSignDate;

  @JsonProperty("radio")
  private final RadioCollection radio;

  @JsonProperty("enumeration_options")
  private final EnumerationOptionCollection enumerationOptions;

  @JsonCreator
  public Tag(
      @JsonProperty("type") String type,
      @JsonProperty("x") int x,
      @JsonProperty("y") int y,
      @JsonProperty("page_number") int pageNumber,
      @JsonProperty("role") String role,
      @JsonProperty("required") boolean required,
      @JsonProperty("width") int width,
      @JsonProperty("height") int height,
      @JsonProperty("tag_name") String tagName,
      @JsonProperty("name") String name,
      @JsonProperty("label") String label,
      @JsonProperty("align") String align,
      @JsonProperty("valign") String valign,
      @JsonProperty("prefilled_text") String prefilledText,
      @JsonProperty("validator_id") String validatorId,
      @JsonProperty("dependency") String dependency,
      @JsonProperty("hint") String hint,
      @JsonProperty("link") String link,
      @JsonProperty("custom_defined_option") boolean customDefinedOption,
      @JsonProperty("lock_to_sign_date") boolean lockToSignDate,
      @JsonProperty("radio") RadioCollection radio,
      @JsonProperty("enumeration_options") EnumerationOptionCollection enumerationOptions) {
    this.type = type;
    this.x = x;
    this.y = y;
    this.pageNumber = pageNumber;
    this.role = role;
    this.required = required;
    this.width = width;
    this.height = height;
    this.tagName = tagName;
    this.name = name;
    this.label = label;
    this.align = align;
    this.valign = valign;
    this.prefilledText = prefilledText;
    this.validatorId = validatorId;
    this.dependency = dependency;
    this.hint = hint;
    this.link = link;
    this.customDefinedOption = customDefinedOption;
    this.lockToSignDate = lockToSignDate;
    this.radio = radio;
    this.enumerationOptions = enumerationOptions;
  }

  public Tag(
      @JsonProperty("type") String type,
      @JsonProperty("x") int x,
      @JsonProperty("y") int y,
      @JsonProperty("page_number") int pageNumber,
      @JsonProperty("role") String role,
      @JsonProperty("required") boolean required,
      @JsonProperty("width") int width,
      @JsonProperty("height") int height,
      @JsonProperty("tag_name") String tagName,
      @JsonProperty("name") String name,
      @JsonProperty("label") String label) {
    this.type = type;
    this.x = x;
    this.y = y;
    this.pageNumber = pageNumber;
    this.role = role;
    this.required = required;
    this.width = width;
    this.height = height;
    this.tagName = tagName;
    this.name = name;
    this.label = label;
    this.align = null;
    this.valign = null;
    this.prefilledText = null;
    this.validatorId = null;
    this.dependency = null;
    this.hint = null;
    this.link = null;
    this.customDefinedOption = false;
    this.lockToSignDate = false;
    this.radio = new RadioCollection();
    this.enumerationOptions = new EnumerationOptionCollection();
  }

  public String getTagName() {
    return this.tagName;
  }

  public String getName() {
    return this.name;
  }

  public String getLabel() {
    return this.label;
  }

  public String getType() {
    return this.type;
  }

  public int getX() {
    return this.x;
  }

  public int getY() {
    return this.y;
  }

  public int getPageNumber() {
    return this.pageNumber;
  }

  public String getRole() {
    return this.role;
  }

  public boolean isRequired() {
    return this.required;
  }

  public int getWidth() {
    return this.width;
  }

  public int getHeight() {
    return this.height;
  }

  public String getAlign() {
    return this.align;
  }

  public String getValign() {
    return this.valign;
  }

  public String getPrefilledText() {
    return this.prefilledText;
  }

  public String getValidatorId() {
    return this.validatorId;
  }

  public String getDependency() {
    return this.dependency;
  }

  public String getHint() {
    return this.hint;
  }

  public String getLink() {
    return this.link;
  }

  public boolean isCustomDefinedOption() {
    return this.customDefinedOption;
  }

  public boolean isLockToSignDate() {
    return this.lockToSignDate;
  }

  public RadioCollection getRadio() {
    return this.radio;
  }

  public EnumerationOptionCollection getEnumerationOptions() {
    return this.enumerationOptions;
  }

  @NotNull
  @Override
  public Map<String, Object> toMap() {
    Map<String, Object> map = new LinkedHashMap<>();
    map.put("tag_name", this.getTagName());
    map.put("name", this.getName());
    map.put("label", this.getLabel());
    map.put("type", this.getType());
    map.put("x", this.getX());
    map.put("y", this.getY());
    map.put("page_number", this.getPageNumber());
    map.put("role", this.getRole());
    map.put("required", this.isRequired());
    map.put("width", this.getWidth());
    map.put("height", this.getHeight());
    map.put("align", this.getAlign());
    map.put("valign", this.getValign());
    map.put("prefilled_text", this.getPrefilledText());
    map.put("validator_id", this.getValidatorId());
    map.put("dependency", this.getDependency());
    map.put("hint", this.getHint());
    map.put("link", this.getLink());
    map.put("custom_defined_option", this.isCustomDefinedOption());
    map.put("lock_to_sign_date", this.isLockToSignDate());
    map.put("radio", this.getRadio());
    map.put("enumeration_options", this.getEnumerationOptions());
    return map;
  }

  @NotNull
  @Contract("_ -> new")
  public static Tag fromMap(@NotNull Map<String, Object> data) {
    return new Tag(
        (String) data.get("type"),
        (Integer) data.get("x"),
        (Integer) data.get("y"),
        (Integer) data.get("page_number"),
        (String) data.get("role"),
        (Boolean) data.get("required"),
        (Integer) data.get("width"),
        (Integer) data.get("height"),
        (String) data.getOrDefault("tag_name", ""),
        (String) data.getOrDefault("name", ""),
        (String) data.getOrDefault("label", ""),
        (String) data.getOrDefault("align", ""),
        (String) data.getOrDefault("valign", ""),
        (String) data.getOrDefault("prefilled_text", ""),
        (String) data.getOrDefault("validator_id", ""),
        (String) data.getOrDefault("dependency", ""),
        (String) data.getOrDefault("hint", ""),
        (String) data.getOrDefault("link", ""),
        (Boolean) data.getOrDefault("custom_defined_option", false),
        (Boolean) data.getOrDefault("lock_to_sign_date", false),
        (RadioCollection) data.get("radio"),
        (EnumerationOptionCollection) data.get("enumeration_options"));
  }
}

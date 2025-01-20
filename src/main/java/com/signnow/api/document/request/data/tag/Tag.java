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

/**
 * This class represents a Tag in the signNow API.
 */
public final class Tag extends ApiData {

  /**
   * The type of the tag.
   */
  @JsonProperty("type")
  private final String type;

  /**
   * The x-coordinate of the tag.
   */
  @JsonProperty("x")
  private final int x;

  /**
   * The y-coordinate of the tag.
   */
  @JsonProperty("y")
  private final int y;

  /**
   * The page number where the tag is located.
   */
  @JsonProperty("page_number")
  private final int pageNumber;

  /**
   * The role associated with the tag.
   */
  @JsonProperty("role")
  private final String role;

  /**
   * Indicates if the tag is required.
   */
  @JsonProperty("required")
  private final boolean required;

  /**
   * The width of the tag.
   */
  @JsonProperty("width")
  private final int width;

  /**
   * The height of the tag.
   */
  @JsonProperty("height")
  private final int height;

  /**
   * The name of the tag.
   */
  @JsonProperty("tag_name")
  private final String tagName;

  /**
   * The name associated with the tag.
   */
  @JsonProperty("name")
  private final String name;

  /**
   * The label of the tag.
   */
  @JsonProperty("label")
  private final String label;

  /**
   * The alignment of the tag.
   */
  @JsonProperty("align")
  private final String align;

  /**
   * The vertical alignment of the tag.
   */
  @JsonProperty("valign")
  private final String valign;

  /**
   * The prefilled text of the tag.
   */
  @JsonProperty("prefilled_text")
  private final String prefilledText;

  /**
   * The validator id of the tag.
   */
  @JsonProperty("validator_id")
  private final String validatorId;

  /**
   * The dependency of the tag.
   */
  @JsonProperty("dependency")
  private final String dependency;

  /**
   * The hint of the tag.
   */
  @JsonProperty("hint")
  private final String hint;

  /**
   * The link of the tag.
   */
  @JsonProperty("link")
  private final String link;

  /**
   * Indicates if the tag has a custom defined option.
   */
  @JsonProperty("custom_defined_option")
  private final boolean customDefinedOption;

  /**
   * Indicates if the tag is locked to sign date.
   */
  @JsonProperty("lock_to_sign_date")
  private final boolean lockToSignDate;

  /**
   * The radio collection of the tag.
   */
  @JsonProperty("radio")
  private final RadioCollection radio;

  /**
   * The enumeration options of the tag.
   */
  @JsonProperty("enumeration_options")
  private final EnumerationOptionCollection enumerationOptions;

  /**
   * Constructor for the Tag class.
   *
   * @param type The type of the tag.
   * @param x The x-coordinate of the tag.
   * @param y The y-coordinate of the tag.
   * @param pageNumber The page number where the tag is located.
   * @param role The role associated with the tag.
   * @param required Indicates if the tag is required.
   * @param width The width of the tag.
   * @param height The height of the tag.
   * @param tagName The name of the tag.
   * @param name The name associated with the tag.
   * @param label The label of the tag.
   * @param align The alignment of the tag.
   * @param valign The vertical alignment of the tag.
   * @param prefilledText The prefilled text of the tag.
   * @param validatorId The validator id of the tag.
   * @param dependency The dependency of the tag.
   * @param hint The hint of the tag.
   * @param link The link of the tag.
   * @param customDefinedOption Indicates if the tag has a custom defined option.
   * @param lockToSignDate Indicates if the tag is locked to sign date.
   * @param radio The radio collection of the tag.
   * @param enumerationOptions The enumeration options of the tag.
   */
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

  /**
   * Constructor for the Tag class with fewer parameters.
   *
   * @param type The type of the tag.
   * @param x The x-coordinate of the tag.
   * @param y The y-coordinate of the tag.
   * @param pageNumber The page number where the tag is located.
   * @param role The role associated with the tag.
   * @param required Indicates if the tag is required.
   * @param width The width of the tag.
   * @param height The height of the tag.
   * @param tagName The name of the tag.
   * @param name The name associated with the tag.
   * @param label The label of the tag.
   */
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

  /**
   * Returns the tag name.
   *
   * @return The tag name.
   */
  public String getTagName() {
    return this.tagName;
  }

  /**
   * Returns the name associated with the tag.
   *
   * @return The name associated with the tag.
   */
  public String getName() {
    return this.name;
  }

  /**
   * Returns the label of the tag.
   *
   * @return The label of the tag.
   */
  public String getLabel() {
    return this.label;
  }

  /**
   * Returns the type of the tag.
   *
   * @return The type of the tag.
   */
  public String getType() {
    return this.type;
  }

  /**
   * Returns the x-coordinate of the tag.
   *
   * @return The x-coordinate of the tag.
   */
  public int getX() {
    return this.x;
  }

  /**
   * Returns the y-coordinate of the tag.
   *
   * @return The y-coordinate of the tag.
   */
  public int getY() {
    return this.y;
  }

  /**
   * Returns the page number where the tag is located.
   *
   * @return The page number where the tag is located.
   */
  public int getPageNumber() {
    return this.pageNumber;
  }

  /**
   * Returns the role associated with the tag.
   *
   * @return The role associated with the tag.
   */
  public String getRole() {
    return this.role;
  }

  /**
   * Returns if the tag is required.
   *
   * @return True if the tag is required, false otherwise.
   */
  public boolean isRequired() {
    return this.required;
  }

  /**
   * Returns the width of the tag.
   *
   * @return The width of the tag.
   */
  public int getWidth() {
    return this.width;
  }

  /**
   * Returns the height of the tag.
   *
   * @return The height of the tag.
   */
  public int getHeight() {
    return this.height;
  }

  /**
   * Returns the alignment of the tag.
   *
   * @return The alignment of the tag.
   */
  public String getAlign() {
    return this.align;
  }

  /**
   * Returns the vertical alignment of the tag.
   *
   * @return The vertical alignment of the tag.
   */
  public String getValign() {
    return this.valign;
  }

  /**
   * Returns the prefilled text of the tag.
   *
   * @return The prefilled text of the tag.
   */
  public String getPrefilledText() {
    return this.prefilledText;
  }

  /**
   * Returns the validator id of the tag.
   *
   * @return The validator id of the tag.
   */
  public String getValidatorId() {
    return this.validatorId;
  }

  /**
   * Returns the dependency of the tag.
   *
   * @return The dependency of the tag.
   */
  public String getDependency() {
    return this.dependency;
  }

  /**
   * Returns the hint of the tag.
   *
   * @return The hint of the tag.
   */
  public String getHint() {
    return this.hint;
  }

  /**
   * Returns the link of the tag.
   *
   * @return The link of the tag.
   */
  public String getLink() {
    return this.link;
  }

  /**
   * Returns if the tag has a custom defined option.
   *
   * @return True if the tag has a custom defined option, false otherwise.
   */
  public boolean isCustomDefinedOption() {
    return this.customDefinedOption;
  }

  /**
   * Returns if the tag is locked to sign date.
   *
   * @return True if the tag is locked to sign date, false otherwise.
   */
  public boolean isLockToSignDate() {
    return this.lockToSignDate;
  }

  /**
   * Returns the radio collection of the tag.
   *
   * @return The radio collection of the tag.
   */
  public RadioCollection getRadio() {
    return this.radio;
  }

  /**
   * Returns the enumeration options of the tag.
   *
   * @return The enumeration options of the tag.
   */
  public EnumerationOptionCollection getEnumerationOptions() {
    return this.enumerationOptions;
  }

  /**
   * Converts the tag to a map.
   *
   * @return A map representation of the tag.
   */
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

  /**
   * Creates a new Tag object from a map.
   *
   * @param data The map to create the Tag object from.
   * @return A new Tag object.
   */
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
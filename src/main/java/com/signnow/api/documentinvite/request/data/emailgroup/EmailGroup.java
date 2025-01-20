/*
 * This file is a part of signNow SDK API client.
 *
 * (с) Copyright © 2011-present airSlate Inc. (https://www.signnow.com)
 *
 * For more details on copyright, see LICENSE.md file
 * that was distributed with this source code.
 */

package com.signnow.api.documentinvite.request.data.emailgroup;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.signnow.core.data.ApiData;
import java.util.LinkedHashMap;
import java.util.Map;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

/**
 * This class represents an EmailGroup which extends ApiData.
 */
public class EmailGroup extends ApiData {

  /**
   * The id of the EmailGroup.
   */
  @JsonProperty("id")
  private final String id;

  /**
   * The name of the EmailGroup.
   */
  @JsonProperty("name")
  private final String name;

  /**
   * The collection of emails in the EmailGroup.
   */
  @JsonProperty("emails")
  private final EmailCollection emails;

  /**
   * Constructs an EmailGroup with the specified id, name, and emails.
   *
   * @param id the id of the EmailGroup
   * @param name the name of the EmailGroup
   * @param emails the collection of emails in the EmailGroup
   */
  @JsonCreator
  public EmailGroup(
      @JsonProperty("id") String id,
      @JsonProperty("name") String name,
      @JsonProperty("emails") EmailCollection emails) {
    this.id = id;
    this.name = name;
    this.emails = emails;
  }

  /**
   * Returns the id of the EmailGroup.
   *
   * @return the id of the EmailGroup
   */
  public String getId() {
    return this.id;
  }

  /**
   * Returns the name of the EmailGroup.
   *
   * @return the name of the EmailGroup
   */
  public String getName() {
    return this.name;
  }

  /**
   * Returns the collection of emails in the EmailGroup.
   *
   * @return the collection of emails in the EmailGroup
   */
  public EmailCollection getEmails() {
    return this.emails;
  }

  /**
   * Converts the EmailGroup to a Map.
   *
   * @return a Map representing the EmailGroup
   */
  @NotNull
  @Override
  public Map<String, Object> toMap() {
    Map<String, Object> map = new LinkedHashMap<>();
    map.put("id", this.getId());
    map.put("name", this.getName());
    map.put("emails", this.getEmails());
    return map;
  }

  /**
   * Constructs an EmailGroup from a Map.
   *
   * @param data a Map representing the EmailGroup
   * @return an EmailGroup constructed from the Map
   */
  @NotNull
  @Contract("_ -> new")
  public static EmailGroup fromMap(@NotNull Map<String, Object> data) {
    return new EmailGroup(
        (String) data.get("id"), (String) data.get("name"), (EmailCollection) data.get("emails"));
  }
}

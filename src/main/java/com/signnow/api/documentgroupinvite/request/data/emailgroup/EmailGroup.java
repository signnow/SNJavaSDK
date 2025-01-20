/*
 * This file is a part of signNow SDK API client.
 *
 * (с) Copyright © 2011-present airSlate Inc. (https://www.signnow.com)
 *
 * For more details on copyright, see LICENSE.md file
 * that was distributed with this source code.
 */

package com.signnow.api.documentgroupinvite.request.data.emailgroup;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.signnow.core.data.ApiData;
import java.util.LinkedHashMap;
import java.util.Map;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

/**
 * This class represents an Email Group with its properties and methods.
 */
public final class EmailGroup extends ApiData {

  /**
   * The unique identifier of the Email Group.
   */
  @JsonProperty("id")
  private final String id;

  /**
   * The name of the Email Group.
   */
  @JsonProperty("name")
  private final String name;

  /**
   * The collection of emails in the Email Group.
   */
  @JsonProperty("emails")
  private final EmailCollection emails;

  /**
   * Constructs an EmailGroup object with the specified id, name, and emails.
   *
   * @param id     the unique identifier of the Email Group
   * @param name   the name of the Email Group
   * @param emails the collection of emails in the Email Group
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
   * Returns the unique identifier of the Email Group.
   *
   * @return the id of the Email Group
   */
  public String getId() {
    return this.id;
  }

  /**
   * Returns the name of the Email Group.
   *
   * @return the name of the Email Group
   */
  public String getName() {
    return this.name;
  }

  /**
   * Returns the collection of emails in the Email Group.
   *
   * @return the emails of the Email Group
   */
  public EmailCollection getEmails() {
    return this.emails;
  }

  /**
   * Converts the EmailGroup object to a Map.
   *
   * @return a Map representing the EmailGroup object
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
   * Constructs an EmailGroup object from a Map.
   *
   * @param data a Map containing the data to construct an EmailGroup object
   * @return a new EmailGroup object constructed from the provided Map
   */
  @NotNull
  @Contract("_ -> new")
  public static EmailGroup fromMap(@NotNull Map<String, Object> data) {
    return new EmailGroup(
        (String) data.get("id"), (String) data.get("name"), (EmailCollection) data.get("emails"));
  }
}
/*
 * This file is a part of signNow SDK API client.
 *
 * (с) Copyright © 2011-present airSlate Inc. (https://www.signnow.com)
 *
 * For more details on copyright, see LICENSE.md file
 * that was distributed with this source code.
 */

package com.signnow.api.documentgroup.response.data.data;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.signnow.core.data.ApiData;
import java.util.LinkedHashMap;
import java.util.Map;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

public final class Recipient extends ApiData {

  @JsonProperty("name")
  private final String name;

  @JsonProperty("email")
  private final String email;

  @JsonProperty("order")
  private final int order;

  @JsonProperty("documents")
  private final DocumentCollection documents;

  @JsonProperty("email_group")
  private final EmailGroup emailGroup;

  @JsonProperty("attributes")
  private final Attribute attributes;

  @JsonCreator
  public Recipient(
      @JsonProperty("name") String name,
      @JsonProperty("email") String email,
      @JsonProperty("order") int order,
      @JsonProperty("documents") DocumentCollection documents,
      @JsonProperty("email_group") EmailGroup emailGroup,
      @JsonProperty("attributes") Attribute attributes) {
    this.name = name;
    this.email = email;
    this.order = order;
    this.documents = documents;
    this.emailGroup = emailGroup;
    this.attributes = attributes;
  }

  public String getName() {
    return this.name;
  }

  public String getEmail() {
    return this.email;
  }

  public EmailGroup getEmailGroup() {
    return this.emailGroup;
  }

  public int getOrder() {
    return this.order;
  }

  public Attribute getAttributes() {
    return this.attributes;
  }

  public DocumentCollection getDocuments() {
    return this.documents;
  }

  @NotNull
  @Override
  public Map<String, Object> toMap() {
    Map<String, Object> map = new LinkedHashMap<>();
    map.put("name", this.getName());
    map.put("email", this.getEmail());
    map.put("email_group", this.getEmailGroup());
    map.put("order", this.getOrder());
    map.put("attributes", this.getAttributes());
    map.put("documents", this.getDocuments());
    return map;
  }

  @NotNull
  @Contract("_ -> new")
  public static Recipient fromMap(@NotNull Map<String, Object> data) {
    return new Recipient(
        (String) data.get("name"),
        (String) data.get("email"),
        (Integer) data.get("order"),
        (DocumentCollection) data.get("documents"),
        (EmailGroup) data.get("email_group"),
        (Attribute) data.get("attributes"));
  }
}

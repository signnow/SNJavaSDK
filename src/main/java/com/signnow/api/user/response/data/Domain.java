/*
 * This file is a part of signNow SDK API client.
 *
 * (с) Copyright © 2011-present airSlate Inc. (https://www.signnow.com)
 *
 * For more details on copyright, see LICENSE.md file
 * that was distributed with this source code.
 */

package com.signnow.api.user.response.data;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.signnow.core.data.ApiData;
import java.util.LinkedHashMap;
import java.util.Map;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

/**
 * Domain class extends ApiData.
 * Represents a domain with its id and domain name.
 */
public final class Domain extends ApiData {

  /**
   * The id of the domain.
   */
  @JsonProperty("id")
  private final String id;

  /**
   * The domain name.
   */
  @JsonProperty("domain")
  private final String domain;

  /**
   * Constructor for Domain class.
   *
   * @param id     The id of the domain.
   * @param domain The domain name.
   */
  @JsonCreator
  public Domain(@JsonProperty("id") String id, @JsonProperty("domain") String domain) {
    this.id = id;
    this.domain = domain;
  }

  /**
   * Getter for the id of the domain.
   *
   * @return The id of the domain.
   */
  public String getId() {
    return this.id;
  }

  /**
   * Getter for the domain name.
   *
   * @return The domain name.
   */
  public String getDomain() {
    return this.domain;
  }

  /**
   * Converts the Domain object to a Map.
   *
   * @return A Map with the id and domain name.
   */
  @NotNull
  @Override
  public Map<String, Object> toMap() {
    Map<String, Object> map = new LinkedHashMap<>();
    map.put("id", this.getId());
    map.put("domain", this.getDomain());
    return map;
  }

  /**
   * Creates a Domain object from a Map.
   *
   * @param data A Map with the id and domain name.
   * @return A new Domain object.
   */
  @NotNull
  @Contract("_ -> new")
  public static Domain fromMap(@NotNull Map<String, Object> data) {
    return new Domain((String) data.get("id"), (String) data.get("domain"));
  }
}
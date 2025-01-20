/*
 * This file is a part of signNow SDK API client.
 *
 * (с) Copyright © 2011-present airSlate Inc. (https://www.signnow.com)
 *
 * For more details on copyright, see LICENSE.md file
 * that was distributed with this source code.
 */

package com.signnow.api.webhook.response.data.data;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.signnow.core.data.ApiData;
import java.util.LinkedHashMap;
import java.util.Map;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

/**
 * Content class extends ApiData.
 * It represents the content data of a webhook response.
 */
public final class Content extends ApiData {

  /**
   * Key property of the content.
   */
  @JsonProperty("key")
  private final String key;

  /**
   * Key1 property of the content.
   */
  @JsonProperty("key1")
  private final String key1;

  /**
   * Key2 property of the content.
   */
  @JsonProperty("key2")
  private final String key2;

  /**
   * Account ID property of the content.
   */
  @JsonProperty("account_id")
  private final String accountId;

  /**
   * Source property of the content.
   */
  @JsonProperty("source")
  private final String source;

  /**
   * Constructor for Content class.
   *
   * @param key       the key property
   * @param key1      the key1 property
   * @param key2      the key2 property
   * @param accountId the account ID property
   * @param source    the source property
   */
  @JsonCreator
  public Content(
      @JsonProperty("key") String key,
      @JsonProperty("key1") String key1,
      @JsonProperty("key2") String key2,
      @JsonProperty("account_id") String accountId,
      @JsonProperty("source") String source) {
    this.key = key;
    this.key1 = key1;
    this.key2 = key2;
    this.accountId = accountId;
    this.source = source;
  }

  /**
   * Returns the key property.
   *
   * @return the key
   */
  public String getKey() {
    return this.key;
  }

  /**
   * Returns the key1 property.
   *
   * @return the key1
   */
  public String getKey1() {
    return this.key1;
  }

  /**
   * Returns the key2 property.
   *
   * @return the key2
   */
  public String getKey2() {
    return this.key2;
  }

  /**
   * Returns the account ID property.
   *
   * @return the account ID
   */
  public String getAccountId() {
    return this.accountId;
  }

  /**
   * Returns the source property.
   *
   * @return the source
   */
  public String getSource() {
    return this.source;
  }

  /**
   * Converts the content data to a map.
   *
   * @return a map representation of the content data
   */
  @NotNull
  @Override
  public Map<String, Object> toMap() {
    Map<String, Object> map = new LinkedHashMap<>();
    map.put("key", this.getKey());
    map.put("key1", this.getKey1());
    map.put("key2", this.getKey2());
    map.put("account_id", this.getAccountId());
    map.put("source", this.getSource());
    return map;
  }

  /**
   * Creates a Content object from a map.
   *
   * @param data a map containing the content data
   * @return a new Content object
   */
  @NotNull
  @Contract("_ -> new")
  public static Content fromMap(@NotNull Map<String, Object> data) {
    return new Content(
        (String) data.getOrDefault("key", ""),
        (String) data.getOrDefault("key1", ""),
        (String) data.getOrDefault("key2", ""),
        (String) data.getOrDefault("account_id", ""),
        (String) data.getOrDefault("source", ""));
  }
}
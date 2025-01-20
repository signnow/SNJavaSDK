/*
 * This file is a part of signNow SDK API client.
 *
 * (с) Copyright © 2011-present airSlate Inc. (https://www.signnow.com)
 *
 * For more details on copyright, see LICENSE.md file
 * that was distributed with this source code.
 */

package com.signnow.api.webhookv2.response.data.data;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.signnow.core.data.ApiData;
import com.signnow.core.util.Cast;
import java.util.LinkedHashMap;
import java.util.Map;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

/**
 * This class represents the content of a request.
 */
public final class RequestContent extends ApiData {

  /**
   * Meta data of the request.
   */
  @JsonProperty("meta")
  private final Meta meta;

  /**
   * Content of the request.
   */
  @JsonProperty("content")
  private final Content content;

  /**
   * Constructor for RequestContent.
   *
   * @param meta Meta data of the request.
   * @param content Content of the request.
   */
  @JsonCreator
  public RequestContent(@JsonProperty("meta") Meta meta, @JsonProperty("content") Content content) {
    this.meta = meta;
    this.content = content;
  }

  /**
   * Returns the meta data of the request.
   *
   * @return Meta data of the request.
   */
  public Meta getMeta() {
    return this.meta;
  }

  /**
   * Returns the content of the request.
   *
   * @return Content of the request.
   */
  public Content getContent() {
    return this.content;
  }

  /**
   * Converts the RequestContent object to a Map.
   *
   * @return Map representation of the RequestContent object.
   */
  @NotNull
  @Override
  public Map<String, Object> toMap() {
    Map<String, Object> map = new LinkedHashMap<>();
    map.put("meta", this.getMeta());
    map.put("content", this.getContent());
    return map;
  }

  /**
   * Creates a RequestContent object from a Map.
   *
   * @param data Map containing the data to create the RequestContent object.
   * @return New RequestContent object.
   */
  @NotNull
  @Contract("_ -> new")
  public static RequestContent fromMap(@NotNull Map<String, Object> data) {
    return new RequestContent(
        Meta.fromMap(Cast.safeToMap(data.get("meta"), String.class, Object.class)),
        Content.fromMap(Cast.safeToMap(data.get("content"), String.class, Object.class)));
  }
}
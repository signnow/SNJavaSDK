/*
 * This file is a part of signNow SDK API client.
 *
 * (с) Copyright © 2011-present airSlate Inc. (https://www.signnow.com)
 *
 * For more details on copyright, see LICENSE.md file
 * that was distributed with this source code.
 */

package com.signnow.api.documentinvite.response.data.meta;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.signnow.core.data.ApiData;
import java.util.LinkedHashMap;
import java.util.Map;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

public final class Pagination extends ApiData {

  @JsonProperty("total")
  private final int total;

  @JsonProperty("count")
  private final int count;

  @JsonProperty("per_page")
  private final int perPage;

  @JsonProperty("current_page")
  private final int currentPage;

  @JsonProperty("total_pages")
  private final int totalPages;

  @JsonProperty("links")
  private final LinkCollection links;

  @JsonCreator
  public Pagination(
      @JsonProperty("total") int total,
      @JsonProperty("count") int count,
      @JsonProperty("per_page") int perPage,
      @JsonProperty("current_page") int currentPage,
      @JsonProperty("total_pages") int totalPages,
      @JsonProperty("links") LinkCollection links) {
    this.total = total;
    this.count = count;
    this.perPage = perPage;
    this.currentPage = currentPage;
    this.totalPages = totalPages;
    this.links = links;
  }

  public int getTotal() {
    return this.total;
  }

  public int getCount() {
    return this.count;
  }

  public int getPerPage() {
    return this.perPage;
  }

  public int getCurrentPage() {
    return this.currentPage;
  }

  public int getTotalPages() {
    return this.totalPages;
  }

  public LinkCollection getLinks() {
    return this.links;
  }

  @NotNull
  @Override
  public Map<String, Object> toMap() {
    Map<String, Object> map = new LinkedHashMap<>();
    map.put("total", this.getTotal());
    map.put("count", this.getCount());
    map.put("per_page", this.getPerPage());
    map.put("current_page", this.getCurrentPage());
    map.put("total_pages", this.getTotalPages());
    map.put("links", this.getLinks());
    return map;
  }

  @NotNull
  @Contract("_ -> new")
  public static Pagination fromMap(@NotNull Map<String, Object> data) {
    return new Pagination(
        (int) data.get("total"),
        (int) data.get("count"),
        (int) data.get("per_page"),
        (int) data.get("current_page"),
        (int) data.get("total_pages"),
        (LinkCollection) data.get("links"));
  }
}

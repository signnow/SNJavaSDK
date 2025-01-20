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

/**
 * Pagination class extends ApiData.
 * It represents the pagination information of the API response.
 */
public final class Pagination extends ApiData {

  /**
   * Total number of items.
   */
  @JsonProperty("total")
  private final int total;

  /**
   * Count of items on the current page.
   */
  @JsonProperty("count")
  private final int count;

  /**
   * Number of items per page.
   */
  @JsonProperty("per_page")
  private final int perPage;

  /**
   * Current page number.
   */
  @JsonProperty("current_page")
  private final int currentPage;

  /**
   * Total number of pages.
   */
  @JsonProperty("total_pages")
  private final int totalPages;

  /**
   * Collection of links for pagination.
   */
  @JsonProperty("links")
  private final LinkCollection links;

  /**
   * Constructor for Pagination class.
   *
   * @param total Total number of items.
   * @param count Count of items on the current page.
   * @param perPage Number of items per page.
   * @param currentPage Current page number.
   * @param totalPages Total number of pages.
   * @param links Collection of links for pagination.
   */
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

  /**
   * @return Total number of items.
   */
  public int getTotal() {
    return this.total;
  }

  /**
   * @return Count of items on the current page.
   */
  public int getCount() {
    return this.count;
  }

  /**
   * @return Number of items per page.
   */
  public int getPerPage() {
    return this.perPage;
  }

  /**
   * @return Current page number.
   */
  public int getCurrentPage() {
    return this.currentPage;
  }

  /**
   * @return Total number of pages.
   */
  public int getTotalPages() {
    return this.totalPages;
  }

  /**
   * @return Collection of links for pagination.
   */
  public LinkCollection getLinks() {
    return this.links;
  }

  /**
   * Converts the Pagination object to a Map.
   *
   * @return Map representation of the Pagination object.
   */
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

  /**
   * Creates a Pagination object from a Map.
   *
   * @param data Map containing the data for the Pagination object.
   * @return New Pagination object.
   */
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
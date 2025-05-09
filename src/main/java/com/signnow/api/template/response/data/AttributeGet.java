/*
 * This file is a part of signNow SDK API client.
 *
 * (с) Copyright © 2011-present airSlate Inc. (https://www.signnow.com)
 *
 * For more details on copyright, see LICENSE.md file
 * that was distributed with this source code.
 */

package com.signnow.api.template.response.data;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.LinkedHashMap;
import java.util.Map;

import com.signnow.core.data.ApiData;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

/**
 *  Represents the attributes for getting a template.
 */
public final class AttributeGet extends ApiData {

  /**
   * Identifier of the associated brand.
   */
  @JsonProperty("brand_id")
  private final String brandId;

  /**
   * URI to redirect the user to after completing an action.
   */
  @JsonProperty("redirect_uri")
  private final String redirectUri;

  /**
   * Optional callback or action to perform when the process is complete.
   */
  @JsonProperty("on_complete")
  private final String onComplete;

  /**
   * Constructs an instance of {@code AttributeGet}.
   *
   * @param brandId the brand ID
   * @param redirectUri the redirect URI
   * @param onComplete the on complete action
   */
  @JsonCreator
  public AttributeGet(
      @JsonProperty("brand_id") String brandId,
      @JsonProperty("redirect_uri") String redirectUri,
      @JsonProperty("on_complete") String onComplete) {
    this.brandId = brandId;
    this.redirectUri = redirectUri;
    this.onComplete = onComplete;
  }

  /**
   * Gets the brand ID.
   *
   * @return the brand ID
   */
  public String getBrandId() {
    return this.brandId;
  }

  /**
   * Gets the redirect URI.
   *
   * @return the redirect URI
   */
  public String getRedirectUri() {
    return this.redirectUri;
  }

  /**
   * Gets the on complete action.
   *
   * @return the on complete action
   */
  public String getOnComplete() {
    return this.onComplete;
  }

  /**
   * Converts the attributes to a map.
   *
   * @return a map representation of the attributes
   */
  @NotNull
  public Map<String, Object> toMap() {
    Map<String, Object> map = new LinkedHashMap<>();
    map.put("brand_id", this.getBrandId());
    map.put("redirect_uri", this.getRedirectUri());
    map.put("on_complete", this.getOnComplete());
    return map;
  }

  /**
   * Creates an instance of {@code AttributeGet} from a map.
   *
   * @param data the map containing attribute data
   * @return a new instance of {@code AttributeGet}
   */
  @NotNull
  @Contract("_ -> new")
  public static AttributeGet fromMap(@NotNull Map<String, Object> data) {
    return new AttributeGet(
        (String) data.get("brand_id"),
        (String) data.get("redirect_uri"),
        (String) data.get("on_complete"));
  }
}

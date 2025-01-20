/*
 * This file is a part of signNow SDK API client.
 *
 * (с) Copyright © 2011-present airSlate Inc. (https://www.signnow.com)
 *
 * For more details on copyright, see LICENSE.md file
 * that was distributed with this source code.
 */

package com.signnow.api.documentinvite.request.data;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.signnow.core.data.ApiData;
import java.util.LinkedHashMap;
import java.util.Map;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

/**
 * This class represents a Signature which extends ApiData.
 */
public final class Signature extends ApiData {

  /**
   * The type of the signature.
   */
  @JsonProperty("type")
  private final String type;

  /**
   * Constructor for the Signature class.
   *
   * @param type The type of the signature.
   */
  @JsonCreator
  public Signature(@JsonProperty("type") String type) {
    this.type = type;
  }

  /**
   * This method is used to get the type of the signature.
   *
   * @return String This returns the type of the signature.
   */
  public String getType() {
    return this.type;
  }

  /**
   * This method is used to convert the signature object to a map.
   *
   * @return Map This returns the signature object as a map.
   */
  @NotNull
  @Override
  public Map<String, Object> toMap() {
    Map<String, Object> map = new LinkedHashMap<>();
    map.put("type", this.getType());
    return map;
  }

  /**
   * This method is used to create a signature object from a map.
   *
   * @param data The map containing the signature data.
   * @return Signature This returns a new signature object.
   */
  @NotNull
  @Contract("_ -> new")
  public static Signature fromMap(@NotNull Map<String, Object> data) {
    return new Signature((String) data.get("type"));
  }
}
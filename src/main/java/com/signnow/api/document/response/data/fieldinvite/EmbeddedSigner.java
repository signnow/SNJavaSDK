/*
 * This file is a part of signNow SDK API client.
 *
 * (с) Copyright © 2011-present airSlate Inc. (https://www.signnow.com)
 *
 * For more details on copyright, see LICENSE.md file
 * that was distributed with this source code.
 */

package com.signnow.api.document.response.data.fieldinvite;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.signnow.core.data.ApiData;
import java.util.LinkedHashMap;
import java.util.Map;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

/**
 * This class represents an embedded signer in the signNow API.
 */
public final class EmbeddedSigner extends ApiData {

  /**
   * The first name of the embedded signer.
   */
  @JsonProperty("first_name")
  private final String firstName;

  /**
   * The last name of the embedded signer.
   */
  @JsonProperty("last_name")
  private final String lastName;

  /**
   * Constructs an EmbeddedSigner object with the specified first name and last name.
   *
   * @param firstName the first name of the embedded signer
   * @param lastName the last name of the embedded signer
   */
  @JsonCreator
  public EmbeddedSigner(
      @JsonProperty("first_name") String firstName, @JsonProperty("last_name") String lastName) {
    this.firstName = firstName;
    this.lastName = lastName;
  }

  /**
   * Returns the first name of the embedded signer.
   *
   * @return the first name of the embedded signer
   */
  public String getFirstName() {
    return this.firstName;
  }

  /**
   * Returns the last name of the embedded signer.
   *
   * @return the last name of the embedded signer
   */
  public String getLastName() {
    return this.lastName;
  }

  /**
   * Converts this EmbeddedSigner object to a Map.
   *
   * @return a Map representing this EmbeddedSigner object
   */
  @NotNull
  @Override
  public Map<String, Object> toMap() {
    Map<String, Object> map = new LinkedHashMap<>();
    map.put("first_name", this.getFirstName());
    map.put("last_name", this.getLastName());
    return map;
  }

  /**
   * Creates an EmbeddedSigner object from the specified Map.
   *
   * @param data a Map containing the data for the EmbeddedSigner object
   * @return a new EmbeddedSigner object created from the specified Map
   */
  @NotNull
  @Contract("_ -> new")
  public static EmbeddedSigner fromMap(@NotNull Map<String, Object> data) {
    return new EmbeddedSigner((String) data.get("first_name"), (String) data.get("last_name"));
  }
}
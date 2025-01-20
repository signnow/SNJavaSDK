/*
 * This file is a part of signNow SDK API client.
 *
 * (с) Copyright © 2011-present airSlate Inc. (https://www.signnow.com)
 *
 * For more details on copyright, see LICENSE.md file
 * that was distributed with this source code.
 */

package com.signnow.api.embeddedgroupinvite.request.data.invite;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.signnow.core.data.ApiData;
import java.util.LinkedHashMap;
import java.util.Map;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

/**
 * This class represents an Invite which extends ApiData.
 */
public final class Invite extends ApiData {

  /**
   * The order of the invite.
   */
  @JsonProperty("order")
  private final int order;

  /**
   * The collection of signers for the invite.
   */
  @JsonProperty("signers")
  private final SignerCollection signers;

  /**
   * Constructs an Invite object with the specified order and signers.
   *
   * @param order the order of the invite
   * @param signers the collection of signers for the invite
   */
  @JsonCreator
  public Invite(
      @JsonProperty("order") int order, @JsonProperty("signers") SignerCollection signers) {
    this.order = order;
    this.signers = signers;
  }

  /**
   * Returns the order of the invite.
   *
   * @return the order of the invite
   */
  public int getOrder() {
    return this.order;
  }

  /**
   * Returns the collection of signers for the invite.
   *
   * @return the collection of signers for the invite
   */
  public SignerCollection getSigners() {
    return this.signers;
  }

  /**
   * Converts the Invite object to a Map.
   *
   * @return a Map representing the Invite object
   */
  @NotNull
  @Override
  public Map<String, Object> toMap() {
    Map<String, Object> map = new LinkedHashMap<>();
    map.put("order", this.getOrder());
    map.put("signers", this.getSigners());
    return map;
  }

  /**
   * Constructs an Invite object from a Map.
   *
   * @param data a Map representing the Invite object
   * @return an Invite object constructed from the Map
   */
  @NotNull
  @Contract("_ -> new")
  public static Invite fromMap(@NotNull Map<String, Object> data) {
    return new Invite((int) data.get("order"), (SignerCollection) data.get("signers"));
  }
}
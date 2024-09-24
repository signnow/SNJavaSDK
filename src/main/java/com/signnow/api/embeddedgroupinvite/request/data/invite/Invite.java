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

public final class Invite extends ApiData {

  @JsonProperty("order")
  private final int order;

  @JsonProperty("signers")
  private final SignerCollection signers;

  @JsonCreator
  public Invite(
      @JsonProperty("order") int order, @JsonProperty("signers") SignerCollection signers) {
    this.order = order;
    this.signers = signers;
  }

  public int getOrder() {
    return this.order;
  }

  public SignerCollection getSigners() {
    return this.signers;
  }

  @NotNull
  @Override
  public Map<String, Object> toMap() {
    Map<String, Object> map = new LinkedHashMap<>();
    map.put("order", this.getOrder());
    map.put("signers", this.getSigners());
    return map;
  }

  @NotNull
  @Contract("_ -> new")
  public static Invite fromMap(@NotNull Map<String, Object> data) {
    return new Invite((int) data.get("order"), (SignerCollection) data.get("signers"));
  }
}

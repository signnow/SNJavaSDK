/*
 * This file is a part of signNow SDK API client.
 *
 * (с) Copyright © 2011-present airSlate Inc. (https://www.signnow.com)
 *
 * For more details on copyright, see LICENSE.md file
 * that was distributed with this source code.
 */

package com.signnow.api.documentgroupinvite.request.data.invitestep;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.signnow.core.data.ApiData;
import java.util.LinkedHashMap;
import java.util.Map;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

public final class PaymentRequest extends ApiData {

  @JsonProperty("merchant_id")
  private final String merchantId;

  @JsonProperty("currency")
  private final String currency;

  @JsonProperty("type")
  private final String type;

  @JsonProperty("amount")
  private final String amount;

  @JsonCreator
  public PaymentRequest(
      @JsonProperty("merchant_id") String merchantId,
      @JsonProperty("currency") String currency,
      @JsonProperty("type") String type,
      @JsonProperty("amount") String amount) {
    this.merchantId = merchantId;
    this.currency = currency;
    this.type = type;
    this.amount = amount;
  }

  public String getMerchantId() {
    return this.merchantId;
  }

  public String getCurrency() {
    return this.currency;
  }

  public String getType() {
    return this.type;
  }

  public String getAmount() {
    return this.amount;
  }

  @NotNull
  @Override
  public Map<String, Object> toMap() {
    Map<String, Object> map = new LinkedHashMap<>();
    map.put("merchant_id", this.getMerchantId());
    map.put("currency", this.getCurrency());
    map.put("type", this.getType());
    map.put("amount", this.getAmount());
    return map;
  }

  @NotNull
  @Contract("_ -> new")
  public static PaymentRequest fromMap(@NotNull Map<String, Object> data) {
    return new PaymentRequest(
        (String) data.getOrDefault("merchant_id", ""),
        (String) data.getOrDefault("currency", ""),
        (String) data.getOrDefault("type", ""),
        (String) data.getOrDefault("amount", ""));
  }
}

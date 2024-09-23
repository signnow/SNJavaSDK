/*
 * This file is a part of signNow SDK API client.
 *
 * (с) Copyright © 2011-present airSlate Inc. (https://www.signnow.com)
 *
 * For more details on copyright, see LICENSE.md file
 * that was distributed with this source code.
 */

package com.signnow.api.document.response.data;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.signnow.core.data.ApiData;
import java.util.LinkedHashMap;
import java.util.Map;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

public final class Payment extends ApiData {

  @JsonProperty("id")
  private final String id;

  @JsonProperty("user_id")
  private final String userId;

  @JsonProperty("email")
  private final String email;

  @JsonProperty("created")
  private final String created;

  @JsonProperty("amount")
  private final String amount;

  @JsonProperty("payment_request_id")
  private final String paymentRequestId;

  @JsonProperty("merchant_id")
  private final String merchantId;

  @JsonProperty("merchant_type")
  private final String merchantType;

  @JsonProperty("merchant_account_name")
  private final String merchantAccountName;

  @JsonProperty("currency_name")
  private final String currencyName;

  @JsonProperty("currency")
  private final String currency;

  @JsonCreator
  public Payment(
      @JsonProperty("id") String id,
      @JsonProperty("user_id") String userId,
      @JsonProperty("email") String email,
      @JsonProperty("created") String created,
      @JsonProperty("amount") String amount,
      @JsonProperty("payment_request_id") String paymentRequestId,
      @JsonProperty("merchant_id") String merchantId,
      @JsonProperty("merchant_type") String merchantType,
      @JsonProperty("merchant_account_name") String merchantAccountName,
      @JsonProperty("currency_name") String currencyName,
      @JsonProperty("currency") String currency) {
    this.id = id;
    this.userId = userId;
    this.email = email;
    this.created = created;
    this.amount = amount;
    this.paymentRequestId = paymentRequestId;
    this.merchantId = merchantId;
    this.merchantType = merchantType;
    this.merchantAccountName = merchantAccountName;
    this.currencyName = currencyName;
    this.currency = currency;
  }

  public String getId() {
    return this.id;
  }

  public String getUserId() {
    return this.userId;
  }

  public String getEmail() {
    return this.email;
  }

  public String getCreated() {
    return this.created;
  }

  public String getAmount() {
    return this.amount;
  }

  public String getPaymentRequestId() {
    return this.paymentRequestId;
  }

  public String getMerchantId() {
    return this.merchantId;
  }

  public String getMerchantType() {
    return this.merchantType;
  }

  public String getMerchantAccountName() {
    return this.merchantAccountName;
  }

  public String getCurrencyName() {
    return this.currencyName;
  }

  public String getCurrency() {
    return this.currency;
  }

  @NotNull
  @Override
  public Map<String, Object> toMap() {
    Map<String, Object> map = new LinkedHashMap<>();
    map.put("id", this.getId());
    map.put("user_id", this.getUserId());
    map.put("email", this.getEmail());
    map.put("created", this.getCreated());
    map.put("amount", this.getAmount());
    map.put("payment_request_id", this.getPaymentRequestId());
    map.put("merchant_id", this.getMerchantId());
    map.put("merchant_type", this.getMerchantType());
    map.put("merchant_account_name", this.getMerchantAccountName());
    map.put("currency_name", this.getCurrencyName());
    map.put("currency", this.getCurrency());
    return map;
  }

  @NotNull
  @Contract("_ -> new")
  public static Payment fromMap(@NotNull Map<String, Object> data) {
    return new Payment(
        (String) data.get("id"),
        (String) data.get("user_id"),
        (String) data.get("email"),
        (String) data.get("created"),
        (String) data.get("amount"),
        (String) data.getOrDefault("payment_request_id", null),
        (String) data.getOrDefault("merchant_id", null),
        (String) data.getOrDefault("merchant_type", null),
        (String) data.getOrDefault("merchant_account_name", null),
        (String) data.getOrDefault("currency_name", null),
        (String) data.getOrDefault("currency", null));
  }
}

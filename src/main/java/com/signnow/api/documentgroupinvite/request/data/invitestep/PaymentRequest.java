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

/**
 * This class represents a payment request.
 */
public final class PaymentRequest extends ApiData {

  /**
   * The ID of the merchant.
   */
  @JsonProperty("merchant_id")
  private final String merchantId;

  /**
   * The currency of the payment.
   */
  @JsonProperty("currency")
  private final String currency;

  /**
   * The type of the payment.
   */
  @JsonProperty("type")
  private final String type;

  /**
   * The amount of the payment.
   */
  @JsonProperty("amount")
  private final String amount;

  /**
   * Constructs a new PaymentRequest with the specified details.
   *
   * @param merchantId the ID of the merchant
   * @param currency the currency of the payment
   * @param type the type of the payment
   * @param amount the amount of the payment
   */
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

  /**
   * Returns the ID of the merchant.
   *
   * @return the merchant ID
   */
  public String getMerchantId() {
    return this.merchantId;
  }

  /**
   * Returns the currency of the payment.
   *
   * @return the currency
   */
  public String getCurrency() {
    return this.currency;
  }

  /**
   * Returns the type of the payment.
   *
   * @return the type
   */
  public String getType() {
    return this.type;
  }

  /**
   * Returns the amount of the payment.
   *
   * @return the amount
   */
  public String getAmount() {
    return this.amount;
  }

  /**
   * Converts this PaymentRequest to a Map.
   *
   * @return a Map representation of this PaymentRequest
   */
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

  /**
   * Creates a new PaymentRequest from the specified Map.
   *
   * @param data a Map containing the details of the PaymentRequest
   * @return a new PaymentRequest with the details from the Map
   */
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
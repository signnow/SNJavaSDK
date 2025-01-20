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

/**
 * Payment class extends ApiData.
 * Represents a payment made by a user.
 */
public final class Payment extends ApiData {

  /**
   * The unique identifier for the payment.
   */
  @JsonProperty("id")
  private final String id;

  /**
   * The unique identifier for the user who made the payment.
   */
  @JsonProperty("user_id")
  private final String userId;

  /**
   * The email of the user who made the payment.
   */
  @JsonProperty("email")
  private final String email;

  /**
   * The date when the payment was created.
   */
  @JsonProperty("created")
  private final String created;

  /**
   * The amount of the payment.
   */
  @JsonProperty("amount")
  private final String amount;

  /**
   * The unique identifier for the payment request.
   */
  @JsonProperty("payment_request_id")
  private final String paymentRequestId;

  /**
   * The unique identifier for the merchant.
   */
  @JsonProperty("merchant_id")
  private final String merchantId;

  /**
   * The type of the merchant.
   */
  @JsonProperty("merchant_type")
  private final String merchantType;

  /**
   * The name of the merchant account.
   */
  @JsonProperty("merchant_account_name")
  private final String merchantAccountName;

  /**
   * The name of the currency used for the payment.
   */
  @JsonProperty("currency_name")
  private final String currencyName;

  /**
   * The currency used for the payment.
   */
  @JsonProperty("currency")
  private final String currency;

  /**
   * Constructor for Payment class.
   *
   * @param id The unique identifier for the payment.
   * @param userId The unique identifier for the user who made the payment.
   * @param email The email of the user who made the payment.
   * @param created The date when the payment was created.
   * @param amount The amount of the payment.
   * @param paymentRequestId The unique identifier for the payment request.
   * @param merchantId The unique identifier for the merchant.
   * @param merchantType The type of the merchant.
   * @param merchantAccountName The name of the merchant account.
   * @param currencyName The name of the currency used for the payment.
   * @param currency The currency used for the payment.
   */
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

  /**
   * @return the unique identifier for the payment.
   */
  public String getId() {
    return this.id;
  }

  /**
   * @return the unique identifier for the user who made the payment.
   */
  public String getUserId() {
    return this.userId;
  }

  /**
   * @return the email of the user who made the payment.
   */
  public String getEmail() {
    return this.email;
  }

  /**
   * @return the date when the payment was created.
   */
  public String getCreated() {
    return this.created;
  }

  /**
   * @return the amount of the payment.
   */
  public String getAmount() {
    return this.amount;
  }

  /**
   * @return the unique identifier for the payment request.
   */
  public String getPaymentRequestId() {
    return this.paymentRequestId;
  }

  /**
   * @return the unique identifier for the merchant.
   */
  public String getMerchantId() {
    return this.merchantId;
  }

  /**
   * @return the type of the merchant.
   */
  public String getMerchantType() {
    return this.merchantType;
  }

  /**
   * @return the name of the merchant account.
   */
  public String getMerchantAccountName() {
    return this.merchantAccountName;
  }

  /**
   * @return the name of the currency used for the payment.
   */
  public String getCurrencyName() {
    return this.currencyName;
  }

  /**
   * @return the currency used for the payment.
   */
  public String getCurrency() {
    return this.currency;
  }

  /**
   * Converts the Payment object to a Map.
   *
   * @return a Map containing the properties of the Payment object.
   */
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

  /**
   * Creates a Payment object from a Map.
   *
   * @param data a Map containing the properties of the Payment object.
   * @return a new Payment object.
   */
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
/*
 * This file is a part of signNow SDK API client.
 *
 * (с) Copyright © 2011-present airSlate Inc. (https://www.signnow.com)
 *
 * For more details on copyright, see LICENSE.md file
 * that was distributed with this source code.
 */

package com.signnow.api.user.response.data.merchantaccount;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.signnow.core.data.ApiData;
import java.util.LinkedHashMap;
import java.util.Map;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

/**
 * This class represents a Merchant Account.
 */
public final class MerchantAccount extends ApiData {

  /**
   * The id of the Merchant Account.
   */
  @JsonProperty("id")
  private final String id;

  /**
   * The scope of the Merchant Account.
   */
  @JsonProperty("scope")
  private final String scope;

  /**
   * The type of the Merchant.
   */
  @JsonProperty("merchant_type")
  private final String merchantType;

  /**
   * The name of the Merchant Account.
   */
  @JsonProperty("merchant_account_name")
  private final String merchantAccountName;

  /**
   * The collection of currencies supported by the Merchant Account.
   */
  @JsonProperty("currencies")
  private final CurrencyCollection currencies;

  /**
   * The currency of the Merchant Account.
   */
  @JsonProperty("currency")
  private final String currency;

  /**
   * The name of the currency of the Merchant Account.
   */
  @JsonProperty("currency_name")
  private final String currencyName;

  /**
   * Constructor for the MerchantAccount class.
   *
   * @param id The id of the Merchant Account.
   * @param scope The scope of the Merchant Account.
   * @param merchantType The type of the Merchant.
   * @param merchantAccountName The name of the Merchant Account.
   * @param currencies The collection of currencies supported by the Merchant Account.
   * @param currency The currency of the Merchant Account.
   * @param currencyName The name of the currency of the Merchant Account.
   */
  @JsonCreator
  public MerchantAccount(
      @JsonProperty("id") String id,
      @JsonProperty("scope") String scope,
      @JsonProperty("merchant_type") String merchantType,
      @JsonProperty("merchant_account_name") String merchantAccountName,
      @JsonProperty("currencies") CurrencyCollection currencies,
      @JsonProperty("currency") String currency,
      @JsonProperty("currency_name") String currencyName) {
    this.id = id;
    this.scope = scope;
    this.merchantType = merchantType;
    this.merchantAccountName = merchantAccountName;
    this.currencies = currencies;
    this.currency = currency;
    this.currencyName = currencyName;
  }

  /**
   * @return The id of the Merchant Account.
   */
  public String getId() {
    return this.id;
  }

  /**
   * @return The scope of the Merchant Account.
   */
  public String getScope() {
    return this.scope;
  }

  /**
   * @return The type of the Merchant.
   */
  public String getMerchantType() {
    return this.merchantType;
  }

  /**
   * @return The name of the Merchant Account.
   */
  public String getMerchantAccountName() {
    return this.merchantAccountName;
  }

  /**
   * @return The collection of currencies supported by the Merchant Account.
   */
  public CurrencyCollection getCurrencies() {
    return this.currencies;
  }

  /**
   * @return The currency of the Merchant Account.
   */
  public String getCurrency() {
    return this.currency;
  }

  /**
   * @return The name of the currency of the Merchant Account.
   */
  public String getCurrencyName() {
    return this.currencyName;
  }

  /**
   * Converts the MerchantAccount object to a Map.
   *
   * @return A Map representation of the MerchantAccount object.
   */
  @NotNull
  @Override
  public Map<String, Object> toMap() {
    Map<String, Object> map = new LinkedHashMap<>();
    map.put("id", this.getId());
    map.put("scope", this.getScope());
    map.put("merchant_type", this.getMerchantType());
    map.put("merchant_account_name", this.getMerchantAccountName());
    map.put("currencies", this.getCurrencies());
    map.put("currency", this.getCurrency());
    map.put("currency_name", this.getCurrencyName());
    return map;
  }

  /**
   * Creates a MerchantAccount object from a Map.
   *
   * @param data A Map containing the data for the MerchantAccount object.
   * @return A new MerchantAccount object.
   */
  @NotNull
  @Contract("_ -> new")
  public static MerchantAccount fromMap(@NotNull Map<String, Object> data) {
    return new MerchantAccount(
        (String) data.get("id"),
        (String) data.get("scope"),
        (String) data.get("merchant_type"),
        (String) data.get("merchant_account_name"),
        (CurrencyCollection) data.get("currencies"),
        (String) data.get("currency"),
        (String) data.get("currency_name"));
  }
}
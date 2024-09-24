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

public final class MerchantAccount extends ApiData {

  @JsonProperty("id")
  private final String id;

  @JsonProperty("scope")
  private final String scope;

  @JsonProperty("merchant_type")
  private final String merchantType;

  @JsonProperty("merchant_account_name")
  private final String merchantAccountName;

  @JsonProperty("currencies")
  private final CurrencyCollection currencies;

  @JsonProperty("currency")
  private final String currency;

  @JsonProperty("currency_name")
  private final String currencyName;

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

  public String getId() {
    return this.id;
  }

  public String getScope() {
    return this.scope;
  }

  public String getMerchantType() {
    return this.merchantType;
  }

  public String getMerchantAccountName() {
    return this.merchantAccountName;
  }

  public CurrencyCollection getCurrencies() {
    return this.currencies;
  }

  public String getCurrency() {
    return this.currency;
  }

  public String getCurrencyName() {
    return this.currencyName;
  }

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

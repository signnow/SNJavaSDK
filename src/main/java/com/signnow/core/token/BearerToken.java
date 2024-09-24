/*
 * This file is a part of signNow SDK API client.
 *
 * (с) Copyright © 2011-present airSlate Inc. (https://www.signnow.com)
 *
 * For more details on copyright, see LICENSE.md file
 * that was distributed with this source code.
 */

package com.signnow.core.token;

import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

public final class BearerToken implements TokenInterface {

  private final String accessToken;

  private final String refreshToken;

  private final int expires;

  public BearerToken(String accessToken, String refreshToken, int expires) {
    this.accessToken = accessToken;
    this.refreshToken = refreshToken;
    this.expires = expires;
  }

  public BearerToken(String accessToken) {
    this.accessToken = accessToken;
    this.refreshToken = null;
    this.expires = 0;
  }

  @NotNull
  @Contract(pure = true)
  @Override
  public String type() {
    return "Bearer";
  }

  @Override
  public String token() {
    return this.accessToken;
  }

  @Override
  public String toString() {
    return this.token();
  }

  public String refreshToken() {
    return this.refreshToken;
  }

  public int expires() {
    return this.expires;
  }

  public boolean isEmpty() {
    return this.token().isEmpty();
  }
}

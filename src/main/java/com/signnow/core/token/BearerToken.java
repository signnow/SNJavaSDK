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

/**
 * This class represents a Bearer token which implements the TokenInterface.
 */
public final class BearerToken implements TokenInterface {

  /**
   * The access token string.
   */
  private final String accessToken;

  /**
   * The refresh token string.
   */
  private final String refreshToken;

  /**
   * The expiration time in seconds.
   */
  private final int expires;

  /**
   * Constructs a new BearerToken with the specified access token, refresh token and expiration time.
   *
   * @param accessToken  the access token string
   * @param refreshToken the refresh token string
   * @param expires      the expiration time in seconds
   */
  public BearerToken(String accessToken, String refreshToken, int expires) {
    this.accessToken = accessToken;
    this.refreshToken = refreshToken;
    this.expires = expires;
  }

  /**
   * Constructs a new BearerToken with the specified access token.
   *
   * @param accessToken the access token string
   */
  public BearerToken(String accessToken) {
    this.accessToken = accessToken;
    this.refreshToken = null;
    this.expires = 0;
  }

  /**
   * Returns the type of the token.
   *
   * @return the type of the token
   */
  @NotNull
  @Contract(pure = true)
  @Override
  public String type() {
    return "Bearer";
  }

  /**
   * Returns the access token.
   *
   * @return the access token
   */
  @Override
  public String token() {
    return this.accessToken;
  }

  /**
   * Returns the string representation of the access token.
   *
   * @return the string representation of the access token
   */
  @Override
  public String toString() {
    return this.token();
  }

  /**
   * Returns the refresh token.
   *
   * @return the refresh token
   */
  public String refreshToken() {
    return this.refreshToken;
  }

  /**
   * Returns the expiration time in seconds.
   *
   * @return the expiration time in seconds
   */
  public int expires() {
    return this.expires;
  }

  /**
   * Checks if the access token is empty.
   *
   * @return true if the access token is empty, false otherwise
   */
  public boolean isEmpty() {
    return this.token().isEmpty();
  }
}
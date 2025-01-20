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
 * This class represents a basic token implementation.
 * It implements the TokenInterface.
 */
public final class BasicToken implements TokenInterface {

  /**
   * The token string.
   */
  private final String token;

  /**
   * Constructs a new BasicToken with the specified token string.
   *
   * @param token the token string
   */
  public BasicToken(String token) {
    this.token = token;
  }

  /**
   * Returns the type of the token.
   * In this case, it is always "Basic".
   *
   * @return the type of the token
   */
  @NotNull
  @Contract(pure = true)
  @Override
  public String type() {
    return "Basic";
  }

  /**
   * Returns the token string.
   *
   * @return the token string
   */
  @Override
  public String token() {
    return this.token;
  }
}
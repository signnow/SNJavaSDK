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

public final class BasicToken implements TokenInterface {

  private final String token;

  public BasicToken(String token) {
    this.token = token;
  }

  @NotNull
  @Contract(pure = true)
  @Override
  public String type() {
    return "Basic";
  }

  @Override
  public String token() {
    return this.token;
  }
}

/*
 * This file is a part of signNow SDK API client.
 *
 * (с) Copyright © 2011-present airSlate Inc. (https://www.signnow.com)
 *
 * For more details on copyright, see LICENSE.md file
 * that was distributed with this source code.
 */

package com.signnow.core.token;

/**
 * This interface represents a token and its type.
 * It provides methods to get the token type and the token itself.
 */
interface TokenInterface {

  /**
   * This method is used to get the type of the token.
   * The token type can be Basic or Bearer.
   *
   * @return String This returns the type of the token.
   */
  String type();

  /**
   * This method is used to get the token.
   * The token is a unique identifier that is used for authentication.
   *
   * @return String This returns the token.
   */
  String token();
}
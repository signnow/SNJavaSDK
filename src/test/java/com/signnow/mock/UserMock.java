/*
 * This file is a part of signNow SDK API client.
 *
 * (с) Copyright © 2011-present airSlate Inc. (https://www.signnow.com)
 *
 * For more details on copyright, see LICENSE.md file
 * that was distributed with this source code.
 */

package com.signnow.mock;

public class UserMock {

  private final String id;

  private final String name;

  private final String email;

  public UserMock(String id, String name, String email) {
    this.id = id;
    this.name = name;
    this.email = email;
  }

  public String getId() {
    return this.id;
  }

  public String getName() {
    return this.name;
  }

  public String getEmail() {
    return this.email;
  }
}

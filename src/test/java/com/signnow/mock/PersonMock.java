/*
 * This file is a part of signNow SDK API client.
 *
 * (с) Copyright © 2011-present airSlate Inc. (https://www.signnow.com)
 *
 * For more details on copyright, see LICENSE.md file
 * that was distributed with this source code.
 */

package com.signnow.mock;

public class PersonMock {

  private final String name;

  private final int age;

  private final String homeAddress;

  public PersonMock(String name, int age, String homeAddress) {
    this.name = name;
    this.age = age;
    this.homeAddress = homeAddress;
  }

  public String getName() {
    return this.name;
  }

  public int getAge() {
    return this.age;
  }

  public String getHomeAddress() {
    return this.homeAddress;
  }
}

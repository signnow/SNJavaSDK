/*
 * This file is a part of signNow SDK API client.
 *
 * (с) Copyright © 2011-present airSlate Inc. (https://www.signnow.com)
 *
 * For more details on copyright, see LICENSE.md file
 * that was distributed with this source code.
 */

package com.signnow.core.collection;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

public class StringCollectionTest {

  @Test
  public void testStringCollection() {
    var roles = new StringCollection();

    roles.add("Product Manager");
    roles.add("Java Developer");
    roles.add("Software Engineer");

    String[] expected = {"Product Manager", "Java Developer", "Software Engineer"};
    assertArrayEquals(expected, roles.toArray());
  }
}

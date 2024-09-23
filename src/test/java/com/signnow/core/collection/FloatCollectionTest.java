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

public class FloatCollectionTest {

  @Test
  public void testFloatCollection() {
    var floats = new FloatCollection();
    floats.add(1.0F);
    floats.add(15.5F);

    Float[] expected = {1.0F, 15.5F};
    assertArrayEquals(expected, floats.toArray());
  }
}

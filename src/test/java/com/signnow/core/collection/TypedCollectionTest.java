/*
 * This file is a part of signNow SDK API client.
 *
 * (с) Copyright © 2011-present airSlate Inc. (https://www.signnow.com)
 *
 * For more details on copyright, see LICENSE.md file
 * that was distributed with this source code.
 */

package com.signnow.core.collection;

import static org.junit.jupiter.api.Assertions.*;

import com.signnow.mock.UserMock;
import java.util.List;
import org.junit.jupiter.api.Test;

public class TypedCollectionTest {

  @Test
  public void testCreateUpdateRemove() {
    var fruits = new TypedCollection<String>();

    assertTrue(fruits.isEmpty());

    fruits.add("Apple");
    fruits.add("Pineapple");

    assertFalse(fruits.isEmpty());
    assertEquals(2, fruits.size());
    assertTrue(fruits.contains("Apple"));
    assertFalse(fruits.contains("not_found"));
    assertEquals("Apple", fruits.get(0));
    assertEquals("Pineapple", fruits.get(1));
    assertEquals(0, fruits.indexOf("Apple"));
    assertEquals(1, fruits.indexOf("Pineapple"));

    fruits.remove("Pineapple");
    assertFalse(fruits.contains("Pineapple"));
    assertEquals(1, fruits.size());

    fruits.set(0, "Banana");
    assertEquals(1, fruits.size());
    assertEquals("Banana", fruits.get(0));

    fruits.clear();
    assertEquals(0, fruits.size());
    assertTrue(fruits.isEmpty());
  }

  @Test
  public void testObjectToArrayAndToJson() {
    var users = new TypedCollection<UserMock>();

    users.add(new UserMock("de42df00", "nord", "nord@signnow.com"));
    users.add(new UserMock("0345a88b", "hord", "hord@signnow.com"));

    var array = users.toArray();
    UserMock user0 = (UserMock) array[0];
    UserMock user1 = (UserMock) array[1];
    assertEquals("de42df00", user0.getId());
    assertEquals("0345a88b", user1.getId());

    assertEquals(
        "[{\"id\":\"de42df00\",\"name\":\"nord\",\"email\":\"nord@signnow.com\"},"
            + "{\"id\":\"0345a88b\",\"name\":\"hord\",\"email\":\"hord@signnow.com\"}]",
        users.toJson());
  }

  @Test
  public void testGoThrough() {
    var users = new TypedCollection<UserMock>();

    users.add(new UserMock("f022d310", "if", "if@signnow.com"));
    users.add(new UserMock("0f35e44f", "for", "for@signnow.com"));
    users.add(new UserMock("d31f0447", "while", "while@signnow.com"));

    var first = users.first();
    var last = users.last();
    assertEquals("f022d310", first.getId());
    assertEquals("while@signnow.com", last.getEmail());

    users.next();
    var middle = users.current();
    var middleKey = users.key();
    assertEquals("for", middle.getName());
    assertEquals(1, middleKey);

    users.next();
    last = users.current();
    assertEquals("d31f0447", last.getId());
    assertEquals("while", last.getName());
    assertEquals("while@signnow.com", last.getEmail());

    users.rewind();
    first = users.current();
    assertEquals("f022d310", first.getId());
    assertEquals("if", first.getName());
    assertEquals("if@signnow.com", first.getEmail());
  }

  @Test
  public void testSearch() {
    var subjects = new TypedCollection<String>();
    var copy = subjects;

    subjects.add("table");
    subjects.add("chair");
    subjects.add("cup");

    assertTrue(subjects.contains("table"));
    assertTrue(subjects.contains("chair"));
    assertTrue(subjects.contains("cup"));
    assertFalse(subjects.contains("draw"));
    assertTrue(subjects.containsAll(copy));

    assertEquals(0, subjects.indexOf("table"));
    assertEquals(1, subjects.indexOf("chair"));
    assertEquals(2, subjects.indexOf("cup"));
  }

  @Test
  public void testMerge() {
    var users1 = new TypedCollection<UserMock>();
    var users2 = new TypedCollection<UserMock>();

    users1.add(new UserMock("f022d310", "while", "while@signnow.com"));
    users2.add(new UserMock("d31f0447", "for", "for@signnow.com"));
    users1.merge(users2);
    assertEquals(2, users1.size());
    assertEquals(1, users2.size());

    users1.retainAll(users2);
    var user = users1.first();
    assertEquals(1, users1.size());
    assertEquals("d31f0447", user.getId());
    assertEquals("for", user.getName());
    assertEquals("for@signnow.com", user.getEmail());

    users1.removeAll(users2);
    assertTrue(users1.isEmpty());
  }

  @Test
  public void testMap() {
    TypedCollection<Integer> numbers = new TypedCollection<>();
    numbers.add(1);
    numbers.add(2);
    numbers.add(3);

    TypedCollection<Integer> doubledNumbers = numbers.map(x -> x * 2);
    assertEquals(2, doubledNumbers.get(0));
    assertEquals(4, doubledNumbers.get(1));
    assertEquals(6, doubledNumbers.get(2));
  }

  @Test
  public void testReduce() {
    TypedCollection<Integer> numbers = new TypedCollection<>();
    numbers.add(15);
    numbers.add(25);
    numbers.add(35);

    assertEquals(75, numbers.reduce(0, Integer::sum));
  }

  @Test
  public void testSlice() {
    TypedCollection<String> cities = new TypedCollection<>();
    cities.add("Sidney");
    cities.add("Kyiv");
    cities.add("Warsaw");
    cities.add("Berlin");
    cities.add("New York");
    cities.add("Tokyo");

    TypedCollection<String> europeanCities = cities.slice(1, 4);
    assertEquals(3, europeanCities.size());
    assertEquals("Kyiv", europeanCities.get(0));
    assertEquals("Warsaw", europeanCities.get(1));
    assertEquals("Berlin", europeanCities.get(2));
  }

  @Test
  public void testFilter() {
    TypedCollection<Integer> numbers = new TypedCollection<>();
    numbers.add(1);
    numbers.add(2);
    numbers.add(3);
    numbers.add(4);
    numbers.add(5);
    numbers.add(6);
    numbers.add(7);

    TypedCollection<Integer> filteredNumbers = numbers.filter(x -> x % 2 == 0);
    assertEquals(3, filteredNumbers.size());
    assertEquals(2, filteredNumbers.get(0));
    assertEquals(4, filteredNumbers.get(1));
    assertEquals(6, filteredNumbers.get(2));
  }

  @Test
  public void testKeysValues() {
    TypedCollection<String> drinks = new TypedCollection<>();
    drinks.add("Juice");
    drinks.add("Tea");
    drinks.add("Coffee");
    drinks.add("Soda");

    List<Integer> keys = drinks.keys();
    assertEquals(0, keys.get(0));
    assertEquals(1, keys.get(1));
    assertEquals(2, keys.get(2));
    assertEquals(3, keys.get(3));

    List<String> values = drinks.values();
    assertEquals("Juice", values.get(0));
    assertEquals("Tea", values.get(1));
    assertEquals("Coffee", values.get(2));
    assertEquals("Soda", values.get(3));
  }
}

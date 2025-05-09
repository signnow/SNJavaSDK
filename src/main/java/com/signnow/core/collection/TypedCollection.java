/*
 * This file is a part of signNow SDK API client.
 *
 * (с) Copyright © 2011-present airSlate Inc. (https://www.signnow.com)
 *
 * For more details on copyright, see LICENSE.md file
 * that was distributed with this source code.
 */

package com.signnow.core.collection;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.signnow.core.contract.JsonSerializable;
import com.signnow.core.data.ApiData;
import com.signnow.core.util.Cast;
import java.util.*;
import org.jetbrains.annotations.NotNull;

/**
 * A typed collection class that implements Collection and JsonSerializable interfaces.
 * @param <T> the type of elements in this collection
 */
public class TypedCollection<T> implements Collection<T>, JsonSerializable {

  /**
   * List of elements in the collection.
   */
  private final List<T> elements;

  /**
   * Current index of the collection.
   */
  private int currentIndex = 0;

  /**
   * Default constructor that initializes an empty list of elements.
   */
  public TypedCollection() {
    this.elements = new ArrayList<>();
  }

  /**
   * Returns the current element in the collection.
   * @return the current element
   * @throws IndexOutOfBoundsException if the current index is out of bounds
   */
  public T current() {
    if (currentIndex >= 0 && currentIndex < elements.size()) {
      return elements.get(currentIndex);
    }
    throw new IndexOutOfBoundsException("Current index is out of bounds");
  }

  /**
   * Returns the current index of the collection.
   * @return the current index
   */
  public int key() {
    return currentIndex;
  }

  /**
   * Moves the current index to the next element if it exists.
   */
  public void next() {
    if (currentIndex < elements.size() - 1) {
      currentIndex++;
    }
  }

  /**
   * Resets the current index to the start of the collection.
   */
  public void rewind() {
    currentIndex = 0;
  }

  /**
   * Checks if the collection contains the specified element.
   * @param element the element to be checked
   * @return true if the collection contains the element, false otherwise
   */
  public boolean contains(Object element) {
    return elements.contains(element);
  }

  /**
   * Returns the index of the specified element in the collection.
   * @param element the element to find
   * @return the index of the element, or -1 if the collection does not contain the element
   */
  public int indexOf(T element) {
    return elements.indexOf(element);
  }

  /**
   * Returns the element at the specified position in the collection.
   * @param key index of the element to return
   * @return the element at the specified position
   * @throws IndexOutOfBoundsException if the index is out of range
   */
  public T get(int key) {
    if (key >= 0 && key < elements.size()) {
      return elements.get(key);
    }
    throw new IndexOutOfBoundsException("Index is out of bounds.");
  }

  /**
   * Replaces the element at the specified position in the collection with the specified element.
   * @param key index of the element to replace
   * @param value element to be stored at the specified position
   * @throws IndexOutOfBoundsException if the index is out of range
   */
  public void set(int key, T value) {
    if (key >= 0 && key < elements.size()) {
      elements.set(key, value);
    } else if (key == elements.size()) {
      elements.add(value);
    } else {
      throw new IndexOutOfBoundsException("Index is out of bounds.");
    }
  }

  /**
   * Returns the first element in the collection.
   * @return the first element
   * @throws IllegalStateException if the collection is empty
   */
  public T first() {
    if (!elements.isEmpty()) {
      return elements.get(0);
    }
    throw new IllegalStateException("Collection is empty.");
  }

  /**
   * Returns the last element in the collection.
   * @return the last element
   * @throws IllegalStateException if the collection is empty
   */
  public T last() {
    if (!elements.isEmpty()) {
      return elements.get(elements.size() - 1);
    }
    throw new IllegalStateException("Collection is empty.");
  }

  /**
   * Merges the specified collection into the current collection.
   * @param other the collection to be merged
   */
  public void merge(TypedCollection<T> other) {
    if (other != null) {
      this.addAll(other);
    }
  }

  /**
   * Returns a list of all keys in the collection.
   * @return a list of all keys
   */
  public List<Integer> keys() {
    List<Integer> keysList = new ArrayList<>();
    for (int i = 0; i < elements.size(); i++) {
      keysList.add(i);
    }
    return keysList;
  }

  /**
   * Returns a list of all values in the collection.
   * @return a list of all values
   */
  public List<T> values() {
    return new ArrayList<>(elements);
  }

  /**
   * Returns an array containing all the elements in the collection.
   * @return an array containing all the elements
   */
  @NotNull
  public Object[] toArray() {
    return elements.toArray();
  }

  /**
   * Converts the collection to a JSON string.
   * @return a JSON string representation of the collection
   */
  @Override
  public String toJson() {
    ObjectMapper objectMapper = new ObjectMapper();
    List<Map<?, ?>> maps = this.toMap();
    try {
      objectMapper.setVisibility(
          objectMapper
              .getSerializationConfig()
              .getDefaultVisibilityChecker()
              .withIsGetterVisibility(JsonAutoDetect.Visibility.NONE));
      return objectMapper.writeValueAsString(maps.isEmpty() ? this.elements : maps);
    } catch (JsonProcessingException e) {
      return "[]";
    }
  }

  /**
   * Converts the collection to a list of maps.
   * @return a list of maps representing the collection
   */
  public List<Map<?, ?>> toMap() {
    List<Map<?, ?>> maps = new ArrayList<>();
    for (Object element : elements) {
      if (element instanceof ApiData) {
        Map<?, ?> map = ((ApiData) element).toMap();
        Cast.clearEmpties(map);
        maps.add(map);
      }
    }
    return maps;
  }

  /**
   * Applies the specified function to each element in the collection and returns a new collection.
   * @param mapper a function to apply to each element
   * @return a new collection with the transformed elements
   */
  public TypedCollection<T> map(java.util.function.Function<? super T, ? extends T> mapper) {
    TypedCollection<T> result = new TypedCollection<>();
    for (T element : this) {
      result.add(mapper.apply(element));
    }
    return result;
  }

  /**
   * Accumulates value starting with the initial value and applying the specified function to it and each element in the collection.
   * @param identity the initial value
   * @param accumulator a function for combining two values
   * @return the result of the accumulation
   */
  public T reduce(T identity, java.util.function.BinaryOperator<T> accumulator) {
    T result = identity;
    for (T element : this) {
      result = accumulator.apply(result, element);
    }
    return result;
  }

  /**
   * Returns a new collection containing elements from the specified range of the original collection.
   * @param fromIndex low endpoint (inclusive) of the subList
   * @param toIndex high endpoint (exclusive) of the subList
   * @return a new collection containing the specified range of the original collection
   * @throws IndexOutOfBoundsException if an endpoint index value is out of range
   */
  public TypedCollection<T> slice(int fromIndex, int toIndex) {
    if (fromIndex < 0 || toIndex > elements.size() || fromIndex > toIndex) {
      throw new IndexOutOfBoundsException("Invalid slice indices");
    }
    TypedCollection<T> slicedCollection = new TypedCollection<>();
    for (int i = fromIndex; i < toIndex; i++) {
      slicedCollection.add(elements.get(i));
    }
    return slicedCollection;
  }

  /**
   * Returns a new collection containing elements of the original collection that match the given predicate.
   * @param predicate a predicate to apply to each element to determine if it should be included
   * @return a new collection containing the matched elements
   */
  public TypedCollection<T> filter(java.util.function.Predicate<? super T> predicate) {
    TypedCollection<T> filteredCollection = new TypedCollection<>();
    for (T element : this) {
      if (predicate.test(element)) {
        filteredCollection.add(element);
      }
    }
    return filteredCollection;
  }

  /**
   * Returns the number of elements in the collection.
   * @return the number of elements
   */
  @Override
  public int size() {
    return elements.size();
  }

  /**
   * Checks if the collection is empty.
   * @return true if the collection is empty, false otherwise
   */
  @Override
  public boolean isEmpty() {
    return elements.isEmpty();
  }

  /**
   * Checks if the collection contains all the elements in the specified collection.
   * @param otherCollection collection to be checked for containment in this collection
   * @return true if this collection contains all the elements in the specified collection
   */
  @Override
  public boolean containsAll(@NotNull Collection<?> otherCollection) {
    return elements.containsAll(otherCollection);
  }

  /**
   * Returns an iterator over the elements in the collection.
   * @return an iterator over the elements
   */
  @NotNull
  @Override
  public Iterator<T> iterator() {
    return elements.iterator();
  }

  /**
   * Returns an array containing all the elements in the collection; the runtime type of the returned array is that of the specified array.
   * @param a the array into which the elements of the collection are to be stored, if it is big enough; otherwise, a new array of the same runtime type is allocated for this purpose.
   * @return an array containing all the elements in the collection
   */
  @NotNull
  @Override
  public <T1> T1[] toArray(@NotNull T1[] a) {
    return elements.toArray(a);
  }

  /**
   * Adds the specified element to the collection.
   * @param value element to be added to the collection
   * @return true if the collection changed as a result of the call
   */
  @Override
  public boolean add(T value) {
    return elements.add(value);
  }

  /**
   * Removes a single instance of the specified element from the collection, if it is present.
   * @param value element to be removed from the collection, if present
   * @return true if an element was removed as a result of this call
   */
  @Override
  public boolean remove(Object value) {
    return elements.remove(value);
  }

  /**
   * Adds all the elements in the specified collection to the collection.
   * @param otherCollection collection containing elements to be added to this collection
   * @return true if this collection changed as a result of the call
   */
  @Override
  public boolean addAll(@NotNull Collection<? extends T> otherCollection) {
    return elements.addAll(otherCollection);
  }

  /**
   * Removes all the collection's elements that are also contained in the specified collection.
   * @param otherCollection collection containing elements to be removed from this collection
   * @return true if this collection changed as a result of the call
   */
  @Override
  public boolean removeAll(@NotNull Collection<?> otherCollection) {
    return elements.removeAll(otherCollection);
  }

  /**
   * Retains only the elements in the collection that are contained in the specified collection.
   * @param otherCollection collection containing elements to be retained in this collection
   * @return true if this collection changed as a result of the call
   */
  @Override
  public boolean retainAll(@NotNull Collection<?> otherCollection) {
    return elements.retainAll(otherCollection);
  }

  /**
   * Removes all the elements from the collection.
   */
  @Override
  public void clear() {
    elements.clear();
  }
}
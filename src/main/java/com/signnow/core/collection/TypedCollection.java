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

public class TypedCollection<T> implements Collection<T>, JsonSerializable {

  private final List<T> elements;

  private int currentIndex = 0;

  public TypedCollection() {
    this.elements = new ArrayList<>();
  }

  public T current() {
    if (currentIndex >= 0 && currentIndex < elements.size()) {
      return elements.get(currentIndex);
    }
    throw new IndexOutOfBoundsException("Current index is out of bounds");
  }

  public int key() {
    return currentIndex;
  }

  public void next() {
    if (currentIndex < elements.size() - 1) {
      currentIndex++;
    }
  }

  public void rewind() {
    currentIndex = 0;
  }

  public boolean contains(Object element) {
    return elements.contains(element);
  }

  public int indexOf(T element) {
    return elements.indexOf(element);
  }

  public T get(int key) {
    if (key >= 0 && key < elements.size()) {
      return elements.get(key);
    }
    throw new IndexOutOfBoundsException("Index is out of bounds.");
  }

  public void set(int key, T value) {
    if (key >= 0 && key < elements.size()) {
      elements.set(key, value);
    } else if (key == elements.size()) {
      elements.add(value);
    } else {
      throw new IndexOutOfBoundsException("Index is out of bounds.");
    }
  }

  public T first() {
    if (!elements.isEmpty()) {
      return elements.get(0);
    }
    throw new IllegalStateException("Collection is empty.");
  }

  public T last() {
    if (!elements.isEmpty()) {
      return elements.get(elements.size() - 1);
    }
    throw new IllegalStateException("Collection is empty.");
  }

  public void merge(TypedCollection<T> other) {
    if (other != null) {
      this.addAll(other);
    }
  }

  public List<Integer> keys() {
    List<Integer> keysList = new ArrayList<>();
    for (int i = 0; i < elements.size(); i++) {
      keysList.add(i);
    }
    return keysList;
  }

  public List<T> values() {
    return new ArrayList<>(elements);
  }

  @NotNull
  public Object[] toArray() {
    return elements.toArray();
  }

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

  public TypedCollection<T> map(java.util.function.Function<? super T, ? extends T> mapper) {
    TypedCollection<T> result = new TypedCollection<>();
    for (T element : this) {
      result.add(mapper.apply(element));
    }
    return result;
  }

  public T reduce(T identity, java.util.function.BinaryOperator<T> accumulator) {
    T result = identity;
    for (T element : this) {
      result = accumulator.apply(result, element);
    }
    return result;
  }

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

  public TypedCollection<T> filter(java.util.function.Predicate<? super T> predicate) {
    TypedCollection<T> filteredCollection = new TypedCollection<>();
    for (T element : this) {
      if (predicate.test(element)) {
        filteredCollection.add(element);
      }
    }
    return filteredCollection;
  }

  @Override
  public int size() {
    return elements.size();
  }

  @Override
  public boolean isEmpty() {
    return elements.isEmpty();
  }

  @Override
  public boolean containsAll(@NotNull Collection<?> otherCollection) {
    return elements.containsAll(otherCollection);
  }

  @NotNull
  @Override
  public Iterator<T> iterator() {
    return elements.iterator();
  }

  @NotNull
  @Override
  public <T1> T1[] toArray(@NotNull T1[] a) {
    return elements.toArray(a);
  }

  @Override
  public boolean add(T value) {
    return elements.add(value);
  }

  @Override
  public boolean remove(Object value) {
    return elements.remove(value);
  }

  @Override
  public boolean addAll(@NotNull Collection<? extends T> otherCollection) {
    return elements.addAll(otherCollection);
  }

  @Override
  public boolean removeAll(@NotNull Collection<?> otherCollection) {
    return elements.removeAll(otherCollection);
  }

  @Override
  public boolean retainAll(@NotNull Collection<?> otherCollection) {
    return elements.retainAll(otherCollection);
  }

  @Override
  public void clear() {
    elements.clear();
  }
}

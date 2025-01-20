/*
 * This file is a part of signNow SDK API client.
 *
 * (с) Copyright © 2011-present airSlate Inc. (https://www.signnow.com)
 *
 * For more details on copyright, see LICENSE.md file
 * that was distributed with this source code.
 */

package com.signnow.api.document.response.data;

import com.signnow.core.collection.TypedCollection;

/**
 * This class extends the TypedCollection class.
 * It is used to create a collection of a specific type.
 * The type of the collection is determined by the type of the objects that are added to it.
 */
public class InsertCollection extends TypedCollection {

    /**
     * Default constructor for the InsertCollection class.
     * It initializes an empty collection.
     */
    public InsertCollection() {
        super();
    }

    /**
     * This method is used to add an object to the collection.
     * The type of the object should match the type of the collection.
     *
     * @param item The object to be added to the collection.
     * @return true if the object was added successfully, false otherwise.
     */
    public boolean add(Object item) {
        return super.add(item);
    }

    /**
     * This method is used to remove an object from the collection.
     * The object to be removed should be present in the collection.
     *
     * @param item The object to be removed from the collection.
     * @return true if the object was removed successfully, false otherwise.
     */
    public boolean remove(Object item) {
        return super.remove(item);
    }

    /**
     * This method is used to check if an object is present in the collection.
     *
     * @param item The object to be checked.
     * @return true if the object is present in the collection, false otherwise.
     */
    public boolean contains(Object item) {
        return super.contains(item);
    }

    /**
     * This method is used to get the size of the collection.
     *
     * @return The size of the collection.
     */
    public int size() {
        return super.size();
    }

    /**
     * This method is used to check if the collection is empty.
     *
     * @return true if the collection is empty, false otherwise.
     */
    public boolean isEmpty() {
        return super.isEmpty();
    }
}
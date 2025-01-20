/*
 * This file is a part of signNow SDK API client.
 *
 * (с) Copyright © 2011-present airSlate Inc. (https://www.signnow.com)
 *
 * For more details on copyright, see LICENSE.md file
 * that was distributed with this source code.
 */

package com.signnow.api.documentgroupinvite.request.data.emailgroup;

import com.signnow.core.collection.TypedCollection;

/**
 * This class represents a collection of Email objects.
 * It extends the TypedCollection class, specifying Email as the type parameter.
 * This means that this collection will only accept Email objects.
 */
public class EmailCollection extends TypedCollection<Email> {

    /**
     * Default constructor for the EmailCollection class.
     * It calls the super constructor of the TypedCollection class.
     */
    public EmailCollection() {
        super();
    }

    /**
     * This method is used to add an Email object to the collection.
     * It overrides the add method of the TypedCollection class.
     *
     * @param email The Email object to be added to the collection.
     * @return boolean Returns true if the Email object was added successfully, false otherwise.
     */
    @Override
    public boolean add(Email email) {
        return super.add(email);
    }

    /**
     * This method is used to remove an Email object from the collection.
     * It overrides the remove method of the TypedCollection class.
     *
     * @param email The Email object to be removed from the collection.
     * @return boolean Returns true if the Email object was removed successfully, false otherwise.
     */
    @Override
    public boolean remove(Object email) {
        return super.remove(email);
    }

    /**
     * This method is used to get the size of the collection.
     * It overrides the size method of the TypedCollection class.
     *
     * @return int Returns the number of Email objects in the collection.
     */
    @Override
    public int size() {
        return super.size();
    }
}
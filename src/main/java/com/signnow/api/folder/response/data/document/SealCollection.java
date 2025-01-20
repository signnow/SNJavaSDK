/*
 * This file is a part of signNow SDK API client.
 *
 * (с) Copyright © 2011-present airSlate Inc. (https://www.signnow.com)
 *
 * For more details on copyright, see LICENSE.md file
 * that was distributed with this source code.
 */

package com.signnow.api.folder.response.data.document;

import com.signnow.core.collection.TypedCollection;

/**
 * This class represents a collection of Seal objects.
 * It extends the TypedCollection class, specifying Seal as the type parameter.
 * This means that this collection will only accept Seal objects.
 * 
 * @see com.signnow.core.collection.TypedCollection
 */
public class SealCollection extends TypedCollection<Seal> {
    /**
     * Default constructor {@code SealCollection}.
     */
    public SealCollection() {
        super();
    }
}
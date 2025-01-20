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
 * This class represents a collection of Tag objects.
 * It extends the TypedCollection class with a type parameter of Tag.
 * 
 * @see com.signnow.core.collection.TypedCollection
 */
public class TagCollection extends TypedCollection<Tag> {
    /**
     * Constructs an empty {@code TagCollection}.
     */
    public TagCollection() {
        super();
    }
}
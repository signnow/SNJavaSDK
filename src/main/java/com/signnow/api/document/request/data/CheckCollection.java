/*
 * This file is a part of signNow SDK API client.
 *
 * (с) Copyright © 2011-present airSlate Inc. (https://www.signnow.com)
 *
 * For more details on copyright, see LICENSE.md file
 * that was distributed with this source code.
 */

package com.signnow.api.document.request.data;

import com.signnow.core.collection.TypedCollection;

/**
 * This class extends the TypedCollection class with a type parameter of Check.
 * It represents a collection of Check objects.
 */
public class CheckCollection extends TypedCollection<Check> {
    /**
     * Constructs an empty {@code CheckCollection}.
     */
    public CheckCollection() {
        super();
    }
}

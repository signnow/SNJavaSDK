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
 * This class extends the TypedCollection class with DeactivateElement as its type.
 * It represents a collection of DeactivateElement objects.
 * 
 * @see com.signnow.core.collection.TypedCollection
 * @see com.signnow.api.document.request.data.DeactivateElement
 */
public class DeactivateElementCollection extends TypedCollection<DeactivateElement> {
    /**
     * Constructs an empty {@code DeactivateElementCollection}.
     */
    public DeactivateElementCollection() {
        super();
    }
}
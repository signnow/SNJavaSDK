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
 * This class represents a collection of Text objects.
 * It extends the TypedCollection class with Text as its type parameter.
 */
public class TextCollection extends TypedCollection<Text> {
    /**
     * Constructs an empty {@code TextCollection}.
     */
    public TextCollection() {
        super();
    }
}

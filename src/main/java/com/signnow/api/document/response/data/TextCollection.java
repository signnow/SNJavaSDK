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
 * This class represents a collection of text data.
 * It extends the TypedCollection class with a type parameter of String.
 */
public class TextCollection extends TypedCollection<Text> {

    /**
     * Default constructor for TextCollection class.
     * It initializes a new instance of the TextCollection class.
     */
    public TextCollection() {
        super();
    }
}

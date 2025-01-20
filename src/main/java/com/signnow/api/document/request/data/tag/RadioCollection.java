/*
 * This file is a part of signNow SDK API client.
 *
 * (с) Copyright © 2011-present airSlate Inc. (https://www.signnow.com)
 *
 * For more details on copyright, see LICENSE.md file
 * that was distributed with this source code.
 */

package com.signnow.api.document.request.data.tag;

import com.signnow.api.document.request.data.radiobutton.Radiobutton;
import com.signnow.core.collection.TypedCollection;

/**
 * This class represents a collection of Radiobutton objects.
 * It extends the TypedCollection class with Radiobutton as its type parameter.
 * 
 * @see Radiobutton
 * @see TypedCollection
 */
public class RadioCollection extends TypedCollection<Radiobutton> {
    /**
     * Constructs an empty {@code RadioCollection}.
     */
    public RadioCollection() {
        super();
    }
}
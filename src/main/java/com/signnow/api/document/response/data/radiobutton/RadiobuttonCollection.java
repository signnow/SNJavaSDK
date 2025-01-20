/*
 * This file is a part of signNow SDK API client.
 *
 * (с) Copyright © 2011-present airSlate Inc. (https://www.signnow.com)
 *
 * For more details on copyright, see LICENSE.md file
 * that was distributed with this source code.
 */

package com.signnow.api.document.response.data.radiobutton;

import com.signnow.core.collection.TypedCollection;

/**
 * This class represents a collection of Radiobutton objects.
 * It extends the TypedCollection class, specifying Radiobutton as the type parameter.
 * This means that this collection will only accept Radiobutton objects.
 */
public class RadiobuttonCollection extends TypedCollection<Radiobutton> {
    /**
     * Constructs an empty {@code RadiobuttonCollection}.
     */
    public RadiobuttonCollection() {
        super();
    }
}
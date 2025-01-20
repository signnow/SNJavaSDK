/*
 * This file is a part of signNow SDK API client.
 *
 * (с) Copyright © 2011-present airSlate Inc. (https://www.signnow.com)
 *
 * For more details on copyright, see LICENSE.md file
 * that was distributed with this source code.
 */

package com.signnow.api.documentfield.request.data;

import com.signnow.core.collection.TypedCollection;

/**
 * This class represents a collection of Field objects.
 * It extends the TypedCollection class with a type parameter of Field.
 */
public class FieldCollection extends TypedCollection<Field> {
    /**
     * Default constructor {@code FieldCollection}.
     */
    public FieldCollection() {
        super();
    }
}

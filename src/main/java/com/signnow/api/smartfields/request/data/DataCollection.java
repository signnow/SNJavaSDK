/*
 * This file is a part of signNow SDK API client.
 *
 * (с) Copyright © 2011-present airSlate Inc. (https://www.signnow.com)
 *
 * For more details on copyright, see LICENSE.md file
 * that was distributed with this source code.
 */

package com.signnow.api.smartfields.request.data;

import com.signnow.core.collection.TypedCollection;

/**
 * This class represents a collection of Data objects.
 * It extends the TypedCollection class, which provides methods for managing collections of a specific type.
 * In this case, the specific type is Data.
 */
public class DataCollection extends TypedCollection<Data> {
    /**
     * Default constructor {@code DataCollection}.
     */
    public DataCollection() {
        super();
    }
}

/*
 * This file is a part of signNow SDK API client.
 *
 * (с) Copyright © 2011-present airSlate Inc. (https://www.signnow.com)
 *
 * For more details on copyright, see LICENSE.md file
 * that was distributed with this source code.
 */

package com.signnow.api.document.response.data.line;

import com.signnow.core.collection.TypedCollection;

/**
 * This class represents a collection of Line objects.
 * It extends the TypedCollection class by specifying Line as the type parameter.
 */
public class LineCollection extends TypedCollection<Line> {
    /**
     * Constructs an empty {@code LineCollection}.
     */
    public LineCollection() {
        super();
    }
}

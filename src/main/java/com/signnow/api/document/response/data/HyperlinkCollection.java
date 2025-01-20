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
 * This class represents a collection of Hyperlink objects.
 * It extends the TypedCollection class by specifying the type of objects it can contain.
 *
 * @see com.signnow.core.collection.TypedCollection
 */
public class HyperlinkCollection extends TypedCollection<Hyperlink> {
    /**
     * Default constructor for HyperlinkCollection class.
     * It initializes an empty collection of Hyperlink objects.
     */
    public HyperlinkCollection() {
        super();
    }
}

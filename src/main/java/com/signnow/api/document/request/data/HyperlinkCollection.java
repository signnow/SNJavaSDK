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
 * This class represents a collection of Hyperlink objects.
 * It extends the TypedCollection class by specifying the type of the collection as Hyperlink.
 */
public class HyperlinkCollection extends TypedCollection<Hyperlink> {
    /**
     * Constructs an empty {@code HyperlinkCollection}.
     */
    public HyperlinkCollection() {
        super();
    }
}

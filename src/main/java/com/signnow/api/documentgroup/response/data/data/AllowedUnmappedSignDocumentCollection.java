/*
 * This file is a part of signNow SDK API client.
 *
 * (с) Copyright © 2011-present airSlate Inc. (https://www.signnow.com)
 *
 * For more details on copyright, see LICENSE.md file
 * that was distributed with this source code.
 */

package com.signnow.api.documentgroup.response.data.data;

import com.signnow.core.collection.TypedCollection;

/**
 * This class represents a collection of AllowedUnmappedSignDocument objects.
 * It extends the TypedCollection class, which provides methods for managing collections of a specific type.
 */
public class AllowedUnmappedSignDocumentCollection
    extends TypedCollection<AllowedUnmappedSignDocument> {
    /**
     * Constructs an empty {@code AllowedUnmappedSignDocumentCollection}.
     */
    public AllowedUnmappedSignDocumentCollection() {
        super();
    }
}
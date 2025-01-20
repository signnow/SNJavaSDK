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
 * This class represents a collection of documents that are not mapped to any specific type.
 * It extends the TypedCollection class.
 */
public class UnmappedDocumentCollection extends TypedCollection {

    /**
     * Default constructor for the UnmappedDocumentCollection class.
     * It initializes an empty collection of unmapped documents.
     */
    public UnmappedDocumentCollection() {
        super();
    }
}
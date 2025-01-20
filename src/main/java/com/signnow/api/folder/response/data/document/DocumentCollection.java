/*
 * This file is a part of signNow SDK API client.
 *
 * (с) Copyright © 2011-present airSlate Inc. (https://www.signnow.com)
 *
 * For more details on copyright, see LICENSE.md file
 * that was distributed with this source code.
 */

package com.signnow.api.folder.response.data.document;

import com.signnow.core.collection.TypedCollection;

/**
 * This class represents a collection of Document objects.
 * It extends the TypedCollection class, specifying Document as the type parameter.
 * This means that this collection will only accept Document objects.
 */
public class DocumentCollection extends TypedCollection<Document> {
    /**
     * Default constructor {@code DocumentCollection}.
     */
    public DocumentCollection() {
        super();
    }
}
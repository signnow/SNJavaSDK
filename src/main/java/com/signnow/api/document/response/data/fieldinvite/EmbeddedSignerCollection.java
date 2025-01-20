/*
 * This file is a part of signNow SDK API client.
 *
 * (с) Copyright © 2011-present airSlate Inc. (https://www.signnow.com)
 *
 * For more details on copyright, see LICENSE.md file
 * that was distributed with this source code.
 */

package com.signnow.api.document.response.data.fieldinvite;

import com.signnow.core.collection.TypedCollection;

/**
 * This class represents a collection of EmbeddedSigner objects.
 * It extends the TypedCollection class, specifying EmbeddedSigner as the type parameter.
 * This means that this collection will only accept EmbeddedSigner objects.
 *
 * @see com.signnow.core.collection.TypedCollection
 * @see com.signnow.api.document.response.data.fieldinvite.EmbeddedSigner
 */
public class EmbeddedSignerCollection extends TypedCollection<EmbeddedSigner> {
    /**
     * Constructs an empty {@code EmbeddedSignerCollection}.
     */
    public EmbeddedSignerCollection() {
        super();
    }
}
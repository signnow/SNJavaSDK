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
 * This class represents a collection of Signature objects.
 * It extends the TypedCollection class, specifying Signature as the type parameter.
 * This means that this collection will only accept Signature objects.
 */
public class SignatureCollection extends TypedCollection<Signature> {
    /**
     * Default constructor {@code SignatureCollection}.
     */
    public SignatureCollection() {
        super();
    }
}

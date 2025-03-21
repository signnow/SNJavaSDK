/*
 * This file is a part of signNow SDK API client.
 *
 * (с) Copyright © 2011-present airSlate Inc. (https://www.signnow.com)
 *
 * For more details on copyright, see LICENSE.md file
 * that was distributed with this source code.
 */

package com.signnow.api.user.response.data;

import com.signnow.core.collection.TypedCollection;

/**
 * This class represents a collection of active logos.
 * It extends the TypedCollection class with Logo as its type.
 */
public class ActiveLogoCollection extends TypedCollection<Logo> {
    /**
     * Constructs an empty {@code ActiveLogoCollection}.
     */
    public ActiveLogoCollection() {
        super();
    }
}

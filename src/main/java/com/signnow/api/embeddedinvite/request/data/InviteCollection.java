/*
 * This file is a part of signNow SDK API client.
 *
 * (с) Copyright © 2011-present airSlate Inc. (https://www.signnow.com)
 *
 * For more details on copyright, see LICENSE.md file
 * that was distributed with this source code.
 */

package com.signnow.api.embeddedinvite.request.data;

import com.signnow.core.collection.TypedCollection;

/**
 * This class represents a collection of Invite objects.
 * It extends the TypedCollection class, specifying Invite as the type parameter.
 */
public class InviteCollection extends TypedCollection<Invite> {
    /**
     * Default constructor {@code InviteCollection}.
     */
    public InviteCollection() {
        super();
    }
}

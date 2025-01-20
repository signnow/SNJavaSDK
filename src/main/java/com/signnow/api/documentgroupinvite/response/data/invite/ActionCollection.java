/*
 * This file is a part of signNow SDK API client.
 *
 * (с) Copyright © 2011-present airSlate Inc. (https://www.signnow.com)
 *
 * For more details on copyright, see LICENSE.md file
 * that was distributed with this source code.
 */

package com.signnow.api.documentgroupinvite.response.data.invite;

import com.signnow.core.collection.TypedCollection;

/**
 * This class represents a collection of Action objects.
 * It extends the TypedCollection class, specifying Action as the type parameter.
 * This means that this collection will only accept Action objects.
 */
public class ActionCollection extends TypedCollection<Action> {
    /**
     * Constructs an empty {@code ActionCollection}.
     */
    public ActionCollection() {
        super();
    }
}
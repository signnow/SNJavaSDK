/*
 * This file is a part of signNow SDK API client.
 *
 * (с) Copyright © 2011-present airSlate Inc. (https://www.signnow.com)
 *
 * For more details on copyright, see LICENSE.md file
 * that was distributed with this source code.
 */

package com.signnow.api.template.request.data.routingdetail;

import com.signnow.core.collection.TypedCollection;

/**
 * This class represents a collection of InviteAction objects.
 * It extends the TypedCollection class, specifying InviteAction as the type parameter.
 * This means that this collection will only accept InviteAction objects.
 * 
 * @see com.signnow.core.collection.TypedCollection
 * @see com.signnow.api.template.request.data.routingdetail.InviteAction
 */
public class InviteActionCollection extends TypedCollection<InviteAction> {

    /**
     * Default constructor for InviteActionCollection.
     * It calls the constructor of the superclass TypedCollection.
     */
    public InviteActionCollection() {
        super();
    }
}
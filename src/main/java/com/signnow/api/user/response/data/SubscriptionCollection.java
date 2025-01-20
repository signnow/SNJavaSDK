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
 * This class represents a collection of Subscription objects.
 * It extends the TypedCollection class, specifying Subscription as the type parameter.
 * This means that this collection will only accept Subscription objects.
 */
public class SubscriptionCollection extends TypedCollection<Subscription> {

    /**
     * Default constructor for the SubscriptionCollection class.
     * It calls the constructor of the superclass TypedCollection.
     */
    public SubscriptionCollection() {
        super();
    }
}
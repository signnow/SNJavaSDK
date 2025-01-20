/*
 * This file is a part of signNow SDK API client.
 *
 * (с) Copyright © 2011-present airSlate Inc. (https://www.signnow.com)
 *
 * For more details on copyright, see LICENSE.md file
 */

package com.signnow.api.webhookv2.response.data;

import com.signnow.core.collection.TypedCollection;

/**
 * This class represents a collection of EventSubscriptionData objects.
 * It extends the TypedCollection class from the signNow SDK API client.
 */
public class EventSubscriptionDataCollection extends TypedCollection<EventSubscriptionData> {
    /**
     * Default constructor {@code EventSubscriptionDataCollection}.
     */
    public EventSubscriptionDataCollection() {
        super();
    }
}

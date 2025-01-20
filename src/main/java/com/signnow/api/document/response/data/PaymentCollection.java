/*
 * This file is a part of signNow SDK API client.
 *
 * (с) Copyright © 2011-present airSlate Inc. (https://www.signnow.com)
 *
 * For more details on copyright, see LICENSE.md file
 * that was distributed with this source code.
 */

package com.signnow.api.document.response.data;

import com.signnow.core.collection.TypedCollection;

/**
 * This class represents a collection of Payment objects.
 * It extends the TypedCollection class, specifying Payment as the type parameter.
 * This means that this collection will only accept Payment objects.
 * 
 * @see com.signnow.core.collection.TypedCollection
 * @see com.signnow.api.document.response.data.Payment
 */
public class PaymentCollection extends TypedCollection<Payment> {
    /**
     * Constructs an empty {@code PaymentCollection}.
     */
    public PaymentCollection() {
        super();
    }
}
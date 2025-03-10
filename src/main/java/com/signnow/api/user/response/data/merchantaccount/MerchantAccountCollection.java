/*
 * This file is a part of signNow SDK API client.
 *
 * (с) Copyright © 2011-present airSlate Inc. (https://www.signnow.com)
 *
 * For more details on copyright, see LICENSE.md file
 * that was distributed with this source code.
 */

package com.signnow.api.user.response.data.merchantaccount;

import com.signnow.core.collection.TypedCollection;

/**
 * This class represents a collection of MerchantAccount objects.
 * It extends the TypedCollection class by specifying the type of objects it can contain.
 *
 * @see com.signnow.core.collection.TypedCollection
 */
public class MerchantAccountCollection extends TypedCollection<MerchantAccount> {
    /**
     * Default constructor {@code MerchantAccountCollection}.
     */
    public MerchantAccountCollection() {
        super();
    }
}

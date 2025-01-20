/*
 * This file is a part of signNow SDK API client.
 *
 * (с) Copyright © 2011-present airSlate Inc. (https://www.signnow.com)
 *
 * For more details on copyright, see LICENSE.md file
 * that was distributed with this source code.
 */

package com.signnow.api.document.request.data;

import com.signnow.core.collection.TypedCollection;

/**
 * This class represents a collection of IntegrationObject instances.
 * It extends the TypedCollection class, specifying IntegrationObject as the type parameter.
 */
public class IntegrationObjectCollection extends TypedCollection<IntegrationObject> {
    /**
     * Constructs an empty {@code IntegrationObjectCollection}.
     */
    public IntegrationObjectCollection() {
        super();
    }
}

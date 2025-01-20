/*
 * This file is a part of signNow SDK API client.
 *
 * (с) Copyright © 2011-present airSlate Inc. (https://www.signnow.com)
 *
 * For more details on copyright, see LICENSE.md file
 * that was distributed with this source code.
 */

package com.signnow.api.document.response.data.routingdetail;

import com.signnow.core.collection.TypedCollection;

/**
 * This class represents a collection of RoutingDetail objects.
 * It extends the TypedCollection class, specifying RoutingDetail as the type parameter.
 * This means that this collection will only accept RoutingDetail objects.
 * 
 * @see com.signnow.core.collection.TypedCollection
 * @see com.signnow.api.document.response.data.routingdetail.RoutingDetail
 */
public class RoutingDetailCollection extends TypedCollection<RoutingDetail> {

    /**
     * Default constructor for the RoutingDetailCollection class.
     * It calls the constructor of the superclass TypedCollection, passing no arguments.
     * This creates an empty collection of RoutingDetail objects.
     */
    public RoutingDetailCollection() {
        super();
    }
}
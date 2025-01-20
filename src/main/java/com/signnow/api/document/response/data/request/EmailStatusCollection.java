/*
 * This file is a part of signNow SDK API client.
 *
 * (с) Copyright © 2011-present airSlate Inc. (https://www.signnow.com)
 *
 * For more details on copyright, see LICENSE.md file
 * that was distributed with this source code.
 */

package com.signnow.api.document.response.data.request;

import com.signnow.core.collection.TypedCollection;

/**
 * This class represents a collection of EmailStatus objects.
 * It extends the TypedCollection class, specifying EmailStatus as the type parameter.
 * This means that this collection will only accept EmailStatus objects.
 */
public class EmailStatusCollection extends TypedCollection<EmailStatus> {

    /**
     * Default constructor for the EmailStatusCollection class.
     * It calls the constructor of the superclass TypedCollection.
     */
    public EmailStatusCollection() {
        super();
    }
}
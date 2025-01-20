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
 * This class represents a collection of Attachment objects.
 * It extends the TypedCollection class by specifying the type of the collection as Attachment.
 */
public class AttachmentCollection extends TypedCollection<Attachment> {
    /**
     * Constructs an empty {@code AttachmentCollection}.
     */
    public AttachmentCollection() {
        super();
    }
}

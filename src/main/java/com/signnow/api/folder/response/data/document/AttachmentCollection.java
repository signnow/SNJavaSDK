/*
 * This file is a part of signNow SDK API client.
 *
 * (с) Copyright © 2011-present airSlate Inc. (https://www.signnow.com)
 *
 * For more details on copyright, see LICENSE.md file
 * that was distributed with this source code.
 */

package com.signnow.api.folder.response.data.document;

import com.signnow.core.collection.TypedCollection;

/**
 * This class represents a collection of Attachment objects.
 * It extends the TypedCollection class, specifying Attachment as the type parameter.
 */
public class AttachmentCollection extends TypedCollection<Attachment> {
    /**
     * Default constructor {@code AttachmentCollection}.
     */
    public AttachmentCollection() {
        super();
    }
}

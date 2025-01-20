/*
 * This file is a part of signNow SDK API client.
 *
 * (с) Copyright © 2011-present airSlate Inc. (https://www.signnow.com)
 *
 * For more details on copyright, see LICENSE.md file
 * that was distributed with this source code.
 */

package com.signnow.api.template.request.data;

import com.signnow.core.collection.TypedCollection;

/**
 * This class extends the TypedCollection class with TemplateDataObjectPut as its type.
 * It represents a collection of TemplateDataObjectPut objects.
 * 
 * @see com.signnow.core.collection.TypedCollection
 * @see com.signnow.api.template.request.data.TemplateDataObjectPut
 */
public class TemplateDataObjectPutCollection extends TypedCollection<TemplateDataObjectPut> {
    /**
     * Default constructor {@code TemplateDataObjectPutCollection}.
     */
    public TemplateDataObjectPutCollection() {
        super();
    }
}
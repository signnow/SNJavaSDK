/*
 * This file is a part of signNow SDK API client.
 *
 * (с) Copyright © 2011-present airSlate Inc. (https://www.signnow.com)
 *
 * For more details on copyright, see LICENSE.md file
 * that was distributed with this source code.
 */

package com.signnow.api.template.response.data;

import com.signnow.core.collection.TypedCollection;

/**
 * This class represents a collection of ViewerPost objects.
 * It extends the TypedCollection class, specifying ViewerPost as the type parameter.
 */
public class ViewerPostCollection extends TypedCollection<ViewerPost> {
    /**
     * Default constructor {@code ViewerPostCollection}.
     */
    public ViewerPostCollection() {
        super();
    }
}

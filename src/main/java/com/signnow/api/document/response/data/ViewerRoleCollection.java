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
 * This class represents a collection of ViewerRole objects.
 * It extends the TypedCollection class, specifying ViewerRole as the type parameter.
 */
public class ViewerRoleCollection extends TypedCollection<ViewerRole> {
    /**
     * Constructs an empty {@code ViewerRoleCollection}.
     */
    public ViewerRoleCollection() {
        super();
    }
}

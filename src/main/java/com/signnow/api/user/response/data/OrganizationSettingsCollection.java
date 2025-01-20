/*
 * This file is a part of signNow SDK API client.
 *
 * (с) Copyright © 2011-present airSlate Inc. (https://www.signnow.com)
 *
 * For more details on copyright, see LICENSE.md file
 * that was distributed with this source code.
 */

package com.signnow.api.user.response.data;

import com.signnow.core.collection.TypedCollection;

/**
 * This class represents a collection of OrganizationSettings objects.
 * It extends the TypedCollection class, specifying OrganizationSettings as the type parameter.
 * This means that this collection will only accept OrganizationSettings objects.
 * 
 * @see com.signnow.core.collection.TypedCollection
 * @see com.signnow.api.user.response.data.OrganizationSettings
 */
public class OrganizationSettingsCollection extends TypedCollection<OrganizationSettings> {
    /**
     * Default constructor {@code OrganizationSettingsCollection}.
     */
    public OrganizationSettingsCollection() {
        super();
    }
}
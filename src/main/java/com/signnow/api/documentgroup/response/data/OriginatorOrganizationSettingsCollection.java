/*
 * This file is a part of signNow SDK API client.
 *
 * (с) Copyright © 2011-present airSlate Inc. (https://www.signnow.com)
 *
 * For more details on copyright, see LICENSE.md file
 * that was distributed with this source code.
 */

package com.signnow.api.documentgroup.response.data;

import com.signnow.core.collection.TypedCollection;

/**
 * This class represents a collection of OriginatorOrganizationSettings.
 * It extends the TypedCollection class by specifying the type of the collection as OriginatorOrganizationSettings.
 * 
 * @see com.signnow.core.collection.TypedCollection
 * @see com.signnow.api.documentgroup.response.data.OriginatorOrganizationSettings
 */
public class OriginatorOrganizationSettingsCollection
    extends TypedCollection<OriginatorOrganizationSettings> {
    /**
     * Default constructor {@code OriginatorOrganizationSettingsCollection}.
     */
    public OriginatorOrganizationSettingsCollection() {
        super();
    }
}
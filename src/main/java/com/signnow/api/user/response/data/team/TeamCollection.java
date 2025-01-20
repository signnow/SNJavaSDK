/*
 * This file is a part of signNow SDK API client.
 *
 * (с) Copyright © 2011-present airSlate Inc. (https://www.signnow.com)
 *
 * For more details on copyright, see LICENSE.md file
 * that was distributed with this source code.
 */

package com.signnow.api.user.response.data.team;

import com.signnow.core.collection.TypedCollection;

/**
 * This class represents a collection of Team objects.
 * It extends the TypedCollection class by specifying the type of the collection as Team.
 * 
 * @see com.signnow.core.collection.TypedCollection
 * @see com.signnow.api.user.response.data.team.Team
 */
public class TeamCollection extends TypedCollection<Team> {
    /**
     * Default constructor {@code TeamCollection}.
     */
    public TeamCollection() {
        super();
    }
}
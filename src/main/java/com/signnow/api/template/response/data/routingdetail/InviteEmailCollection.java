/*
 * This file is a part of signNow SDK API client.
 *
 * (с) Copyright © 2011-present airSlate Inc. (https://www.signnow.com)
 *
 * For more details on copyright, see LICENSE.md file
 * that was distributed with this source code.
 */

package com.signnow.api.template.response.data.routingdetail;

import com.signnow.core.collection.TypedCollection;

/**
 * A collection of InviteEmail objects. Extends the TypedCollection class to provide type safety for
 * InviteEmail objects.
 */
public class InviteEmailCollection extends TypedCollection<InviteEmail> {

  /** Constructs an InviteEmailCollection. */
  public InviteEmailCollection() {
    super();
  }
}

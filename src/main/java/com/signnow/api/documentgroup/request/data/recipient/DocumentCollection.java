/*
 * This file is a part of signNow SDK API client.
 *
 * (с) Copyright © 2011-present airSlate Inc. (https://www.signnow.com)
 *
 * For more details on copyright, see LICENSE.md file
 * that was distributed with this source code.
 */

package com.signnow.api.documentgroup.request.data.recipient;

import com.signnow.core.collection.TypedCollection;

/**
 * Represents a collection of Document objects.
 *
 * <p>This class extends the TypedCollection class to provide a collection specifically for Document
 * objects. It ensures that only Document instances are added to the collection.
 *
 * @see com.signnow.core.collection.TypedCollection
 */
public class DocumentCollection extends TypedCollection<Document> {}

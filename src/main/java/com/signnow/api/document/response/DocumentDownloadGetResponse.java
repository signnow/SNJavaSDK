/*
 * This file is a part of signNow SDK API client.
 *
 * (с) Copyright © 2011-present airSlate Inc. (https://www.signnow.com)
 *
 * For more details on copyright, see LICENSE.md file
 * that was distributed with this source code.
 */

package com.signnow.api.document.response;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * This class represents the response received after a document download request.
 * It is annotated with JsonIgnoreProperties to ignore any unknown properties when deserializing JSON.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class DocumentDownloadGetResponse {
    // No public properties, constructors, or methods to comment on.
}
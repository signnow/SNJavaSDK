/*
 * This file is a part of signNow SDK API client.
 *
 * (с) Copyright © 2011-present airSlate Inc. (https://www.signnow.com)
 *
 * For more details on copyright, see LICENSE.md file
 * that was distributed with this source code.
 */

package com.signnow.api.template.response;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * This class represents the response received after updating a group template.
 * It is annotated with JsonIgnoreProperties to ignore any unknown properties when deserializing JSON to this type.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class GroupTemplatePutResponse {
    // No public properties, constructors, or methods to document
}
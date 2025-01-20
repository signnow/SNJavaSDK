/*
 * This file is a part of signNow SDK API client.
 *
 * (с) Copyright © 2011-present airSlate Inc. (https://www.signnow.com)
 *
 * For more details on copyright, see LICENSE.md file
 * that was distributed with this source code.
 */

package com.signnow.api.webhook.response;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * This class represents the response from a subscription post request.
 * It is annotated to ignore unknown properties when parsing JSON.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class SubscriptionPostResponse {
    // No public properties, constructors, or methods to document
}
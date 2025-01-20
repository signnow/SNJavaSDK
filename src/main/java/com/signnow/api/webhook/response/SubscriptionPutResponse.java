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
 * This class represents the response received after updating a subscription.
 * It is annotated with JsonIgnoreProperties to ignore any unknown properties
 * when deserializing a JSON to this class type.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class SubscriptionPutResponse {
    // No public properties, constructors, or methods to comment on.
}
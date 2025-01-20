/*
 * This file is a part of signNow SDK API client.
 *
 * (с) Copyright © 2011-present airSlate Inc. (https://www.signnow.com)
 *
 * For more details on copyright, see LICENSE.md file
 * that was distributed with this source code.
 */

package com.signnow.api.webhookv2.response;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * This class represents the response received after deleting an event subscription.
 * It is annotated with JsonIgnoreProperties to ignore any unknown properties when deserializing JSON to Java object.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class EventSubscriptionDeleteResponse {
    /**
     * Default constructor for EventSubscriptionDeleteResponse class.
     * It is used to create an instance of this class without setting any of its properties.
     */
    public EventSubscriptionDeleteResponse() {}
}
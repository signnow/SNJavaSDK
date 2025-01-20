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
 * This class represents the response received after updating an event subscription.
 * It is annotated with JsonIgnoreProperties to ignore any unknown properties when deserializing JSON to Java object.
 * Currently, this class does not have any properties, constructors, or methods.
 * Future updates may include properties, constructors, and methods as per requirements.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class EventSubscriptionPutResponse {}
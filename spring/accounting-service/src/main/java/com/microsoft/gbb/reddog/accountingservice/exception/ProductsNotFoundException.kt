package com.microsoft.gbb.reddog.accountingservice.exception

import org.springframework.http.HttpStatus
import org.springframework.web.server.ResponseStatusException

/**
 * The type Order not found exception.
 */
class ProductsNotFoundException
/**
 * Instantiates a new Order not found exception.
 *
 * @param message the message
 */
(message: String?) : ResponseStatusException(HttpStatus.BAD_REQUEST, message)
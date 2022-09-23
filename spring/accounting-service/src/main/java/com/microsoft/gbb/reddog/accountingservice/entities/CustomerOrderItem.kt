package com.microsoft.gbb.reddog.accountingservice.entities

import com.fasterxml.jackson.annotation.JsonProperty

/**
 * The type Customer order item.
 */
class CustomerOrderItem {
    /**
     * Gets quantity.
     *
     * @return the quantity
     */
    /**
     * Sets quantity.
     *
     * @param quantity the quantity
     */
    @JsonProperty("quantity")
    var quantity = 0
    /**
     * Gets product id.
     *
     * @return the product id
     */
    /**
     * Sets product id.
     *
     * @param productId the product id
     */
    @JsonProperty("productId")
    var productId = 0
}
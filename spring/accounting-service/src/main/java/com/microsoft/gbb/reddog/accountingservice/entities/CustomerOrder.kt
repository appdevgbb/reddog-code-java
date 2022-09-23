package com.microsoft.gbb.reddog.accountingservice.entities

import com.fasterxml.jackson.annotation.JsonProperty

/**
 * The type Customer order.
 */
class CustomerOrder {
    /**
     * Gets loyalty id.
     *
     * @return the loyalty id
     */
    /**
     * Sets loyalty id.
     *
     * @param loyaltyId the loyalty id
     */
    @JsonProperty("loyaltyId")
    var loyaltyId: String? = null
    /**
     * Gets first name.
     *
     * @return the first name
     */
    /**
     * Sets first name.
     *
     * @param firstName the first name
     */
    @JsonProperty("firstName")
    var firstName: String? = null
    /**
     * Gets last name.
     *
     * @return the last name
     */
    /**
     * Sets last name.
     *
     * @param lastName the last name
     */
    @JsonProperty("lastName")
    var lastName: String? = null
    /**
     * Gets order items.
     *
     * @return the order items
     */
    /**
     * Sets order items.
     *
     * @param orderItems the order items
     */
    @JsonProperty("OrderItems")
    var orderItems: List<CustomerOrderItem>? = null
    /**
     * Gets store id.
     *
     * @return the store id
     */
    /**
     * Sets store id.
     *
     * @param storeId the store id
     */
    @JsonProperty("storeId")
    var storeId: String? = null
}
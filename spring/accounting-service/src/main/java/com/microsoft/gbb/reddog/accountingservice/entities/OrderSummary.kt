package com.microsoft.gbb.reddog.accountingservice.entities

import com.fasterxml.jackson.annotation.JsonProperty
import lombok.Builder
import lombok.Getter
import lombok.Setter
import java.util.*

/**
 * The type Order summary.
 */
@Builder
@Getter
@Setter
class OrderSummary {
    @JsonProperty("orderCompletedDate")
    private val orderCompletedDate: String? = null

    @JsonProperty("loyaltyId")
    private val loyaltyId: String? = null

    @JsonProperty("firstName")
    private val firstName: String? = null

    @JsonProperty("lastName")
    private val lastName: String? = null

    @JsonProperty("orderId")
    private val orderId: UUID? = null

    @JsonProperty("storeId")
    private val storeId: String? = null

    @JsonProperty("orderDate")
    private val orderDate: String? = null

    @JsonProperty("orderItems")
    private val orderItems: List<OrderItemSummary>? = null

    @JsonProperty("orderTotal")
    private val orderTotal = 0.0
    override fun toString(): String {
        return "OrderSummary{" +
                "orderCompletedDate='" + orderCompletedDate + '\'' +
                ", loyaltyId='" + loyaltyId + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", orderId=" + orderId +
                ", storeId='" + storeId + '\'' +
                ", orderDate='" + orderDate + '\'' +
                ", orderItems=" + orderItems +
                ", orderTotal=" + orderTotal +
                '}'
    }
}
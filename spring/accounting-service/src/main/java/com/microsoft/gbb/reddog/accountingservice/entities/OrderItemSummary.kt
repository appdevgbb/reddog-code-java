package com.microsoft.gbb.reddog.accountingservice.entities

import com.fasterxml.jackson.annotation.JsonProperty
import lombok.Builder
import lombok.Getter
import lombok.Setter

/**
 * The type Order item summary.
 */
@Getter
@Setter
@Builder
class OrderItemSummary {
    @JsonProperty("unitPrice")
    private val unitPrice = 0.0

    @JsonProperty("quantity")
    private val quantity = 0

    @JsonProperty("productId")
    private val productId = 0

    @JsonProperty("unitCost")
    private val unitCost = 0.0

    @JsonProperty("imageUrl")
    private val imageUrl: String? = null

    @JsonProperty("productName")
    private val productName: String? = null
    override fun toString(): String {
        return "OrderItemSummary{" +
                "unitPrice=" + unitPrice +
                ", quantity=" + quantity +
                ", productId=" + productId +
                ", unitCost=" + unitCost +
                ", imageUrl='" + imageUrl + '\'' +
                ", productName='" + productName + '\'' +
                '}'
    }
}
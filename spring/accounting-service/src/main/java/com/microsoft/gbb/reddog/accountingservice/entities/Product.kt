package com.microsoft.gbb.reddog.accountingservice.entities

import com.fasterxml.jackson.annotation.JsonProperty

/**
 * The type Product.
 */
class Product {
    /**
     * Gets unit price.
     *
     * @return the unit price
     */
    /**
     * Sets unit price.
     *
     * @param unitPrice the unit price
     */
    @JsonProperty("unitPrice")
    var unitPrice = 0.0
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
    /**
     * Gets unit cost.
     *
     * @return the unit cost
     */
    /**
     * Sets unit cost.
     *
     * @param unitCost the unit cost
     */
    @JsonProperty("unitCost")
    var unitCost = 0.0
    /**
     * Gets image url.
     *
     * @return the image url
     */
    /**
     * Sets image url.
     *
     * @param imageUrl the image url
     */
    @JsonProperty("imageUrl")
    var imageUrl: String? = null
    /**
     * Gets description.
     *
     * @return the description
     */
    /**
     * Sets description.
     *
     * @param description the description
     */
    @JsonProperty("description")
    var description: String? = null
    /**
     * Gets product name.
     *
     * @return the product name
     */
    /**
     * Sets product name.
     *
     * @param productName the product name
     */
    @JsonProperty("productName")
    var productName: String? = null
    /**
     * Gets category id.
     *
     * @return the category id
     */
    /**
     * Sets category id.
     *
     * @param categoryId the category id
     */
    @JsonProperty("categoryId")
    var categoryId: String? = null
}
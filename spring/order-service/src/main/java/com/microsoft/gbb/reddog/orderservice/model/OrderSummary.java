package com.microsoft.gbb.reddog.orderservice.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;
import java.util.UUID;

/**
 * The type Order summary.
 */
public class OrderSummary {

    @JsonProperty("orderCompletedDate")
    private String orderCompletedDate;

    @JsonProperty("loyaltyId")
    private String loyaltyId;

    @JsonProperty("firstName")
    private String firstName;

    @JsonProperty("lastName")
    private String lastName;

    @JsonProperty("orderId")
    private UUID orderId;

    @JsonProperty("storeId")
    private String storeId;

    @JsonProperty("orderDate")
    private String orderDate;

    @JsonProperty("orderItems")
    private List<OrderItemSummary> orderItems;

    @JsonProperty("orderTotal")
    private double orderTotal;

    /**
     * Sets order completed date.
     *
     * @param orderCompletedDate the order completed date
     */
    public void setOrderCompletedDate(String orderCompletedDate) {
        this.orderCompletedDate = orderCompletedDate;
    }

    /**
     * Gets order completed date.
     *
     * @return the order completed date
     */
    public String getOrderCompletedDate() {
        return orderCompletedDate;
    }

    /**
     * Sets loyalty id.
     *
     * @param loyaltyId the loyalty id
     */
    public void setLoyaltyId(String loyaltyId) {
        this.loyaltyId = loyaltyId;
    }

    /**
     * Gets loyalty id.
     *
     * @return the loyalty id
     */
    public String getLoyaltyId() {
        return loyaltyId;
    }

    /**
     * Sets first name.
     *
     * @param firstName the first name
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * Gets first name.
     *
     * @return the first name
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * Sets last name.
     *
     * @param lastName the last name
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * Gets last name.
     *
     * @return the last name
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * Sets order id.
     *
     * @param orderId the order id
     */
    public void setOrderId(UUID orderId) {
        this.orderId = orderId;
    }

    /**
     * Gets order id.
     *
     * @return the order id
     */
    public UUID getOrderId() {
        return orderId;
    }

    /**
     * Sets store id.
     *
     * @param storeId the store id
     */
    public void setStoreId(String storeId) {
        this.storeId = storeId;
    }

    /**
     * Gets store id.
     *
     * @return the store id
     */
    public String getStoreId() {
        return storeId;
    }

    /**
     * Sets order date.
     *
     * @param orderDate the order date
     */
    public void setOrderDate(String orderDate) {
        this.orderDate = orderDate;
    }

    /**
     * Gets order date.
     *
     * @return the order date
     */
    public String getOrderDate() {
        return orderDate;
    }

    /**
     * Sets order items.
     *
     * @param orderItems the order items
     */
    public void setOrderItems(List<OrderItemSummary> orderItems) {
        this.orderItems = orderItems;
    }

    /**
     * Gets order items.
     *
     * @return the order items
     */
    public List<OrderItemSummary> getOrderItems() {
        return orderItems;
    }

    /**
     * Sets order total.
     *
     * @param orderTotal the order total
     */
    public void setOrderTotal(double orderTotal) {
        this.orderTotal = orderTotal;
    }

    /**
     * Gets order total.
     *
     * @return the order total
     */
    public double getOrderTotal() {
        return orderTotal;
    }
}
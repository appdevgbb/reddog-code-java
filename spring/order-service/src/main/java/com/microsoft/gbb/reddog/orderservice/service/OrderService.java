package com.microsoft.gbb.reddog.orderservice.service;

import com.microsoft.gbb.reddog.orderservice.model.CustomerOrder;

/**
 * The interface Order service.
 */
public interface OrderService {
    /**
     * Create order string.
     *
     * @param order the order
     * @return the string
     */
    public String createOrder(CustomerOrder order);
}

package com.microsoft.gbb.reddog.orderservice.service;

import com.microsoft.gbb.reddog.orderservice.messaging.DaprPublisher;
import com.microsoft.gbb.reddog.orderservice.model.CustomerOrder;
import com.microsoft.gbb.reddog.orderservice.dao.ProductRespository;
import com.microsoft.gbb.reddog.orderservice.model.OrderItemSummary;
import com.microsoft.gbb.reddog.orderservice.model.OrderSummary;
import com.microsoft.gbb.reddog.orderservice.model.Product;
import io.opentelemetry.extension.annotations.WithSpan;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;

/**
 * The type Order service.
 */
@Slf4j
@Component
@Qualifier("customerorder")
public class CustomerOrderService implements OrderService {
    private static final Logger LOGGER = LoggerFactory.getLogger(CustomerOrderService.class);
    private final ProductRespository productRespository;
    private final DaprPublisher daprPublisher;

    public CustomerOrderService(ProductRespository productRespository, DaprPublisher daprPublisher) {
        this.productRespository = productRespository;
        this.daprPublisher = daprPublisher;
    }

    @WithSpan("createOrder")
    public OrderSummary createOrder(CustomerOrder order) {
        LOGGER.info("Creating order");
        var orderSummary = getOrderSummary(order);
        daprPublisher.publishEvent(orderSummary.toString());
        return orderSummary;
    }

    public OrderSummary getOrderSummary(CustomerOrder order) {
        // Retrieve all the items
        ArrayList<Product> products = productRespository.getAllProducts();

        // Iterate through the list of ordered items to calculate
        // the total and compile a list of item summaries.
        AtomicReference<Float> orderTotal = new AtomicReference<>(0.0f);
        var itemSummaries = new ArrayList<OrderItemSummary>();
        order.getOrderItems().forEach(orderItem -> {
            Product product = products.stream()
                    .filter((p) -> p.getProductId() == orderItem.getProductId())
                    .findFirst()
                    .orElse(null);
            if (product == null) return;

            orderTotal.updateAndGet(v -> (float) (v + (product.getUnitPrice() * orderItem.getQuantity())));
            itemSummaries.add(OrderItemSummary.builder()
                    .productId(orderItem.getProductId())
                    .productName(product.getProductName())
                    .unitPrice(product.getUnitPrice())
                    .quantity(orderItem.getQuantity())
                    .unitCost(product.getUnitCost())
                    .imageUrl(product.getImageUrl())
                    .build());
        });

        // return initialized order summary
        return OrderSummary.builder()
                .orderId(UUID.randomUUID())
                .storeId(order.getStoreId())
                .firstName(order.getFirstName())
                .lastName(order.getLastName())
                .loyaltyId(order.getLoyaltyId())
                .orderDate(new Date().toString())
                .orderItems(itemSummaries)
                .orderTotal(BigDecimal.valueOf(orderTotal.get()).setScale(2, RoundingMode.HALF_DOWN).doubleValue())
                .build();
    }
}

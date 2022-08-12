package com.microsoft.gbb.reddog.orderservice.service;

import com.microsoft.gbb.reddog.orderservice.messaging.DaprPublisher;
import com.microsoft.gbb.reddog.orderservice.model.CustomerOrder;
import com.microsoft.gbb.reddog.orderservice.dao.ProductRespository;
import io.opentelemetry.api.trace.Span;
import io.opentelemetry.extension.annotations.WithSpan;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.Arrays;

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
    public String createOrder(CustomerOrder order) {
        LOGGER.info("Creating order");
        Span span = Span.current();
        span.setAttribute("order.create.publish.start", "${now()}");
        daprPublisher.publishEvent(order.toString());
        span.setAttribute("order.create.publish.stop", "${now()}");
        System.out.println(Arrays.toString(productRespository.getAllProducts()));
        return "Order created successfully";
    }
}

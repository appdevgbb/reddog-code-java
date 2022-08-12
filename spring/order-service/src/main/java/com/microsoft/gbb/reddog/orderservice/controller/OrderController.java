package com.microsoft.gbb.reddog.orderservice.controller;

import com.microsoft.gbb.reddog.orderservice.exception.OrderNotFoundException;
import com.microsoft.gbb.reddog.orderservice.model.CustomerOrder;
import com.microsoft.gbb.reddog.orderservice.service.OrderService;
import io.opentelemetry.extension.annotations.WithSpan;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
public class OrderController {

    private final OrderService orderService;

    public OrderController(OrderService orderService) {
        this.orderService = orderService;
    }

    @PostMapping(value = "/order",
                 consumes = "application/json",
                 produces = "application/json")
    @ResponseStatus(HttpStatus.CREATED)
    @CrossOrigin(origins = "*")
    @WithSpan("createOrder")
    public String order(@RequestBody CustomerOrder order) {
        if (null == order) {
            throw new OrderNotFoundException("Order is null");
        }
        // TODO: asynchronously create order
        return orderService.createOrder(order);
    }
}

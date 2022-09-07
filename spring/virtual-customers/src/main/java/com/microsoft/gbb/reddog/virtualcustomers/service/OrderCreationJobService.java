package com.microsoft.gbb.reddog.virtualcustomers.service;

import com.microsoft.gbb.reddog.virtualcustomers.model.Product;
import io.dapr.client.DaprClient;
import io.dapr.client.DaprClientBuilder;
import lombok.extern.slf4j.Slf4j;
import org.jobrunr.jobs.annotations.Job;
import org.jobrunr.spring.annotations.Recurring;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import reactor.core.publisher.Mono;

import java.util.ArrayList;

/**
 * The type Order service.
 */
@Slf4j
@Component
public class OrderCreationJobService {
    private static final Logger LOGGER = LoggerFactory.getLogger(OrderCreationJobService.class);
    public static final String ORDER_SVC_APP_ID = "orderservice";

    public OrderCreationJobService() {
    }

    @Recurring(id = "create-orders", cron = "*/5 * * * *")
    @Job(name = "Virtual Customers")
    public void execute() {
        LOGGER.info("Creating orders");
        // TODO: add configuration similar to .NET version
        DaprClient daprClient = new DaprClientBuilder().build();
        // Mono<ArrayList<Product>> products = daprClient.invokeMethod(ORDER_SVC_APP_ID, "products", null, ArrayList.class).block();
    }
}

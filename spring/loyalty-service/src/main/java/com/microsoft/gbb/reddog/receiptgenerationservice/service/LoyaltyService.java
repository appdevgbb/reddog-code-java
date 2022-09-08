package com.microsoft.gbb.reddog.receiptgenerationservice.service;

import com.microsoft.gbb.reddog.receiptgenerationservice.messaging.DaprPublisher;
import com.microsoft.gbb.reddog.receiptgenerationservice.model.OrderSummary;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

/**
 * Receipt generation service
 */
@Slf4j
@Component
public class LoyaltyService {
    private static final Logger LOGGER = LoggerFactory.getLogger(LoyaltyService.class);
    private final DaprPublisher daprPublisher;

    public LoyaltyService(DaprPublisher daprPublisher) {
        this.daprPublisher = daprPublisher;
    }


    public String updateLoyalty(OrderSummary orderSummary) {
        LOGGER.info("Generating receipt");
        // TODO: invoke loyalty state store to update entry in DB
        // daprPublisher.publishEvent(orderSummary.toString());
        return "Work in progress, try again";
    }

}

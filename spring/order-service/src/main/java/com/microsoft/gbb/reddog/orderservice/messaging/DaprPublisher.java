package com.microsoft.gbb.reddog.orderservice.messaging;

import io.dapr.client.DaprClient;
import io.dapr.client.DaprClientBuilder;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;


@Component
public class DaprPublisher {

    @Value("${messaging.pubsub.TOPIC_NAME}")
    private String TOPIC_NAME;
    @Value("${messaging.pubsub.SUB_NAME}")
    private String SUB_NAME;

    public void publishEvent(String message) {
        DaprClient client = new DaprClientBuilder().build();
        client.publishEvent(
                SUB_NAME,
                TOPIC_NAME,
                message).block();
    }

}


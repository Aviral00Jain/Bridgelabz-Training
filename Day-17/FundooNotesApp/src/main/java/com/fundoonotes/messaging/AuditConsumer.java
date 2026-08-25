package com.fundoonotes.messaging;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

import com.fundoonotes.config.MessagingConfig;

@Component
public class AuditConsumer {

    @RabbitListener(queues = MessagingConfig.QUEUE)
    public void consumeAuditLog(String message) {
        System.out.println("RabbitMQ Audit Consumer received message: " + message);
    }
}

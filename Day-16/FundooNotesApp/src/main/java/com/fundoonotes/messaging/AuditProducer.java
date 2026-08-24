package com.fundoonotes.messaging;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.stereotype.Component;

import com.fundoonotes.config.MessagingConfig;

@Component
public class AuditProducer {

    private final RabbitTemplate rabbitTemplate;

    public AuditProducer(RabbitTemplate rabbitTemplate) {
        this.rabbitTemplate = rabbitTemplate;
    }

    public void sendAuditLog(String action, Long noteId, String details) {
        String message = String.format("Action: %s | Note ID: %d | Details: %s | Timestamp: %d", 
                action, noteId, details, System.currentTimeMillis());
        rabbitTemplate.convertAndSend(MessagingConfig.EXCHANGE, MessagingConfig.ROUTING_KEY, message);
    }
}

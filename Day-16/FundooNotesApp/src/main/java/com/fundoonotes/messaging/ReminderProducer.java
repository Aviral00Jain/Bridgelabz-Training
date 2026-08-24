package com.fundoonotes.messaging;

import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Component;

@Component
public class ReminderProducer {

    private final JmsTemplate jmsTemplate;
    public static final String PASSWORD_RESET_QUEUE = "password-reset-queue";

    public ReminderProducer(JmsTemplate jmsTemplate) {
        this.jmsTemplate = jmsTemplate;
    }

    public void sendPasswordResetRequest(String email, String resetToken) {
        String payload = email + "|" + resetToken;
        jmsTemplate.convertAndSend(PASSWORD_RESET_QUEUE, payload);
    }
}

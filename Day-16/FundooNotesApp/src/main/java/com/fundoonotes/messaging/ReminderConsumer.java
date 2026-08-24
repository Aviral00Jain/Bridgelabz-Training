package com.fundoonotes.messaging;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

@Component
public class ReminderConsumer {

    @JmsListener(destination = ReminderProducer.PASSWORD_RESET_QUEUE)
    public void consumePasswordResetRequest(String payload) {
        System.out.println("JMS Consumer received payload: " + payload);
        try {
            String[] parts = payload.split("\\|");
            if (parts.length == 2) {
                String email = parts[0];
                String token = parts[1];
                
                System.out.println("Processing password reset request for email: " + email);
                // Simulate email sending delay (3 seconds)
                Thread.sleep(3000);
                System.out.println("Password reset email sent to: " + email + " with token: " + token);
            } else {
                System.err.println("Invalid message format: " + payload);
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            System.err.println("JMS Email sending was interrupted: " + e.getMessage());
        } catch (Exception e) {
            System.err.println("Error processing JMS message: " + e.getMessage());
        }
    }
}

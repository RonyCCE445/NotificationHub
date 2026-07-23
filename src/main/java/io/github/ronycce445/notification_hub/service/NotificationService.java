package io.github.ronycce445.notification_hub.service;

import io.github.ronycce445.notification_hub.dto.NotificationRequest;
import io.github.ronycce445.notification_hub.dto.NotificationResponse;
import io.github.ronycce445.notification_hub.provider.EmailProvider;
import org.springframework.stereotype.Service;

@Service
public class NotificationService {

    private final EmailProvider emailProvider;

    public NotificationService(EmailProvider emailProvider) {
        this.emailProvider = emailProvider;
    }

    public NotificationResponse sendNotification(String recipient) {
        NotificationResponse response = new NotificationResponse();

        response.setStatus("SUCCESS");
        response.setRecipient(recipient);
        response.setProvider(emailProvider.send());
        response.setMessage("Notification has been sent successfully.");

        return response;
    }

    public NotificationResponse sendNotification(NotificationRequest request) {
        return sendNotification(request.getRecipient());
    }
}
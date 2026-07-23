package io.github.ronycce445.notification_hub.service;

import io.github.ronycce445.notification_hub.dto.NotificationRequest;
import io.github.ronycce445.notification_hub.dto.NotificationResponse;
import io.github.ronycce445.notification_hub.provider.EmailProvider;
import io.github.ronycce445.notification_hub.provider.NotificationProvider;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class NotificationService {

    private final NotificationProvider notificationProvider;

    public NotificationService(@Qualifier("smsProvider")NotificationProvider notificationProvider) {

        this.notificationProvider = notificationProvider;
    }

    public NotificationResponse sendNotification(String recipient) {
        NotificationResponse response = new NotificationResponse();

        response.setStatus("SUCCESS");
        response.setRecipient(recipient);
        response.setProvider(notificationProvider.send());
        response.setMessage("Notification has been sent successfully.");

        return response;
    }

    public NotificationResponse sendNotification(NotificationRequest request) {
        return sendNotification(request.getRecipient());
    }
}
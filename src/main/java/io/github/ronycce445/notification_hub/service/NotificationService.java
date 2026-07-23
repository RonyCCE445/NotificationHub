package io.github.ronycce445.notification_hub.service;

import io.github.ronycce445.notification_hub.dto.NotificationRequest;
import io.github.ronycce445.notification_hub.dto.NotificationResponse;
import io.github.ronycce445.notification_hub.provider.NotificationProvider;
import org.springframework.stereotype.Service;
import java.util.Map;

@Service
public class NotificationService {

    private final Map<String, NotificationProvider> notificationProviders;

    public NotificationService(Map<String, NotificationProvider> notificationProviders) {
        this.notificationProviders = notificationProviders;
    }


    public NotificationResponse sendNotification(NotificationRequest request) {
        NotificationResponse response = new NotificationResponse();
        NotificationProvider provider =
                notificationProviders.values()
                        .stream()
                        .filter(p -> p.getChannel() == request.getChannel())
                        .findFirst()
                        .orElseThrow();
        response.setStatus("SUCCESS");
        response.setRecipient(request.getRecipient());
        response.setProvider(provider.send());
        response.setMessage("Notification has been sent successfully.");
        return response;
    }
}
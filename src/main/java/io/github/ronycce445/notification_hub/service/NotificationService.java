package io.github.ronycce445.notification_hub.service;

import io.github.ronycce445.notification_hub.provider.EmailProvider;

import org.springframework.stereotype.Service;
@Service
public class NotificationService  {

    private final EmailProvider emailProvider;

    public NotificationService(EmailProvider emailProvider) {
        this.emailProvider = emailProvider;
    }

    public String sendNotification(String recipient){
       String providerResult = emailProvider.send();
        return "Notification has been sent to "+recipient+". Provider Says: " + providerResult;
    }

}

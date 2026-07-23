package io.github.ronycce445.notification_hub.provider;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class EmailProvider implements NotificationProvider {
    @Value("${notification.provider}")
    private String providerName;
    @Override
    public String send() {
        return providerName;
    }
}


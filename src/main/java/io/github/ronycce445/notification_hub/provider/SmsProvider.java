package io.github.ronycce445.notification_hub.provider;

import org.springframework.stereotype.Service;

@Service
public class SmsProvider implements NotificationProvider {
    @Override
    public String send() {
        return "SMS";
    }
}

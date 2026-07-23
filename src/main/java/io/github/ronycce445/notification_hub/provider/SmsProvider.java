package io.github.ronycce445.notification_hub.provider;

import io.github.ronycce445.notification_hub.enums.Channel;
import org.springframework.stereotype.Service;

@Service
public class SmsProvider implements NotificationProvider {
    @Override
    public String send() {
        return "SMS";
    }
    @Override
    public Channel getChannel() {
        return Channel.SMS;
    }
}

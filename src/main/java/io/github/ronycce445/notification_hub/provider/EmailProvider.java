package io.github.ronycce445.notification_hub.provider;

import io.github.ronycce445.notification_hub.enums.Channel;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service
public class EmailProvider implements NotificationProvider {
    @Value("${notification.provider}")
    private String providerName;
    @Override
    public String send() {

        return providerName;
    }

    @Override
    public Channel getChannel() {
        return Channel.EMAIL;
    }

}


package io.github.ronycce445.notification_hub.provider;


import io.github.ronycce445.notification_hub.enums.Channel;

public interface NotificationProvider {
     String send();
     Channel getChannel();
}

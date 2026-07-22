package io.github.ronycce445.notification_hub.provider;

import org.springframework.stereotype.Service;

@Service
public class EmailProvider {
    public String send() {
        return "Email Provider Ready";
    }
}


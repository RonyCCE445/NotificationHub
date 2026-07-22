package io.github.ronycce445.notification_hub.controller;

import io.github.ronycce445.notification_hub.service.NotificationService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NotificationController {

    private final NotificationService notificationService;

    public NotificationController(NotificationService notificationService) {
        this.notificationService = notificationService;
    }

    @GetMapping("/notifications/test")
    public String testNotification(@RequestParam String recipient){
        return notificationService.sendNotification(recipient);
    }


}

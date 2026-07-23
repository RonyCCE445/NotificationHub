package io.github.ronycce445.notification_hub.controller;

import io.github.ronycce445.notification_hub.service.NotificationService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NotificationController {

    private final NotificationService notificationService;

    public NotificationController(NotificationService notificationService) {
        this.notificationService = notificationService;
    }

    @GetMapping("/notifications/{recipient}")
    public String testNotification(@PathVariable String recipient){
        return notificationService.sendNotification(recipient);
    }


}

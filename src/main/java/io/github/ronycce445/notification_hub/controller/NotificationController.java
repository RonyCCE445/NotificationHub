package io.github.ronycce445.notification_hub.controller;

import io.github.ronycce445.notification_hub.dto.NotificationRequest;
import io.github.ronycce445.notification_hub.service.NotificationService;
import org.springframework.web.bind.annotation.*;
//import org.springframework.web.bind.annotation.RequestParam;

@RequestMapping("/notifications")
@RestController
public class NotificationController {

    private final NotificationService notificationService;

    public NotificationController(NotificationService notificationService) {
        this.notificationService = notificationService;
    }

    @GetMapping("/{recipient}")
    public String testNotification(@PathVariable String recipient){
        return notificationService.sendNotification(recipient);
    }
    @PostMapping
    public String sendNotification(@RequestBody NotificationRequest request) {
        return notificationService.sendNotification(request);

    }


}

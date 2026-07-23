package io.github.ronycce445.notification_hub.controller;

import io.github.ronycce445.notification_hub.dto.NotificationRequest;
import io.github.ronycce445.notification_hub.dto.NotificationResponse;
import io.github.ronycce445.notification_hub.service.NotificationService;
import jakarta.validation.Valid;
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
    public NotificationResponse sendNotification( @RequestBody @Valid NotificationRequest request) {
        return notificationService.sendNotification(request);

    }


}

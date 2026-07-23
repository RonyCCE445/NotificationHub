package io.github.ronycce445.notification_hub.controller;

import io.github.ronycce445.notification_hub.dto.NotificationRequest;
import io.github.ronycce445.notification_hub.dto.NotificationResponse;
import io.github.ronycce445.notification_hub.service.NotificationService;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/notifications")
public class NotificationController {

    private final NotificationService notificationService;

    public NotificationController(NotificationService notificationService) {
        this.notificationService = notificationService;
    }

    @GetMapping("/{recipient}")
    public ResponseEntity<NotificationResponse> sendNotification(
            @PathVariable String recipient) {

        NotificationResponse response =
                notificationService.sendNotification(recipient);

        return ResponseEntity.ok(response);
    }

    @PostMapping
    public ResponseEntity<NotificationResponse> sendNotification(
            @Valid @RequestBody NotificationRequest request) {
        System.out.println("Controller reached");

        NotificationResponse response =
                notificationService.sendNotification(request);

        return ResponseEntity.ok(response);
    }
}
package io.github.ronycce445.notification_hub;

import io.github.ronycce445.notification_hub.service.NotificationService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.stereotype.Component;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.CommandLineRunner;

@SpringBootApplication
public class NotificationHubApplication  {
	private final NotificationService notificationService;

	public NotificationHubApplication(NotificationService notificationService) {
		this.notificationService = notificationService;
	}

	public static void main(String[] args) {

		SpringApplication.run(NotificationHubApplication.class, args);



	}

}



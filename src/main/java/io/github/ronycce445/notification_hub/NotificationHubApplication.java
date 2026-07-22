package io.github.ronycce445.notification_hub;

import io.github.ronycce445.notification_hub.service.NotificationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Component;

@SpringBootApplication
public class NotificationHubApplication implements CommandLineRunner {
	private final NotificationService notificationService;

	public NotificationHubApplication(NotificationService notificationService) {
		this.notificationService = notificationService;
	}

	public static void main(String[] args) {

		SpringApplication.run(NotificationHubApplication.class, args);


	}

	@Override
	public void run(String... args) throws Exception{

		System.out.println(notificationService.sendNotification());

	}
}



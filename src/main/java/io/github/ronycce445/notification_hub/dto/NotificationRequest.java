package io.github.ronycce445.notification_hub.dto;

import io.github.ronycce445.notification_hub.enums.Channel;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

public class NotificationRequest {
    @NotBlank
    String recipient;
    @NotBlank
    @Size(max = 100)
    String subject;
    @NotBlank
    @Size(max = 100)
    String message;
    @NotNull
    private Channel channel;

    public String getRecipient() {
        return recipient;
    }

    public void setRecipient(String recipient) {
        this.recipient = recipient;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Channel getChannel() {
        return channel;
    }

    public void setChannel(Channel channel) {
        this.channel = channel;
    }
}

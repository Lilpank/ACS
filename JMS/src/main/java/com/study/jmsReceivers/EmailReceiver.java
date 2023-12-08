package com.study.jmsReceivers;

import com.study.models.Email;
import com.study.models.Event;
import com.study.services.EmailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

@Component
public class EmailReceiver implements Receiver {

    private final EmailService emailService;

    @Autowired
    public EmailReceiver(EmailService emailService) {
        this.emailService = emailService;
    }

    @JmsListener(destination = "event")
    @Override
    public void receive(Event event) {
        String body = "Данные изменены.\nТип изменения: %s";
        String message = String.format(body, event.getEventType().name());
        Email email = new Email(message, "info@example.com");
        emailService.save(email);
    }
}

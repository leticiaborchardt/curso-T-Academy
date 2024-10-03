package com.example.microemail.consumers;

import com.example.microemail.dtos.EmailDTO;
import com.example.microemail.models.Email;
import com.example.microemail.services.EmailService;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.BeanUtils;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;

@Component
public class EmailConsumer {

    private final EmailService emailService;

    public EmailConsumer(EmailService emailService) {
        this.emailService = emailService;
    }

    @RabbitListener(queues = "${broker.queue.email.name}")
    public void listenEmailQueue(@Payload EmailDTO emailDTO) {
        var email = new Email();
        BeanUtils.copyProperties(emailDTO, email);

        emailService.sendEmail(email);
    }
}

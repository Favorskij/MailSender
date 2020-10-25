package com.email.message;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.MailSender;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component
public class SendEmail {

    @Autowired
    private MailSender mailSender;

    public void sendMail(){

        SimpleMailMessage msg = new SimpleMailMessage();

        msg.setTo("gennadij.777@gmail.com");
        msg.setFrom("gennadij.777@gmail.com");
        msg.setSubject("Привет. Это моё первое тестовое сообщене");
        msg.setText("Привет. Это тело моего первого сообщения");

        mailSender.send(msg);

    }
}

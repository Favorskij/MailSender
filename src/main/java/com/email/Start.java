package com.email;

import com.email.config.Config;
import com.email.message.SendEmail;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Start {

    public static void main(String[] args) {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Config.class);

        SendEmail bean = context.getBean(SendEmail.class);
        bean.sendMail();
    }
}

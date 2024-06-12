package com.SpringEmail.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmailController {

    @Autowired
    JavaMailSender javaMailSender;


    @GetMapping("/sendEmail")
    public void sendEmail(){

        SimpleMailMessage message=new SimpleMailMessage();

    message.setTo("vchopade9999@gmail.com");
    message.setFrom("vijaychopade9780@gmail.com");
    message.setSubject("Spring Boot Email");
    message.setText("hi This is From Spring ");
    javaMailSender.send(message);

    }
}

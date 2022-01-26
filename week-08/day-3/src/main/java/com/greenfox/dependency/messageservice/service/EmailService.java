package com.greenfox.dependency.messageservice.service;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service
public class EmailService implements MessageService{


    @Override
    public void sendMessage(String message, String receiver) {
        System.out.println("Email sent to " + receiver + " with a message : " + message);
    }
}

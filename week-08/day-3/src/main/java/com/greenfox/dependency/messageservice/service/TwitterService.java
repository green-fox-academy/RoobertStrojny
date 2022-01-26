package com.greenfox.dependency.messageservice.service;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

@Service
public class TwitterService implements MessageService{

    @Override
    public void sendMessage(String message, String receiver) {
        System.out.println("Tweet sent to : " + receiver + " with a message : " + message);
    }
}

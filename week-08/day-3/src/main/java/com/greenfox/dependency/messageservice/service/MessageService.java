package com.greenfox.dependency.messageservice.service;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;


public interface MessageService {

    public void sendMessage(String message, String receiver);
}

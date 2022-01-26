package com.greenfox.dependency.messageservice.configuration;

import com.greenfox.dependency.messageservice.service.MessageService;
import org.springframework.stereotype.Component;

@Component
public class MessageProceeder {

    MessageService messageService;

    public MessageProceeder(MessageService messageService) {
        this.messageService = messageService;
    }


    public void processMessage(String text, String receiver) {
        messageService.sendMessage(text, receiver);
    }
}

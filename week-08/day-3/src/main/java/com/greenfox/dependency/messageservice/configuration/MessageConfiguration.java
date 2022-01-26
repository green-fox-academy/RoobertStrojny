package com.greenfox.dependency.messageservice.configuration;

import com.greenfox.dependency.messageservice.service.EmailService;
import com.greenfox.dependency.messageservice.service.MessageService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@ComponentScan
@Configuration
public class MessageConfiguration {

    @Bean
    public MessageService messageService() {
        return new EmailService();
    }
}

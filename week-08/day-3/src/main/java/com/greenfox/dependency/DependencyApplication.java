package com.greenfox.dependency;

import com.greenfox.dependency.messageservice.configuration.MessageProceeder;
import com.greenfox.dependency.messageservice.service.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DependencyApplication implements CommandLineRunner {

    @Autowired
    MessageProceeder messageProceeder;

    public static void main(String[] args) {
        SpringApplication.run(DependencyApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        messageProceeder.processMessage("hello", "asdasd@ADSasd.sk");
    }
}

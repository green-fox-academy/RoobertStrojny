package com.greenfox.di;

import com.fasterxml.jackson.annotation.JacksonAnnotationsInside;
import com.greenfox.di.hellobeanworld.Printer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DiApplication{

    public static void main(String[] args) {
        SpringApplication.run(DiApplication.class, args);
    }

}

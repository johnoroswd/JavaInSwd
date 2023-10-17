package com.swd.service.mq;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MessageApplication {
    public static void main(String[] args) {
        new SpringApplication(MessageApplication.class).run(args);
    }
}

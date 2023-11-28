package com.swd.cloud.service.base;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TokenApplication {
    public static void main(String[] args) {
        new SpringApplication(TokenApplication.class).run(args);
    }
}

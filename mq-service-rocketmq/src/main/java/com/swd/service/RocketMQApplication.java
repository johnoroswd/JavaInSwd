package com.swd.service;

import com.swd.service.service.RocketMQProducer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RocketMQApplication {
    public static void main(String[] args) {
        new SpringApplication(RocketMQApplication.class).run(args);
    }
}

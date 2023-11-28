package com.swd.common.job;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class QuartzApplication {
    public static void main(String[] args) {
        new SpringApplication(QuartzApplication.class).run(args);
    }
}

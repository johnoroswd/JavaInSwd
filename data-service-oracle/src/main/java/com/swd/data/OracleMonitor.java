package com.swd.data;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@MapperScan(basePackages = "com.swd.data.mapper")
@EnableDiscoveryClient
public class OracleMonitor {
    public static void main(String[] args) {
        new SpringApplication(OracleMonitor.class).run(args);
    }
}

package com.swd.service.mq.service;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
@RabbitListener(queues = "/hello")
public class HelloListener {
    @RabbitListener
    public void process(String hello){
        System.out.println("Receiver :"+hello);
    }
}

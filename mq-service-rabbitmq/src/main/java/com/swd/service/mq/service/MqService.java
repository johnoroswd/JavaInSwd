package com.swd.service.mq.service;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.amqp.core.Queue;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import java.util.UUID;

@Component
public class MqService {

    private AmqpTemplate amqpTemplate;
    @Autowired
    public void setAmqpTemplate(AmqpTemplate amqpTemplate) {
        this.amqpTemplate = amqpTemplate;
    }

    @Bean
    public Queue queue(){
        return new Queue("hello");
    }

    public void send(){
        String context = "hello "+ UUID.randomUUID().toString();
        System.out.println("Sender :"+context);
        this.amqpTemplate.convertAndSend("hello",context);
    }

}

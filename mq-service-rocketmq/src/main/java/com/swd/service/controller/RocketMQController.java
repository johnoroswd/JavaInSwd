package com.swd.service.controller;

import com.swd.service.service.RocketMQProducer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RocketMQController {
    public static final String topic="local-test";
    private RocketMQProducer producer;
    @Autowired
    public void setProducer(RocketMQProducer producer) {
        this.producer = producer;
    }
    @RequestMapping(path = "/sendMessage")
    public String sendMessage(String message){
        producer.sendMessage(topic,message);
        return "消息已发送:"+message;
    }
}

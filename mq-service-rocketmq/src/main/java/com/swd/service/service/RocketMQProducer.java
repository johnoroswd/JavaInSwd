package com.swd.service.service;

import org.apache.rocketmq.spring.core.RocketMQTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class RocketMQProducer {

    private RocketMQTemplate rocketMQTemplate;
    @Autowired
    public void setRocketMQTemplate(RocketMQTemplate rocketMQTemplate) {
        this.rocketMQTemplate = rocketMQTemplate;
    }

    public void sendMessage(String topic,String message){
        rocketMQTemplate.convertAndSend(topic,message);
    }
}

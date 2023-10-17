package com.swd.service.mq.controller;

import com.swd.service.mq.service.MqService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloMqController {
    @Autowired
    private MqService service;
    @RequestMapping(path = "/send")
    public void hello(){
        service.send();
    }
}

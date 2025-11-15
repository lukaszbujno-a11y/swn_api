package com.example.demo.controller;

import com.example.demo.service.JmsMessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SendMessageController {

    @Autowired
    JmsMessageService jmsMessageService;

    @GetMapping("/testArtemis")
    public void demo(@RequestParam("message") String message) {
        System.out.println("Message is:" + message);
        jmsMessageService.sendMsg("test " + message);
    }

    @GetMapping("/testArtemis/{cykl_id}")
    public void demo2(@PathVariable String cykl_id) {
        System.out.println("Message is: cykl" + cykl_id);
        jmsMessageService.sendMsg("cykl  " + cykl_id);
    }
}

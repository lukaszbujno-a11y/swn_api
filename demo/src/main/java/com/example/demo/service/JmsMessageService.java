package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Component;

@Component
public class JmsMessageService {

    @Autowired
    private final JmsTemplate jmsTemplate;

    public static String destination = "my_learning";

    public JmsMessageService(JmsTemplate jmsTemplate) {
        this.jmsTemplate = jmsTemplate;
    }

    //    @JmsListener(destination = "learning")
    public void sendMsg(String string){
        this.jmsTemplate.convertAndSend(destination,string);
    }

    @JmsListener(destination = "my_learning")
    public void reciveMsg(String content){
        System.out.println("Receive jms message from queue: " + content);
    }
}

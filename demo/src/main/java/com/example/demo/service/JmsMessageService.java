package com.example.demo.service;

import com.example.demo.db.model.PakietyJmsMessage;
import com.example.demo.util.JsonSchemaValidator;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Component;

@Component
public class JmsMessageService {

    @Autowired
    private final JmsTemplate jmsTemplate;
    private final JsonSchemaValidator validator;
    private final ObjectMapper mapper;

    public static String destination = "my_learning";

    public JmsMessageService(JmsTemplate jmsTemplate, JsonSchemaValidator validator, ObjectMapper mapper) {
        this.jmsTemplate = jmsTemplate;
        this.validator = validator;
        this.mapper = mapper;
    }

    //    @JmsListener(destination = "learning")
    public void sendMsg(String msg) {
//        TODO:tymczasowe
        PakietyJmsMessage pakietyJmsMessage = new PakietyJmsMessage(PakietyJmsMessage.TypObiektu.NIEZGODNOSC, msg,msg,1,2);
        validator.validate(pakietyJmsMessage);
        try{
            String json = mapper.writeValueAsString(pakietyJmsMessage);
            System.out.println(json);
            this.jmsTemplate.convertAndSend(destination,json);
        } catch (Exception e) {
            throw new RuntimeException("Cannot send message", e);
        }
    }

    @JmsListener(destination = "my_learning")
    public void reciveMsg(String content){
        System.out.println("Receive jms message from queue: " + content);
    }
}

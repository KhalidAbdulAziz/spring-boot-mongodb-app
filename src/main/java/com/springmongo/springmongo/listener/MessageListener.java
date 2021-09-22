package com.springmongo.springmongo.listener;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.springmongo.springmongo.repo.MessageRepo;
import com.springmongo.springmongo.model.Message;
import com.springmongo.springmongo.repo.StudentRepo;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MessageListener {

    @Autowired
    private ObjectMapper objectMapper;

    @Autowired
    public MessageRepo messageRepo;

    @RabbitListener(queues = "messages.go.here")
    public void recieveMessage(String message) throws JsonProcessingException {
      // System.out.println("Message Recieved " + message);
        Message mes = objectMapper.readValue(message, Message.class);
        messageRepo.save(mes);
    }

}

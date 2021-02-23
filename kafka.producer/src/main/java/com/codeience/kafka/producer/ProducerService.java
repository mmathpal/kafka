package com.codeience.kafka.producer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class ProducerService {

    @Autowired
    private KafkaTemplate<String,String> kafkaTemplate;

    public void produce(String message)
    {
        System.out.println("Producing the lessage: " + message);
        kafkaTemplate.send("messages", message);
    }
}

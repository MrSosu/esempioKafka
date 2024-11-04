package com.example.esempioKafka.consumers;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumer {

    @KafkaListener(topics = "sosu-topic", groupId = "sosuGroup")
    public void consumeMessage(String message) {
        System.out.println(message);
    }

}

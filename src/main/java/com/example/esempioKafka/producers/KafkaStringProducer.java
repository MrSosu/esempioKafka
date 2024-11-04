package com.example.esempioKafka.producers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class KafkaStringProducer {

    @Autowired
    private KafkaTemplate<String, String> kafkaTemplate;

    public ResponseEntity<?> sendMessage(String message) {
        kafkaTemplate.send("sosu-topic", message);
        return new ResponseEntity<>("messaggio inviato correttamente", HttpStatus.OK);
    }

}

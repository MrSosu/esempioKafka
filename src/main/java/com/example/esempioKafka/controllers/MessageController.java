package com.example.esempioKafka.controllers;

import com.example.esempioKafka.entities.Studente;
import com.example.esempioKafka.producers.KafkaJsonProducer;
import com.example.esempioKafka.producers.KafkaStringProducer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/message")
public class MessageController {

    @Autowired
    private KafkaStringProducer kafkaProducer;
    @Autowired
    private KafkaJsonProducer kafkaJsonProducer;

    @PostMapping
    public ResponseEntity<?> sendMessage(@RequestParam String message) {
        return kafkaProducer.sendMessage(message);
    }

    @PostMapping("/studente")
    public ResponseEntity<?> sendStudente(@RequestBody Studente studente) {
        return kafkaJsonProducer.sendStudente(studente);
    }

}

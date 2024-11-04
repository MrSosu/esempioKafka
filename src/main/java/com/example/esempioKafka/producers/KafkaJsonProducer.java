package com.example.esempioKafka.producers;

import com.example.esempioKafka.entities.Studente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.support.KafkaHeaders;
import org.springframework.messaging.Message;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.stereotype.Service;

@Service
public class KafkaJsonProducer {

    @Autowired
    private KafkaTemplate<String, Studente> kafkaTemplate;

    public ResponseEntity<?> sendStudente(Studente studente) {
        /*Message<Studente> message = MessageBuilder
                .withPayload(studente)
                .setHeader(KafkaHeaders.TOPIC, "sosu-topic")
                .build(); */
        kafkaTemplate.send("sosu-topic", studente);
        return new ResponseEntity<>("Studente inviato con successo", HttpStatus.OK);
    }

}

package com.example.esempioKafka.consumers;

import com.example.esempioKafka.entities.Studente;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumer {

    // @KafkaListener(topics = "sosu-topic", groupId = "sosuGroup")
    public void consumeMessage(String message) {
        System.out.println(message);
    }

    @KafkaListener(topics = "sosu-topic", groupId = "sosuGroup")
    public void consumeStudente(Studente studente) {
        System.out.println("maledetto studente consumato");
        System.out.println(studente);
    }

}

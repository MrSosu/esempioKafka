package com.example.esempioKafka.exception;

import com.example.esempioKafka.entities.Studente;
import org.apache.kafka.common.serialization.Deserializer;
import org.springframework.kafka.support.serializer.ErrorHandlingDeserializer;

public class KafkaMessageDeserializer
        extends ErrorHandlingDeserializer<Studente> implements Deserializer<Studente> {
}

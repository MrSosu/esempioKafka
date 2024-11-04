package com.example.esempioKafka.entities;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Studente {

    private Long id;
    private String nome;
    private String cognome;
    private String matricola;
    private String facolta;

}

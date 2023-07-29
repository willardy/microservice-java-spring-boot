package com.microservice.rhfolhadepagamento.local.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Funcionario {
    private Long id;

    private String nome;

    private Double rendaDiaria;
}

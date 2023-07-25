package com.microservice.rhfolhadepagamento.local.entity;

import lombok.*;

@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class FolhaDePagamento {

    private String nome;

    private Double rendaDiaria;

    private Integer dias;

    private Double total;

    public Double getTotal(){
        return rendaDiaria * dias;
    }
}

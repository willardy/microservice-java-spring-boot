package com.microservice.rhfolhadepagamento.local.service;

import com.microservice.rhfolhadepagamento.local.entity.FolhaDePagamento;
import org.springframework.stereotype.Service;

@Service
public class FolhaDePagamentoService {


    public FolhaDePagamento obterFolhaDePagamento(Long funcionarioId, Integer dias){
        return FolhaDePagamento.builder().nome("Fulano").rendaDiaria(500.00).dias(dias).build();
    }
}

package com.microservice.rhfolhadepagamento.local.service;

import com.microservice.rhfolhadepagamento.local.entity.FolhaDePagamento;
import com.microservice.rhfolhadepagamento.local.entity.Funcionario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;
import java.util.Map;

@Service
public class FolhaDePagamentoService {

    @Value("${rh.funcionarrios.host}")
    private String funcionarioUrl;

    @Autowired
    private RestTemplate restTemplate;

    public FolhaDePagamento obterFolhaDePagamento(Long funcionarioId, Integer dias) {
        Map<String, String> request = new HashMap<>();
        request.put("id", funcionarioId.toString());

        Funcionario funcionario = restTemplate.getForObject(funcionarioUrl + "/funcionario/{id}", Funcionario.class, request);

        return FolhaDePagamento.builder().nome(funcionario.getNome()).rendaDiaria(funcionario.getRendaDiaria()).dias(dias).build();
    }
}

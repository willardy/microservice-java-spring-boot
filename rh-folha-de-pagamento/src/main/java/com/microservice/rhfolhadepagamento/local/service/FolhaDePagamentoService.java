package com.microservice.rhfolhadepagamento.local.service;

import com.microservice.rhfolhadepagamento.feignclient.FuncionarioFeignClient;
import com.microservice.rhfolhadepagamento.local.entity.FolhaDePagamento;
import com.microservice.rhfolhadepagamento.local.entity.Funcionario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FolhaDePagamentoService {

    @Autowired
    private FuncionarioFeignClient funcionarioFeignClient;

    public FolhaDePagamento obterFolhaDePagamento(Long funcionarioId, Integer dias) {
        Funcionario funcionario = funcionarioFeignClient.buscaFuncionarioPorId(funcionarioId).getBody();

        return FolhaDePagamento.builder().nome(funcionario.getNome()).rendaDiaria(funcionario.getRendaDiaria()).dias(dias).build();
    }
}

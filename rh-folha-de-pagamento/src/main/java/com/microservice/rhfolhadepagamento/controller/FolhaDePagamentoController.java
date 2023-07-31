package com.microservice.rhfolhadepagamento.controller;

import com.microservice.rhfolhadepagamento.local.entity.FolhaDePagamento;
import com.microservice.rhfolhadepagamento.local.service.FolhaDePagamentoService;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/folha-de-pagamento")
public class FolhaDePagamentoController {
    @Autowired
    private FolhaDePagamentoService folhaDePagamentoService;

    @HystrixCommand(fallbackMethod = "obterFolhaPagamentoFallBack")
    @GetMapping(value = "/{funcionarioId}/dias/{dias}")
    public ResponseEntity<FolhaDePagamento> obterFolhaPagamento(@PathVariable Long funcionarioId, @PathVariable Integer dias){
        return ResponseEntity.ok(folhaDePagamentoService.obterFolhaDePagamento(funcionarioId, dias));
    }

    //Caso o serviço obterFolhaPagamento esteja indisponivel, chamar o método abaixo
    public ResponseEntity<FolhaDePagamento> obterFolhaPagamentoFallBack(Long funcionarioId, Integer dias){
        return ResponseEntity.ok(FolhaDePagamento.builder().nome("Fallback").dias(dias).rendaDiaria(400.00).build());
    }
}

package com.microservice.rhfolhadepagamento.feignclient;

import com.microservice.rhfolhadepagamento.local.entity.Funcionario;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;


@Component
@FeignClient(name = "rh-funcionarios", url = "localhost:8001/api",path = "/funcionario")
public interface FuncionarioFeignClient {
    @GetMapping(value = "/{id}")

    ResponseEntity<Funcionario> buscaFuncionarioPorId(@PathVariable Long id);
}

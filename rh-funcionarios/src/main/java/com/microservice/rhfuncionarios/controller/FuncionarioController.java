package com.microservice.rhfuncionarios.controller;

import com.microservice.rhfuncionarios.local.entity.Funcionario;
import com.microservice.rhfuncionarios.local.service.FuncionarioService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/funcionario")
public class FuncionarioController {

    private static Logger logger = LoggerFactory.getLogger(FuncionarioController.class);

    @Autowired
    private Environment env;

    @Autowired
    private FuncionarioService funcionarioService;

    @GetMapping
    public ResponseEntity<List<Funcionario>> buscaTodosFuncionarios() {
        return ResponseEntity.ok(funcionarioService.buscaTodosFuncionarios());
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<Funcionario> buscaFuncionarioPorId(@PathVariable Long id) {

       /* Teste do fallback
       try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }*/

        logger.info("PORT: " + env.getProperty("local.server.port"));

        return ResponseEntity.ok(funcionarioService.buscaFuncionarioPorId(id));
    }
}

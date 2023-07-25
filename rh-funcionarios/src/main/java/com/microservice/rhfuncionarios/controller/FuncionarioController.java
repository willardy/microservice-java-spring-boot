package com.microservice.rhfuncionarios.controller;

import com.microservice.rhfuncionarios.local.entity.Funcionario;
import com.microservice.rhfuncionarios.local.service.FuncionarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/funcionario")
public class FuncionarioController {

    @Autowired
    private FuncionarioService funcionarioService;

    @GetMapping
    public ResponseEntity<List<Funcionario>> buscaTodosFuncionarios() {
        return ResponseEntity.ok(funcionarioService.buscaTodosFuncionarios());
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<Funcionario> buscaFuncionarioPorId(@PathVariable Long id) {
        return ResponseEntity.ok(funcionarioService.buscaFuncionarioPorId(id));
    }
}

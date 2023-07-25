package com.microservice.rhfuncionarios.local.service;

import com.microservice.rhfuncionarios.local.entity.Funcionario;
import com.microservice.rhfuncionarios.local.repository.FuncionarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;
import java.util.List;
import java.util.Optional;

@Service
public class FuncionarioService {

    @Autowired
    private FuncionarioRepository funcionarioRepository;

    public List<Funcionario> buscaTodosFuncionarios() {
        List<Funcionario> listaDeFuncionarios = funcionarioRepository.findAll();
        return listaDeFuncionarios;
    }

    public Funcionario buscaFuncionarioPorId(Long id) {
        Optional<Funcionario> funcionario = funcionarioRepository.findById(id);

        if (funcionario.isPresent()) {
            return funcionario.get();
        } else {
            throw new EntityNotFoundException("Nenhum  funcionário encontrado para id informado");
        }
    }
}

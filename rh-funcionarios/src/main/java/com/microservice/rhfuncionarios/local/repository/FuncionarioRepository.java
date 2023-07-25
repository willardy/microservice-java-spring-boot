package com.microservice.rhfuncionarios.local.repository;

import com.microservice.rhfuncionarios.local.entity.Funcionario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FuncionarioRepository extends JpaRepository<Funcionario, Long> {
}

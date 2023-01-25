package com.group.clinica.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.group.clinica.model.Departamento;

public interface DepartamentoRepository extends JpaRepository<Departamento, String> { }
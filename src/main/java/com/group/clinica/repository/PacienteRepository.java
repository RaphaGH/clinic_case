package com.group.clinica.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.group.clinica.model.Paciente;

public interface PacienteRepository extends JpaRepository<Paciente, String> { }
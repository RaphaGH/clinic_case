package com.group.clinica.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.group.clinica.model.Consultorio;

public interface ConsultorioRepository extends JpaRepository<Consultorio, String> { }
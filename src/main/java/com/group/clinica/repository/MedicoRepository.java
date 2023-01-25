package com.group.clinica.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.group.clinica.model.Medico;

public interface MedicoRepository extends JpaRepository<Medico, String> { }
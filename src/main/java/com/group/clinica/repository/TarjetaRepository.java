package com.group.clinica.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.group.clinica.model.Tarjeta;

public interface TarjetaRepository extends JpaRepository<Tarjeta, String> { }
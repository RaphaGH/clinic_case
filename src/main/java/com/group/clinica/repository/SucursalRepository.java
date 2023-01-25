package com.group.clinica.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.group.clinica.model.Sucursal;

public interface SucursalRepository extends JpaRepository<Sucursal, String> { }
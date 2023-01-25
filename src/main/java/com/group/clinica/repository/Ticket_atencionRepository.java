package com.group.clinica.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.group.clinica.model.Ticket_atencion;

public interface Ticket_atencionRepository extends JpaRepository<Ticket_atencion, String> { }
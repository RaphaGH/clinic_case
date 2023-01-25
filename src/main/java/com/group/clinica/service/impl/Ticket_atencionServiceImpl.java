package com.group.clinica.service.impl;

import java.util.List;
import com.group.clinica.model.*;
import com.group.clinica.exception.*;
import com.group.clinica.repository.*;
import com.group.clinica.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Ticket_atencionServiceImpl implements ITicket_atencionService{

   @Autowired
   private Ticket_atencionRepository repository;

   public List<Ticket_atencion> all() {
      return repository.findAll();
   }

   public Ticket_atencion newTicket_atencion(Ticket_atencion newTicket_atencion) {
      return repository.save(newTicket_atencion);
   }

   public Ticket_atencion one(String id) {
      return repository.findById(id)
      .orElseThrow(() -> new Ticket_atencionNotFoundException(id));
   }

   public Ticket_atencion replaceTicket_atencion(Ticket_atencion newTicket_atencion, String id) {
      return repository.findById(id)
      .map(employee -> {
         return repository.save(employee);
      })
      .orElseGet(() -> {
         newTicket_atencion.setId(id);
         return repository.save(newTicket_atencion);
      });
   }

   public void deleteTicket_atencion(String id) {
      repository.deleteById(id);
   }
}

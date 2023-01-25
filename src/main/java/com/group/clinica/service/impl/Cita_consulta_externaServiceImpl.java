package com.group.clinica.service.impl;

import java.util.List;
import com.group.clinica.model.*;
import com.group.clinica.exception.*;
import com.group.clinica.repository.*;
import com.group.clinica.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Cita_consulta_externaServiceImpl implements ICita_consulta_externaService{

   @Autowired
   private Cita_consulta_externaRepository repository;

   public List<Cita_consulta_externa> all() {
      return repository.findAll();
   }

   public Cita_consulta_externa newCita_consulta_externa(Cita_consulta_externa newCita_consulta_externa) {
      return repository.save(newCita_consulta_externa);
   }

   public Cita_consulta_externa one(String fecha_consulta) {
      return repository.findById(fecha_consulta)
      .orElseThrow(() -> new Cita_consulta_externaNotFoundException(fecha_consulta));
   }

   public Cita_consulta_externa replaceCita_consulta_externa(Cita_consulta_externa newCita_consulta_externa, String fecha_consulta) {
      return repository.findById(fecha_consulta)
      .map(employee -> {
         return repository.save(employee);
      })
      .orElseGet(() -> {
         newCita_consulta_externa.setFecha_consulta(fecha_consulta);
         return repository.save(newCita_consulta_externa);
      });
   }

   public void deleteCita_consulta_externa(String fecha_consulta) {
      repository.deleteById(fecha_consulta);
   }
}

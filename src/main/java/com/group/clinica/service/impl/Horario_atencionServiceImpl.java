package com.group.clinica.service.impl;

import java.util.List;
import com.group.clinica.model.*;
import com.group.clinica.exception.*;
import com.group.clinica.repository.*;
import com.group.clinica.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Horario_atencionServiceImpl implements IHorario_atencionService{

   @Autowired
   private Horario_atencionRepository repository;

   public List<Horario_atencion> all() {
      return repository.findAll();
   }

   public boolean VerificarHorarioDisponible(Horario_atencion newHorario_atencion){
      if(all().contains(newHorario_atencion.getHora_inicio())){
         return false;
      } else {
         return true;
      }
   }

   public Horario_atencion newHorario_atencion(Horario_atencion newHorario_atencion) {
      if(VerificarHorarioDisponible(newHorario_atencion)){
         all().notify();
      }
      return repository.save(newHorario_atencion);
   }

   public Horario_atencion one(String id) {
      return repository.findById(id)
      .orElseThrow(() -> new Horario_atencionNotFoundException(id));
   }

   public Horario_atencion replaceHorario_atencion(Horario_atencion newHorario_atencion, String id) {
      return repository.findById(id)
      .map(employee -> {
         return repository.save(employee);
      })
      .orElseGet(() -> {
         newHorario_atencion.setId(id);
         return repository.save(newHorario_atencion);
      });
   }

   public void deleteHorario_atencion(String id) {
      repository.deleteById(id);
   }
}

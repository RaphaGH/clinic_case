package com.group.clinica.service.impl;

import java.util.List;
import com.group.clinica.model.*;
import com.group.clinica.exception.*;
import com.group.clinica.repository.*;
import com.group.clinica.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ConsultorioServiceImpl implements IConsultorioService{

   @Autowired
   private ConsultorioRepository repository;

   public List<Consultorio> all() {
      return repository.findAll();
   }

   public Consultorio newConsultorio(Consultorio newConsultorio) {
      return repository.save(newConsultorio);
   }

   public Consultorio one(String id) {
      return repository.findById(id)
      .orElseThrow(() -> new ConsultorioNotFoundException(id));
   }

   public Consultorio replaceConsultorio(Consultorio newConsultorio, String id) {
      return repository.findById(id)
      .map(employee -> {
         return repository.save(employee);
      })
      .orElseGet(() -> {
         newConsultorio.setId(id);
         return repository.save(newConsultorio);
      });
   }

   public void deleteConsultorio(String id) {
      repository.deleteById(id);
   }
}

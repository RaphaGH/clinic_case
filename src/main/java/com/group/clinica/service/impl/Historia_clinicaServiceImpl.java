package com.group.clinica.service.impl;

import java.util.List;
import com.group.clinica.model.*;
import com.group.clinica.exception.*;
import com.group.clinica.repository.*;
import com.group.clinica.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Historia_clinicaServiceImpl implements IHistoria_clinicaService{

   @Autowired
   private Historia_clinicaRepository repository;

   public List<Historia_clinica> all() {
      return repository.findAll();
   }

   public Historia_clinica newHistoria_clinica(Historia_clinica newHistoria_clinica) {
      return repository.save(newHistoria_clinica);
   }

   public Historia_clinica one(String fecha_apertura) {
      return repository.findById(fecha_apertura)
      .orElseThrow(() -> new Historia_clinicaNotFoundException(fecha_apertura));
   }

   public Historia_clinica replaceHistoria_clinica(Historia_clinica newHistoria_clinica, String fecha_apertura) {
      return repository.findById(fecha_apertura)
      .map(employee -> {
         return repository.save(employee);
      })
      .orElseGet(() -> {
         newHistoria_clinica.setFecha_apertura(fecha_apertura);
         return repository.save(newHistoria_clinica);
      });
   }

   public void deleteHistoria_clinica(String fecha_apertura) {
      repository.deleteById(fecha_apertura);
   }
}

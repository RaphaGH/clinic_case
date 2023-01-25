package com.group.clinica.service.impl;

import java.util.List;
import com.group.clinica.model.*;
import com.group.clinica.exception.*;
import com.group.clinica.repository.*;
import com.group.clinica.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EnfermeraServiceImpl implements IEnfermeraService{

   @Autowired
   private EnfermeraRepository repository;

   public List<Enfermera> all() {
      return repository.findAll();
   }

   public Enfermera newEnfermera(Enfermera newEnfermera) {
      return repository.save(newEnfermera);
   }

   public Enfermera one(String dni_enfermera) {
      return repository.findById(dni_enfermera)
      .orElseThrow(() -> new EnfermeraNotFoundException(dni_enfermera));
   }

   public Enfermera replaceEnfermera(Enfermera newEnfermera, String dni_enfermera) {
      return repository.findById(dni_enfermera)
      .map(employee -> {
         return repository.save(employee);
      })
      .orElseGet(() -> {
         newEnfermera.setDni_enfermera(dni_enfermera);
         return repository.save(newEnfermera);
      });
   }

   public void deleteEnfermera(String dni_enfermera) {
      repository.deleteById(dni_enfermera);
   }
}

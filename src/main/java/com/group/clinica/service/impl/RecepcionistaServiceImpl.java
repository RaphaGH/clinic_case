package com.group.clinica.service.impl;

import java.util.List;
import com.group.clinica.model.*;
import com.group.clinica.exception.*;
import com.group.clinica.repository.*;
import com.group.clinica.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RecepcionistaServiceImpl implements IRecepcionistaService{

   @Autowired
   private RecepcionistaRepository repository;

   public List<Recepcionista> all() {
      return repository.findAll();
   }

   public Recepcionista newRecepcionista(Recepcionista newRecepcionista) {
      return repository.save(newRecepcionista);
   }

   public Recepcionista one(String dni_recepcionista) {
      return repository.findById(dni_recepcionista)
      .orElseThrow(() -> new RecepcionistaNotFoundException(dni_recepcionista));
   }

   public Recepcionista replaceRecepcionista(Recepcionista newRecepcionista, String dni_recepcionista) {
      return repository.findById(dni_recepcionista)
      .map(employee -> {
         return repository.save(employee);
      })
      .orElseGet(() -> {
         newRecepcionista.setDni_recepcionista(dni_recepcionista);
         return repository.save(newRecepcionista);
      });
   }

   public void deleteRecepcionista(String dni_recepcionista) {
      repository.deleteById(dni_recepcionista);
   }
}

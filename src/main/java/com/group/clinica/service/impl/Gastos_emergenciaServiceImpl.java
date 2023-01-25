package com.group.clinica.service.impl;

import java.util.List;
import com.group.clinica.model.*;
import com.group.clinica.exception.*;
import com.group.clinica.repository.*;
import com.group.clinica.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Gastos_emergenciaServiceImpl implements IGastos_emergenciaService{

   @Autowired
   private Gastos_emergenciaRepository repository;

   public List<Gastos_emergencia> all() {
      return repository.findAll();
   }

   public Gastos_emergencia newGastos_emergencia(Gastos_emergencia newGastos_emergencia) {
      return repository.save(newGastos_emergencia);
   }

   public Gastos_emergencia one(String id) {
      return repository.findById(id)
      .orElseThrow(() -> new Gastos_emergenciaNotFoundException(id));
   }

   public Gastos_emergencia replaceGastos_emergencia(Gastos_emergencia newGastos_emergencia, String id) {
      return repository.findById(id)
      .map(employee -> {
         return repository.save(employee);
      })
      .orElseGet(() -> {
         newGastos_emergencia.setId(id);
         return repository.save(newGastos_emergencia);
      });
   }

   public void deleteGastos_emergencia(String id) {
      repository.deleteById(id);
   }
}

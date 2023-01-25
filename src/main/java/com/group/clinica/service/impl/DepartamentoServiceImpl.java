package com.group.clinica.service.impl;

import java.util.List;
import com.group.clinica.model.*;
import com.group.clinica.exception.*;
import com.group.clinica.repository.*;
import com.group.clinica.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DepartamentoServiceImpl implements IDepartamentoService{

   @Autowired
   private DepartamentoRepository repository;

   public List<Departamento> all() {
      return repository.findAll();
   }

   public Departamento newDepartamento(Departamento newDepartamento) {
      return repository.save(newDepartamento);
   }

   public Departamento one(String id) {
      return repository.findById(id)
      .orElseThrow(() -> new DepartamentoNotFoundException(id));
   }

   public Departamento replaceDepartamento(Departamento newDepartamento, String id) {
      return repository.findById(id)
      .map(employee -> {
         return repository.save(employee);
      })
      .orElseGet(() -> {
         newDepartamento.setId(id);
         return repository.save(newDepartamento);
      });
   }

   public void deleteDepartamento(String id) {
      repository.deleteById(id);
   }
}

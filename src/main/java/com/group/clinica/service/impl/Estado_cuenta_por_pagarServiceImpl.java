package com.group.clinica.service.impl;

import java.util.List;
import com.group.clinica.model.*;
import com.group.clinica.exception.*;
import com.group.clinica.repository.*;
import com.group.clinica.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Estado_cuenta_por_pagarServiceImpl implements IEstado_cuenta_por_pagarService{

   @Autowired
   private Estado_cuenta_por_pagarRepository repository;

   public List<Estado_cuenta_por_pagar> all() {
      return repository.findAll();
   }

   public Estado_cuenta_por_pagar newEstado_cuenta_por_pagar(Estado_cuenta_por_pagar newEstado_cuenta_por_pagar) {
      return repository.save(newEstado_cuenta_por_pagar);
   }

   public Estado_cuenta_por_pagar one(String fecha_cuenta) {
      return repository.findById(fecha_cuenta)
      .orElseThrow(() -> new Estado_cuenta_por_pagarNotFoundException(fecha_cuenta));
   }

   public Estado_cuenta_por_pagar replaceEstado_cuenta_por_pagar(Estado_cuenta_por_pagar newEstado_cuenta_por_pagar, String fecha_cuenta) {
      return repository.findById(fecha_cuenta)
      .map(employee -> {
         return repository.save(employee);
      })
      .orElseGet(() -> {
         newEstado_cuenta_por_pagar.setFecha_cuenta(fecha_cuenta);
         return repository.save(newEstado_cuenta_por_pagar);
      });
   }

   public void deleteEstado_cuenta_por_pagar(String fecha_cuenta) {
      repository.deleteById(fecha_cuenta);
   }
}

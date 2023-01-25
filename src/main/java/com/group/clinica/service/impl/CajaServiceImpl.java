package com.group.clinica.service.impl;

import java.util.List;
import com.group.clinica.model.*;
import com.group.clinica.exception.*;
import com.group.clinica.repository.*;
import com.group.clinica.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CajaServiceImpl implements ICajaService{

   @Autowired
   private CajaRepository repository;

   public List<Caja> all() {
      return repository.findAll();
   }

   public Caja newCaja(Caja newCaja) {
      return repository.save(newCaja);
   }

   public Caja one(String id) {
      return repository.findById(id)
      .orElseThrow(() -> new CajaNotFoundException(id));
   }

   public Caja replaceCaja(Caja newCaja, String id) {
      return repository.findById(id)
      .map(employee -> {
         return repository.save(employee);
      })
      .orElseGet(() -> {
         newCaja.setId(id);
         return repository.save(newCaja);
      });
   }

   public void deleteCaja(String id) {
      repository.deleteById(id);
   }
}

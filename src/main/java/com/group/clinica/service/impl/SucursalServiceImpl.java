package com.group.clinica.service.impl;

import java.util.List;
import com.group.clinica.model.*;
import com.group.clinica.exception.*;
import com.group.clinica.repository.*;
import com.group.clinica.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SucursalServiceImpl implements ISucursalService{

   @Autowired
   private SucursalRepository repository;

   public List<Sucursal> all() {
      return repository.findAll();
   }

   public Sucursal newSucursal(Sucursal newSucursal) {
      return repository.save(newSucursal);
   }

   public Sucursal one(String id) {
      return repository.findById(id)
      .orElseThrow(() -> new SucursalNotFoundException(id));
   }

   public Sucursal replaceSucursal(Sucursal newSucursal, String id) {
      return repository.findById(id)
      .map(employee -> {
         return repository.save(employee);
      })
      .orElseGet(() -> {
         newSucursal.setId(id);
         return repository.save(newSucursal);
      });
   }

   public void deleteSucursal(String id) {
      repository.deleteById(id);
   }
}

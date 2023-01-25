package com.group.clinica.service.impl;

import java.util.List;
import com.group.clinica.model.*;
import com.group.clinica.exception.*;
import com.group.clinica.repository.*;
import com.group.clinica.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TarjetaServiceImpl implements ITarjetaService{

   @Autowired
   private TarjetaRepository repository;

   public List<Tarjeta> all() {
      return repository.findAll();
   }

   public Tarjeta newTarjeta(Tarjeta newTarjeta) {
      return repository.save(newTarjeta);
   }

   public Tarjeta one(String fecha_vencimiento) {
      return repository.findById(fecha_vencimiento)
      .orElseThrow(() -> new TarjetaNotFoundException(fecha_vencimiento));
   }

   public Tarjeta replaceTarjeta(Tarjeta newTarjeta, String fecha_vencimiento) {
      return repository.findById(fecha_vencimiento)
      .map(employee -> {
         return repository.save(employee);
      })
      .orElseGet(() -> {
         newTarjeta.setFecha_vencimiento(fecha_vencimiento);
         return repository.save(newTarjeta);
      });
   }

   public void deleteTarjeta(String fecha_vencimiento) {
      repository.deleteById(fecha_vencimiento);
   }
}

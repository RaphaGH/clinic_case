package com.group.clinica.service.impl;

import java.util.List;
import com.group.clinica.model.*;
import com.group.clinica.exception.*;
import com.group.clinica.repository.*;
import com.group.clinica.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Comprobante_pagoServiceImpl implements IComprobante_pagoService{

   @Autowired
   private Comprobante_pagoRepository repository;

   public List<Comprobante_pago> all() {
      return repository.findAll();
   }

   public Comprobante_pago newComprobante_pago(Comprobante_pago newComprobante_pago) {
      return repository.save(newComprobante_pago);
   }

   public Comprobante_pago one(String fecha_pago) {
      return repository.findById(fecha_pago)
      .orElseThrow(() -> new Comprobante_pagoNotFoundException(fecha_pago));
   }

   public Comprobante_pago replaceComprobante_pago(Comprobante_pago newComprobante_pago, String fecha_pago) {
      return repository.findById(fecha_pago)
      .map(employee -> {
         return repository.save(employee);
      })
      .orElseGet(() -> {
         newComprobante_pago.setFecha_pago(fecha_pago);
         return repository.save(newComprobante_pago);
      });
   }

   public void deleteComprobante_pago(String fecha_pago) {
      repository.deleteById(fecha_pago);
   }
}

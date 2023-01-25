package com.group.clinica.service.impl;

import java.util.List;
import com.group.clinica.model.*;
import com.group.clinica.exception.*;
import com.group.clinica.repository.*;
import com.group.clinica.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Concepto_pagoServiceImpl implements IConcepto_pagoService{

   @Autowired
   private Concepto_pagoRepository repository;

   public List<Concepto_pago> all() {
      return repository.findAll();
   }

   public Concepto_pago newConcepto_pago(Concepto_pago newConcepto_pago) {
      return repository.save(newConcepto_pago);
   }

   public Concepto_pago one(String id) {
      return repository.findById(id)
      .orElseThrow(() -> new Concepto_pagoNotFoundException(id));
   }

   public Concepto_pago replaceConcepto_pago(Concepto_pago newConcepto_pago, String id) {
      return repository.findById(id)
      .map(employee -> {
         return repository.save(employee);
      })
      .orElseGet(() -> {
         newConcepto_pago.setId(id);
         return repository.save(newConcepto_pago);
      });
   }

   public void deleteConcepto_pago(String id) {
      repository.deleteById(id);
   }
}

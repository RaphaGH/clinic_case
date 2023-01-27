package com.group.clinica.service.impl;

import java.util.List;
import com.group.clinica.model.*;
import com.group.clinica.exception.*;
import com.group.clinica.repository.*;
import com.group.clinica.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Deuda_pagarServiceImpl implements IDeuda_pagarService{

   @Autowired
   private Deuda_pagarRepository repository;

   public List<Deuda_pagar> all() {
      return repository.findAll();
   }

   public Deuda_pagar newDeuda_pagar(Deuda_pagar newDeuda_pagar) {
      return repository.save(newDeuda_pagar);
   }

   public Deuda_pagar one(String id) {
      return repository.findById(id)
      .orElseThrow(() -> new Deuda_pagarNotFoundException(id));
   }

   public boolean comprobarDeudaPagada(Deuda_pagar newDeuda_pagar){
      if(all().contains(newDeuda_pagar.getId())){
         return true;
      } else {
         return false;
      }
   }
   public Deuda_pagar replaceDeuda_pagar(Deuda_pagar newDeuda_pagar, String id) {
      if(comprobarDeudaPagada(newDeuda_pagar)){
         all().notify();
      }
      return repository.findById(id)
              .map(employee -> {
                 return repository.save(employee);
              })
              .orElseGet(() -> {
                 newDeuda_pagar.setId(id);
                 return repository.save(newDeuda_pagar);
              });
   }




   public void deleteDeuda_pagar(String id) {
      repository.deleteById(id);
   }
}

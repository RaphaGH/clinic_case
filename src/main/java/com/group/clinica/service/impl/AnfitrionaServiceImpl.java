package com.group.clinica.service.impl;

import java.util.List;
import com.group.clinica.model.*;
import com.group.clinica.exception.*;
import com.group.clinica.repository.*;
import com.group.clinica.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AnfitrionaServiceImpl implements IAnfitrionaService{

   @Autowired
   private AnfitrionaRepository repository;

   public List<Anfitriona> all() {
      return repository.findAll();
   }

   public Anfitriona newAnfitriona(Anfitriona newAnfitriona) {
      return repository.save(newAnfitriona);
   }

   public Anfitriona one(String dni_anfitriona) {
      return repository.findById(dni_anfitriona)
      .orElseThrow(() -> new AnfitrionaNotFoundException(dni_anfitriona));
   }

   public Anfitriona replaceAnfitriona(Anfitriona newAnfitriona, String dni_anfitriona) {
      return repository.findById(dni_anfitriona)
      .map(employee -> {
         return repository.save(employee);
      })
      .orElseGet(() -> {
         newAnfitriona.setDni_anfitriona(dni_anfitriona);
         return repository.save(newAnfitriona);
      });
   }

   public void deleteAnfitriona(String dni_anfitriona) {
      repository.deleteById(dni_anfitriona);
   }
}

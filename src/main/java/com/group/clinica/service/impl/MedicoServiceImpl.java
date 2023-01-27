package com.group.clinica.service.impl;

import java.util.List;
import com.group.clinica.model.*;
import com.group.clinica.exception.*;
import com.group.clinica.repository.*;
import com.group.clinica.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class  MedicoServiceImpl implements IMedicoService{

   @Autowired
   private MedicoRepository repository;

   public List<Medico> all() {
      return repository.findAll();
   }

   public Medico newMedico(Medico newMedico) {
      return repository.save(newMedico);
   }

   public Medico one(String dni_medico) {
      return repository.findById(dni_medico)
      .orElseThrow(() -> new MedicoNotFoundException(dni_medico));
   }

   public Medico replaceMedico(Medico newMedico, String dni_medico) {
      return repository.findById(dni_medico)
      .map(employee -> {
         return repository.save(employee);
      })
      .orElseGet(() -> {
         newMedico.setDni_medico(dni_medico);
         return repository.save(newMedico);
      });
   }

   public void deleteMedico(String dni_medico) {
      repository.deleteById(dni_medico);
   }
}

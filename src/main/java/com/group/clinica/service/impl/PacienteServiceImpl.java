package com.group.clinica.service.impl;

import java.util.List;
import com.group.clinica.model.*;
import com.group.clinica.exception.*;
import com.group.clinica.repository.*;
import com.group.clinica.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PacienteServiceImpl implements IPacienteService{

   @Autowired
   private PacienteRepository repository;

   public List<Paciente> all() {
      return repository.findAll();
   }

   public Paciente newPaciente(Paciente newPaciente) {
      return repository.save(newPaciente);
   }

   public Paciente one(String fecha_nacimiento) {
      return repository.findById(fecha_nacimiento)
      .orElseThrow(() -> new PacienteNotFoundException(fecha_nacimiento));
   }

   public Paciente replacePaciente(Paciente newPaciente, String fecha_nacimiento) {
      return repository.findById(fecha_nacimiento)
      .map(employee -> {
         return repository.save(employee);
      })
      .orElseGet(() -> {
         newPaciente.setFecha_nacimiento(fecha_nacimiento);
         return repository.save(newPaciente);
      });
   }

   public void deletePaciente(String fecha_nacimiento) {
      repository.deleteById(fecha_nacimiento);
   }
}

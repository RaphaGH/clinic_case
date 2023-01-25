package com.group.clinica.service.impl;

import java.util.List;
import com.group.clinica.model.*;
import com.group.clinica.exception.*;
import com.group.clinica.repository.*;
import com.group.clinica.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Orden_atencion_emergenciaServiceImpl implements IOrden_atencion_emergenciaService{

   @Autowired
   private Orden_atencion_emergenciaRepository repository;

   public List<Orden_atencion_emergencia> all() {
      return repository.findAll();
   }

   public Orden_atencion_emergencia newOrden_atencion_emergencia(Orden_atencion_emergencia newOrden_atencion_emergencia) {
      return repository.save(newOrden_atencion_emergencia);
   }

   public Orden_atencion_emergencia one(String fecha_atencion) {
      return repository.findById(fecha_atencion)
      .orElseThrow(() -> new Orden_atencion_emergenciaNotFoundException(fecha_atencion));
   }

   public Orden_atencion_emergencia replaceOrden_atencion_emergencia(Orden_atencion_emergencia newOrden_atencion_emergencia, String fecha_atencion) {
      return repository.findById(fecha_atencion)
      .map(employee -> {
         return repository.save(employee);
      })
      .orElseGet(() -> {
         newOrden_atencion_emergencia.setFecha_atencion(fecha_atencion);
         return repository.save(newOrden_atencion_emergencia);
      });
   }

   public void deleteOrden_atencion_emergencia(String fecha_atencion) {
      repository.deleteById(fecha_atencion);
   }
}

package com.group.clinica.service.impl;

import java.util.List;
import com.group.clinica.model.*;
import com.group.clinica.exception.*;
import com.group.clinica.repository.*;
import com.group.clinica.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Detalle_orden_atencion_emergenciaServiceImpl implements IDetalle_orden_atencion_emergenciaService{

   @Autowired
   private Detalle_orden_atencion_emergenciaRepository repository;

   public List<Detalle_orden_atencion_emergencia> all() {
      return repository.findAll();
   }

   public Detalle_orden_atencion_emergencia newDetalle_orden_atencion_emergencia(Detalle_orden_atencion_emergencia newDetalle_orden_atencion_emergencia) {
      return repository.save(newDetalle_orden_atencion_emergencia);
   }

   public Detalle_orden_atencion_emergencia one(String fecha_atencion) {
      return repository.findById(fecha_atencion)
      .orElseThrow(() -> new Detalle_orden_atencion_emergenciaNotFoundException(fecha_atencion));
   }

   public Detalle_orden_atencion_emergencia replaceDetalle_orden_atencion_emergencia(Detalle_orden_atencion_emergencia newDetalle_orden_atencion_emergencia, String fecha_atencion) {
      return repository.findById(fecha_atencion)
      .map(employee -> {
         return repository.save(employee);
      })
      .orElseGet(() -> {
         newDetalle_orden_atencion_emergencia.setFecha_atencion(fecha_atencion);
         return repository.save(newDetalle_orden_atencion_emergencia);
      });
   }

   public void deleteDetalle_orden_atencion_emergencia(String fecha_atencion) {
      repository.deleteById(fecha_atencion);
   }
}

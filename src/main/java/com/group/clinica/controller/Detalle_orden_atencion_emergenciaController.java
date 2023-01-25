package com.group.clinica.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.group.clinica.model.Detalle_orden_atencion_emergencia;
import com.group.clinica.service.IDetalle_orden_atencion_emergenciaService;

@RestController
@RequestMapping("/api/v1/detalle_orden_atencion_emergencia")
public class Detalle_orden_atencion_emergenciaController {

   @Autowired
   private IDetalle_orden_atencion_emergenciaService detalle_orden_atencion_emergenciaService;

   @PostMapping
   public ResponseEntity<Detalle_orden_atencion_emergencia> crearRecurso(@RequestBody Detalle_orden_atencion_emergencia newdetalle_orden_atencion_emergencia) {
      return new ResponseEntity<>(detalle_orden_atencion_emergenciaService.newDetalle_orden_atencion_emergencia(newdetalle_orden_atencion_emergencia), HttpStatus.CREATED);
   }

   @GetMapping
   public ResponseEntity<Detalle_orden_atencion_emergencia> obtenerRecurso(@RequestParam String fecha_atencion) {
      return new ResponseEntity<>(detalle_orden_atencion_emergenciaService.one(fecha_atencion), HttpStatus.OK);
   }

   @GetMapping("/")
   public ResponseEntity<List<Detalle_orden_atencion_emergencia>> obtenerTodosLosRecurso() {
      return new ResponseEntity<>(detalle_orden_atencion_emergenciaService.all(), HttpStatus.OK);
   }

   @PutMapping
   public ResponseEntity<Detalle_orden_atencion_emergencia> actualizarRecurso(@RequestBody Detalle_orden_atencion_emergencia detalle_orden_atencion_emergencia, @RequestParam String fecha_atencion) {
      return new ResponseEntity<>(detalle_orden_atencion_emergenciaService.replaceDetalle_orden_atencion_emergencia(detalle_orden_atencion_emergencia, fecha_atencion), HttpStatus.OK);
   }

   @DeleteMapping
   public ResponseEntity<String> eliminarRecurso(@RequestParam String fecha_atencion) {
      detalle_orden_atencion_emergenciaService.deleteDetalle_orden_atencion_emergencia(fecha_atencion);
      return new ResponseEntity<>("Recurso eliminado", HttpStatus.NO_CONTENT);
   }

}

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
import com.group.clinica.model.Orden_atencion_emergencia;
import com.group.clinica.service.IOrden_atencion_emergenciaService;

@RestController
@RequestMapping("/api/v1/orden_atencion_emergencia")
public class Orden_atencion_emergenciaController {

   @Autowired
   private IOrden_atencion_emergenciaService orden_atencion_emergenciaService;

   @PostMapping
   public ResponseEntity<Orden_atencion_emergencia> crearRecurso(@RequestBody Orden_atencion_emergencia neworden_atencion_emergencia) {
      return new ResponseEntity<>(orden_atencion_emergenciaService.newOrden_atencion_emergencia(neworden_atencion_emergencia), HttpStatus.CREATED);
   }

   @GetMapping
   public ResponseEntity<Orden_atencion_emergencia> obtenerRecurso(@RequestParam String fecha_atencion) {
      return new ResponseEntity<>(orden_atencion_emergenciaService.one(fecha_atencion), HttpStatus.OK);
   }

   @GetMapping("/")
   public ResponseEntity<List<Orden_atencion_emergencia>> obtenerTodosLosRecurso() {
      return new ResponseEntity<>(orden_atencion_emergenciaService.all(), HttpStatus.OK);
   }

   @PutMapping
   public ResponseEntity<Orden_atencion_emergencia> actualizarRecurso(@RequestBody Orden_atencion_emergencia orden_atencion_emergencia, @RequestParam String fecha_atencion) {
      return new ResponseEntity<>(orden_atencion_emergenciaService.replaceOrden_atencion_emergencia(orden_atencion_emergencia, fecha_atencion), HttpStatus.OK);
   }

   @DeleteMapping
   public ResponseEntity<String> eliminarRecurso(@RequestParam String fecha_atencion) {
      orden_atencion_emergenciaService.deleteOrden_atencion_emergencia(fecha_atencion);
      return new ResponseEntity<>("Recurso eliminado", HttpStatus.NO_CONTENT);
   }

}

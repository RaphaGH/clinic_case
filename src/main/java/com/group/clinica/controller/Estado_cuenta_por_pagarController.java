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
import com.group.clinica.model.Estado_cuenta_por_pagar;
import com.group.clinica.service.IEstado_cuenta_por_pagarService;

@RestController
@RequestMapping("/api/v1/estado_cuenta_por_pagar")
public class Estado_cuenta_por_pagarController {

   @Autowired
   private IEstado_cuenta_por_pagarService estado_cuenta_por_pagarService;

   @PostMapping
   public ResponseEntity<Estado_cuenta_por_pagar> crearRecurso(@RequestBody Estado_cuenta_por_pagar newestado_cuenta_por_pagar) {
      return new ResponseEntity<>(estado_cuenta_por_pagarService.newEstado_cuenta_por_pagar(newestado_cuenta_por_pagar), HttpStatus.CREATED);
   }

   @GetMapping
   public ResponseEntity<Estado_cuenta_por_pagar> obtenerRecurso(@RequestParam String fecha_cuenta) {
      return new ResponseEntity<>(estado_cuenta_por_pagarService.one(fecha_cuenta), HttpStatus.OK);
   }

   @GetMapping("/")
   public ResponseEntity<List<Estado_cuenta_por_pagar>> obtenerTodosLosRecurso() {
      return new ResponseEntity<>(estado_cuenta_por_pagarService.all(), HttpStatus.OK);
   }

   @PutMapping
   public ResponseEntity<Estado_cuenta_por_pagar> actualizarRecurso(@RequestBody Estado_cuenta_por_pagar estado_cuenta_por_pagar, @RequestParam String fecha_cuenta) {
      return new ResponseEntity<>(estado_cuenta_por_pagarService.replaceEstado_cuenta_por_pagar(estado_cuenta_por_pagar, fecha_cuenta), HttpStatus.OK);
   }

   @DeleteMapping
   public ResponseEntity<String> eliminarRecurso(@RequestParam String fecha_cuenta) {
      estado_cuenta_por_pagarService.deleteEstado_cuenta_por_pagar(fecha_cuenta);
      return new ResponseEntity<>("Recurso eliminado", HttpStatus.NO_CONTENT);
   }

}

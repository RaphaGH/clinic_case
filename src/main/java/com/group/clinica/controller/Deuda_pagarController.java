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
import com.group.clinica.model.Deuda_pagar;
import com.group.clinica.service.IDeuda_pagarService;

@RestController
@RequestMapping("/api/v1/deuda_pagar")
public class Deuda_pagarController {

   @Autowired
   private IDeuda_pagarService deuda_pagarService;

   @PostMapping
   public ResponseEntity<Deuda_pagar> crearRecurso(@RequestBody Deuda_pagar newdeuda_pagar) {
      return new ResponseEntity<>(deuda_pagarService.newDeuda_pagar(newdeuda_pagar), HttpStatus.CREATED);
   }

   @GetMapping
   public ResponseEntity<Deuda_pagar> obtenerRecurso(@RequestParam String id) {
      return new ResponseEntity<>(deuda_pagarService.one(id), HttpStatus.OK);
   }

   @GetMapping("/")
   public ResponseEntity<List<Deuda_pagar>> obtenerTodosLosRecurso() {
      return new ResponseEntity<>(deuda_pagarService.all(), HttpStatus.OK);
   }

   @PutMapping
   public ResponseEntity<Deuda_pagar> actualizarRecurso(@RequestBody Deuda_pagar deuda_pagar, @RequestParam String id) {
      return new ResponseEntity<>(deuda_pagarService.replaceDeuda_pagar(deuda_pagar, id), HttpStatus.OK);
   }

   @DeleteMapping
   public ResponseEntity<String> eliminarRecurso(@RequestParam String id) {
      deuda_pagarService.deleteDeuda_pagar(id);
      return new ResponseEntity<>("Recurso eliminado", HttpStatus.NO_CONTENT);
   }

}

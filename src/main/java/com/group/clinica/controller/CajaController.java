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
import com.group.clinica.model.Caja;
import com.group.clinica.service.ICajaService;

@RestController
@RequestMapping("/api/v1/caja")
public class CajaController {

   @Autowired
   private ICajaService cajaService;

   @PostMapping
   public ResponseEntity<Caja> crearRecurso(@RequestBody Caja newcaja) {
      return new ResponseEntity<>(cajaService.newCaja(newcaja), HttpStatus.CREATED);
   }

   @GetMapping
   public ResponseEntity<Caja> obtenerRecurso(@RequestParam String id) {
      return new ResponseEntity<>(cajaService.one(id), HttpStatus.OK);
   }

   @GetMapping("/")
   public ResponseEntity<List<Caja>> obtenerTodosLosRecurso() {
      return new ResponseEntity<>(cajaService.all(), HttpStatus.OK);
   }

   @PutMapping
   public ResponseEntity<Caja> actualizarRecurso(@RequestBody Caja caja, @RequestParam String id) {
      return new ResponseEntity<>(cajaService.replaceCaja(caja, id), HttpStatus.OK);
   }

   @DeleteMapping
   public ResponseEntity<String> eliminarRecurso(@RequestParam String id) {
      cajaService.deleteCaja(id);
      return new ResponseEntity<>("Recurso eliminado", HttpStatus.NO_CONTENT);
   }

}

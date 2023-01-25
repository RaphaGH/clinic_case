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
import com.group.clinica.model.Recepcionista;
import com.group.clinica.service.IRecepcionistaService;

@RestController
@RequestMapping("/api/v1/recepcionista")
public class RecepcionistaController {

   @Autowired
   private IRecepcionistaService recepcionistaService;

   @PostMapping
   public ResponseEntity<Recepcionista> crearRecurso(@RequestBody Recepcionista newrecepcionista) {
      return new ResponseEntity<>(recepcionistaService.newRecepcionista(newrecepcionista), HttpStatus.CREATED);
   }

   @GetMapping
   public ResponseEntity<Recepcionista> obtenerRecurso(@RequestParam String dni_recepcionista) {
      return new ResponseEntity<>(recepcionistaService.one(dni_recepcionista), HttpStatus.OK);
   }

   @GetMapping("/")
   public ResponseEntity<List<Recepcionista>> obtenerTodosLosRecurso() {
      return new ResponseEntity<>(recepcionistaService.all(), HttpStatus.OK);
   }

   @PutMapping
   public ResponseEntity<Recepcionista> actualizarRecurso(@RequestBody Recepcionista recepcionista, @RequestParam String dni_recepcionista) {
      return new ResponseEntity<>(recepcionistaService.replaceRecepcionista(recepcionista, dni_recepcionista), HttpStatus.OK);
   }

   @DeleteMapping
   public ResponseEntity<String> eliminarRecurso(@RequestParam String dni_recepcionista) {
      recepcionistaService.deleteRecepcionista(dni_recepcionista);
      return new ResponseEntity<>("Recurso eliminado", HttpStatus.NO_CONTENT);
   }

}

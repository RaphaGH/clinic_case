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
import com.group.clinica.model.Consultorio;
import com.group.clinica.service.IConsultorioService;

@RestController
@RequestMapping("/api/v1/consultorio")
public class ConsultorioController {

   @Autowired
   private IConsultorioService consultorioService;

   @PostMapping
   public ResponseEntity<Consultorio> crearRecurso(@RequestBody Consultorio newconsultorio) {
      return new ResponseEntity<>(consultorioService.newConsultorio(newconsultorio), HttpStatus.CREATED);
   }

   @GetMapping
   public ResponseEntity<Consultorio> obtenerRecurso(@RequestParam String id) {
      return new ResponseEntity<>(consultorioService.one(id), HttpStatus.OK);
   }

   @GetMapping("/")
   public ResponseEntity<List<Consultorio>> obtenerTodosLosRecurso() {
      return new ResponseEntity<>(consultorioService.all(), HttpStatus.OK);
   }

   @PutMapping
   public ResponseEntity<Consultorio> actualizarRecurso(@RequestBody Consultorio consultorio, @RequestParam String id) {
      return new ResponseEntity<>(consultorioService.replaceConsultorio(consultorio, id), HttpStatus.OK);
   }

   @DeleteMapping
   public ResponseEntity<String> eliminarRecurso(@RequestParam String id) {
      consultorioService.deleteConsultorio(id);
      return new ResponseEntity<>("Recurso eliminado", HttpStatus.NO_CONTENT);
   }

}

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
import com.group.clinica.model.Cita_consulta_externa;
import com.group.clinica.service.ICita_consulta_externaService;

@RestController
@RequestMapping("/api/v1/cita_consulta_externa")
public class Cita_consulta_externaController {

   @Autowired
   private ICita_consulta_externaService cita_consulta_externaService;

   @PostMapping
   public ResponseEntity<Cita_consulta_externa> crearRecurso(@RequestBody Cita_consulta_externa newcita_consulta_externa) {
      return new ResponseEntity<>(cita_consulta_externaService.newCita_consulta_externa(newcita_consulta_externa), HttpStatus.CREATED);
   }

   @GetMapping
   public ResponseEntity<Cita_consulta_externa> obtenerRecurso(@RequestParam String fecha_consulta) {
      return new ResponseEntity<>(cita_consulta_externaService.one(fecha_consulta), HttpStatus.OK);
   }

   @GetMapping("/")
   public ResponseEntity<List<Cita_consulta_externa>> obtenerTodosLosRecurso() {
      return new ResponseEntity<>(cita_consulta_externaService.all(), HttpStatus.OK);
   }

   @PutMapping
   public ResponseEntity<Cita_consulta_externa> actualizarRecurso(@RequestBody Cita_consulta_externa cita_consulta_externa, @RequestParam String fecha_consulta) {
      return new ResponseEntity<>(cita_consulta_externaService.replaceCita_consulta_externa(cita_consulta_externa, fecha_consulta), HttpStatus.OK);
   }

   @DeleteMapping
   public ResponseEntity<String> eliminarRecurso(@RequestParam String fecha_consulta) {
      cita_consulta_externaService.deleteCita_consulta_externa(fecha_consulta);
      return new ResponseEntity<>("Recurso eliminado", HttpStatus.NO_CONTENT);
   }

}

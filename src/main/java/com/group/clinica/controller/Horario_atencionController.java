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
import com.group.clinica.model.Horario_atencion;
import com.group.clinica.service.IHorario_atencionService;

@RestController
@RequestMapping("/api/v1/horario_atencion")
public class Horario_atencionController {

   @Autowired
   private IHorario_atencionService horario_atencionService;

   @PostMapping
   public ResponseEntity<Horario_atencion> crearRecurso(@RequestBody Horario_atencion newhorario_atencion) {
      return new ResponseEntity<>(horario_atencionService.newHorario_atencion(newhorario_atencion), HttpStatus.CREATED);
   }

   @GetMapping
   public ResponseEntity<Horario_atencion> obtenerRecurso(@RequestParam String id) {
      return new ResponseEntity<>(horario_atencionService.one(id), HttpStatus.OK);
   }

   @GetMapping("/")
   public ResponseEntity<List<Horario_atencion>> obtenerTodosLosRecurso() {
      return new ResponseEntity<>(horario_atencionService.all(), HttpStatus.OK);
   }

   @PutMapping
   public ResponseEntity<Horario_atencion> actualizarRecurso(@RequestBody Horario_atencion horario_atencion, @RequestParam String id) {
      return new ResponseEntity<>(horario_atencionService.replaceHorario_atencion(horario_atencion, id), HttpStatus.OK);
   }

   @DeleteMapping
   public ResponseEntity<String> eliminarRecurso(@RequestParam String id) {
      horario_atencionService.deleteHorario_atencion(id);
      return new ResponseEntity<>("Recurso eliminado", HttpStatus.NO_CONTENT);
   }

}

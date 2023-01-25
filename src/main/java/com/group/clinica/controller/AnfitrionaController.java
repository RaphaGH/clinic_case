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
import com.group.clinica.model.Anfitriona;
import com.group.clinica.service.IAnfitrionaService;

@RestController
@RequestMapping("/api/v1/anfitriona")
public class AnfitrionaController {

   @Autowired
   private IAnfitrionaService anfitrionaService;

   @PostMapping
   public ResponseEntity<Anfitriona> crearRecurso(@RequestBody Anfitriona newanfitriona) {
      return new ResponseEntity<>(anfitrionaService.newAnfitriona(newanfitriona), HttpStatus.CREATED);
   }

   @GetMapping
   public ResponseEntity<Anfitriona> obtenerRecurso(@RequestParam String dni_anfitriona) {
      return new ResponseEntity<>(anfitrionaService.one(dni_anfitriona), HttpStatus.OK);
   }

   @GetMapping("/")
   public ResponseEntity<List<Anfitriona>> obtenerTodosLosRecurso() {
      return new ResponseEntity<>(anfitrionaService.all(), HttpStatus.OK);
   }

   @PutMapping
   public ResponseEntity<Anfitriona> actualizarRecurso(@RequestBody Anfitriona anfitriona, @RequestParam String dni_anfitriona) {
      return new ResponseEntity<>(anfitrionaService.replaceAnfitriona(anfitriona, dni_anfitriona), HttpStatus.OK);
   }

   @DeleteMapping
   public ResponseEntity<String> eliminarRecurso(@RequestParam String dni_anfitriona) {
      anfitrionaService.deleteAnfitriona(dni_anfitriona);
      return new ResponseEntity<>("Recurso eliminado", HttpStatus.NO_CONTENT);
   }

}

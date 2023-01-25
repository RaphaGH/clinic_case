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
import com.group.clinica.model.Historia_clinica;
import com.group.clinica.service.IHistoria_clinicaService;

@RestController
@RequestMapping("/api/v1/historia_clinica")
public class Historia_clinicaController {

   @Autowired
   private IHistoria_clinicaService historia_clinicaService;

   @PostMapping
   public ResponseEntity<Historia_clinica> crearRecurso(@RequestBody Historia_clinica newhistoria_clinica) {
      return new ResponseEntity<>(historia_clinicaService.newHistoria_clinica(newhistoria_clinica), HttpStatus.CREATED);
   }

   @GetMapping
   public ResponseEntity<Historia_clinica> obtenerRecurso(@RequestParam String fecha_apertura) {
      return new ResponseEntity<>(historia_clinicaService.one(fecha_apertura), HttpStatus.OK);
   }

   @GetMapping("/")
   public ResponseEntity<List<Historia_clinica>> obtenerTodosLosRecurso() {
      return new ResponseEntity<>(historia_clinicaService.all(), HttpStatus.OK);
   }

   @PutMapping
   public ResponseEntity<Historia_clinica> actualizarRecurso(@RequestBody Historia_clinica historia_clinica, @RequestParam String fecha_apertura) {
      return new ResponseEntity<>(historia_clinicaService.replaceHistoria_clinica(historia_clinica, fecha_apertura), HttpStatus.OK);
   }

   @DeleteMapping
   public ResponseEntity<String> eliminarRecurso(@RequestParam String fecha_apertura) {
      historia_clinicaService.deleteHistoria_clinica(fecha_apertura);
      return new ResponseEntity<>("Recurso eliminado", HttpStatus.NO_CONTENT);
   }

}

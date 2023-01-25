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
import com.group.clinica.model.Enfermera;
import com.group.clinica.service.IEnfermeraService;

@RestController
@RequestMapping("/api/v1/enfermera")
public class EnfermeraController {

   @Autowired
   private IEnfermeraService enfermeraService;

   @PostMapping
   public ResponseEntity<Enfermera> crearRecurso(@RequestBody Enfermera newenfermera) {
      return new ResponseEntity<>(enfermeraService.newEnfermera(newenfermera), HttpStatus.CREATED);
   }

   @GetMapping
   public ResponseEntity<Enfermera> obtenerRecurso(@RequestParam String dni_enfermera) {
      return new ResponseEntity<>(enfermeraService.one(dni_enfermera), HttpStatus.OK);
   }

   @GetMapping("/")
   public ResponseEntity<List<Enfermera>> obtenerTodosLosRecurso() {
      return new ResponseEntity<>(enfermeraService.all(), HttpStatus.OK);
   }

   @PutMapping
   public ResponseEntity<Enfermera> actualizarRecurso(@RequestBody Enfermera enfermera, @RequestParam String dni_enfermera) {
      return new ResponseEntity<>(enfermeraService.replaceEnfermera(enfermera, dni_enfermera), HttpStatus.OK);
   }

   @DeleteMapping
   public ResponseEntity<String> eliminarRecurso(@RequestParam String dni_enfermera) {
      enfermeraService.deleteEnfermera(dni_enfermera);
      return new ResponseEntity<>("Recurso eliminado", HttpStatus.NO_CONTENT);
   }

}

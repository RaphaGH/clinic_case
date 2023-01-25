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
import com.group.clinica.model.Paciente;
import com.group.clinica.service.IPacienteService;

@RestController
@RequestMapping("/api/v1/paciente")
public class PacienteController {

   @Autowired
   private IPacienteService pacienteService;

   @PostMapping
   public ResponseEntity<Paciente> crearRecurso(@RequestBody Paciente newpaciente) {
      return new ResponseEntity<>(pacienteService.newPaciente(newpaciente), HttpStatus.CREATED);
   }

   @GetMapping
   public ResponseEntity<Paciente> obtenerRecurso(@RequestParam String fecha_nacimiento) {
      return new ResponseEntity<>(pacienteService.one(fecha_nacimiento), HttpStatus.OK);
   }

   @GetMapping("/")
   public ResponseEntity<List<Paciente>> obtenerTodosLosRecurso() {
      return new ResponseEntity<>(pacienteService.all(), HttpStatus.OK);
   }

   @PutMapping
   public ResponseEntity<Paciente> actualizarRecurso(@RequestBody Paciente paciente, @RequestParam String fecha_nacimiento) {
      return new ResponseEntity<>(pacienteService.replacePaciente(paciente, fecha_nacimiento), HttpStatus.OK);
   }

   @DeleteMapping
   public ResponseEntity<String> eliminarRecurso(@RequestParam String fecha_nacimiento) {
      pacienteService.deletePaciente(fecha_nacimiento);
      return new ResponseEntity<>("Recurso eliminado", HttpStatus.NO_CONTENT);
   }

}

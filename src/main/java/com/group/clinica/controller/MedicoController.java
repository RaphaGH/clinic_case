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
import com.group.clinica.model.Medico;
import com.group.clinica.service.IMedicoService;

@RestController
@RequestMapping("/api/v1/medico")
public class MedicoController {

   @Autowired
   private IMedicoService medicoService;

   @PostMapping
   public ResponseEntity<Medico> crearRecurso(@RequestBody Medico newmedico) {
      return new ResponseEntity<>(medicoService.newMedico(newmedico), HttpStatus.CREATED);
   }

   @GetMapping
   public ResponseEntity<Medico> obtenerRecurso(@RequestParam String dni_medico) {
      return new ResponseEntity<>(medicoService.one(dni_medico), HttpStatus.OK);
   }

   @GetMapping("/")
   public ResponseEntity<List<Medico>> obtenerTodosLosRecurso() {
      return new ResponseEntity<>(medicoService.all(), HttpStatus.OK);
   }

   @PutMapping
   public ResponseEntity<Medico> actualizarRecurso(@RequestBody Medico medico, @RequestParam String dni_medico) {
      return new ResponseEntity<>(medicoService.replaceMedico(medico, dni_medico), HttpStatus.OK);
   }

   @DeleteMapping
   public ResponseEntity<String> eliminarRecurso(@RequestParam String dni_medico) {
      medicoService.deleteMedico(dni_medico);
      return new ResponseEntity<>("Recurso eliminado", HttpStatus.NO_CONTENT);
   }

}

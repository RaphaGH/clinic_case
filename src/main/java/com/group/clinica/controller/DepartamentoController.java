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
import com.group.clinica.model.Departamento;
import com.group.clinica.service.IDepartamentoService;

@RestController
@RequestMapping("/api/v1/departamento")
public class DepartamentoController {

   @Autowired
   private IDepartamentoService departamentoService;

   @PostMapping
   public ResponseEntity<Departamento> crearRecurso(@RequestBody Departamento newdepartamento) {
      return new ResponseEntity<>(departamentoService.newDepartamento(newdepartamento), HttpStatus.CREATED);
   }

   @GetMapping
   public ResponseEntity<Departamento> obtenerRecurso(@RequestParam String id) {
      return new ResponseEntity<>(departamentoService.one(id), HttpStatus.OK);
   }

   @GetMapping("/")
   public ResponseEntity<List<Departamento>> obtenerTodosLosRecurso() {
      return new ResponseEntity<>(departamentoService.all(), HttpStatus.OK);
   }

   @PutMapping
   public ResponseEntity<Departamento> actualizarRecurso(@RequestBody Departamento departamento, @RequestParam String id) {
      return new ResponseEntity<>(departamentoService.replaceDepartamento(departamento, id), HttpStatus.OK);
   }

   @DeleteMapping
   public ResponseEntity<String> eliminarRecurso(@RequestParam String id) {
      departamentoService.deleteDepartamento(id);
      return new ResponseEntity<>("Recurso eliminado", HttpStatus.NO_CONTENT);
   }

}

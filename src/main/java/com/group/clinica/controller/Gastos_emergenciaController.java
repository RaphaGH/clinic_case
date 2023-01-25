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
import com.group.clinica.model.Gastos_emergencia;
import com.group.clinica.service.IGastos_emergenciaService;

@RestController
@RequestMapping("/api/v1/gastos_emergencia")
public class Gastos_emergenciaController {

   @Autowired
   private IGastos_emergenciaService gastos_emergenciaService;

   @PostMapping
   public ResponseEntity<Gastos_emergencia> crearRecurso(@RequestBody Gastos_emergencia newgastos_emergencia) {
      return new ResponseEntity<>(gastos_emergenciaService.newGastos_emergencia(newgastos_emergencia), HttpStatus.CREATED);
   }

   @GetMapping
   public ResponseEntity<Gastos_emergencia> obtenerRecurso(@RequestParam String id) {
      return new ResponseEntity<>(gastos_emergenciaService.one(id), HttpStatus.OK);
   }

   @GetMapping("/")
   public ResponseEntity<List<Gastos_emergencia>> obtenerTodosLosRecurso() {
      return new ResponseEntity<>(gastos_emergenciaService.all(), HttpStatus.OK);
   }

   @PutMapping
   public ResponseEntity<Gastos_emergencia> actualizarRecurso(@RequestBody Gastos_emergencia gastos_emergencia, @RequestParam String id) {
      return new ResponseEntity<>(gastos_emergenciaService.replaceGastos_emergencia(gastos_emergencia, id), HttpStatus.OK);
   }

   @DeleteMapping
   public ResponseEntity<String> eliminarRecurso(@RequestParam String id) {
      gastos_emergenciaService.deleteGastos_emergencia(id);
      return new ResponseEntity<>("Recurso eliminado", HttpStatus.NO_CONTENT);
   }

}

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
import com.group.clinica.model.Sucursal;
import com.group.clinica.service.ISucursalService;

@RestController
@RequestMapping("/api/v1/sucursal")
public class SucursalController {

   @Autowired
   private ISucursalService sucursalService;

   @PostMapping
   public ResponseEntity<Sucursal> crearRecurso(@RequestBody Sucursal newsucursal) {
      return new ResponseEntity<>(sucursalService.newSucursal(newsucursal), HttpStatus.CREATED);
   }

   @GetMapping
   public ResponseEntity<Sucursal> obtenerRecurso(@RequestParam String id) {
      return new ResponseEntity<>(sucursalService.one(id), HttpStatus.OK);
   }

   @GetMapping("/")
   public ResponseEntity<List<Sucursal>> obtenerTodosLosRecurso() {
      return new ResponseEntity<>(sucursalService.all(), HttpStatus.OK);
   }

   @PutMapping
   public ResponseEntity<Sucursal> actualizarRecurso(@RequestBody Sucursal sucursal, @RequestParam String id) {
      return new ResponseEntity<>(sucursalService.replaceSucursal(sucursal, id), HttpStatus.OK);
   }

   @DeleteMapping
   public ResponseEntity<String> eliminarRecurso(@RequestParam String id) {
      sucursalService.deleteSucursal(id);
      return new ResponseEntity<>("Recurso eliminado", HttpStatus.NO_CONTENT);
   }

}

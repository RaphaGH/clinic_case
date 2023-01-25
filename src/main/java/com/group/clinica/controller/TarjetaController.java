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
import com.group.clinica.model.Tarjeta;
import com.group.clinica.service.ITarjetaService;

@RestController
@RequestMapping("/api/v1/tarjeta")
public class TarjetaController {

   @Autowired
   private ITarjetaService tarjetaService;

   @PostMapping
   public ResponseEntity<Tarjeta> crearRecurso(@RequestBody Tarjeta newtarjeta) {
      return new ResponseEntity<>(tarjetaService.newTarjeta(newtarjeta), HttpStatus.CREATED);
   }

   @GetMapping
   public ResponseEntity<Tarjeta> obtenerRecurso(@RequestParam String fecha_vencimiento) {
      return new ResponseEntity<>(tarjetaService.one(fecha_vencimiento), HttpStatus.OK);
   }

   @GetMapping("/")
   public ResponseEntity<List<Tarjeta>> obtenerTodosLosRecurso() {
      return new ResponseEntity<>(tarjetaService.all(), HttpStatus.OK);
   }

   @PutMapping
   public ResponseEntity<Tarjeta> actualizarRecurso(@RequestBody Tarjeta tarjeta, @RequestParam String fecha_vencimiento) {
      return new ResponseEntity<>(tarjetaService.replaceTarjeta(tarjeta, fecha_vencimiento), HttpStatus.OK);
   }

   @DeleteMapping
   public ResponseEntity<String> eliminarRecurso(@RequestParam String fecha_vencimiento) {
      tarjetaService.deleteTarjeta(fecha_vencimiento);
      return new ResponseEntity<>("Recurso eliminado", HttpStatus.NO_CONTENT);
   }

}

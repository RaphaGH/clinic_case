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
import com.group.clinica.model.Comprobante_pago;
import com.group.clinica.service.IComprobante_pagoService;

@RestController
@RequestMapping("/api/v1/comprobante_pago")
public class Comprobante_pagoController {

   @Autowired
   private IComprobante_pagoService comprobante_pagoService;

   @PostMapping
   public ResponseEntity<Comprobante_pago> crearRecurso(@RequestBody Comprobante_pago newcomprobante_pago) {
      return new ResponseEntity<>(comprobante_pagoService.newComprobante_pago(newcomprobante_pago), HttpStatus.CREATED);
   }

   @GetMapping
   public ResponseEntity<Comprobante_pago> obtenerRecurso(@RequestParam String fecha_pago) {
      return new ResponseEntity<>(comprobante_pagoService.one(fecha_pago), HttpStatus.OK);
   }

   @GetMapping("/")
   public ResponseEntity<List<Comprobante_pago>> obtenerTodosLosRecurso() {
      return new ResponseEntity<>(comprobante_pagoService.all(), HttpStatus.OK);
   }

   @PutMapping
   public ResponseEntity<Comprobante_pago> actualizarRecurso(@RequestBody Comprobante_pago comprobante_pago, @RequestParam String fecha_pago) {
      return new ResponseEntity<>(comprobante_pagoService.replaceComprobante_pago(comprobante_pago, fecha_pago), HttpStatus.OK);
   }

   @DeleteMapping
   public ResponseEntity<String> eliminarRecurso(@RequestParam String fecha_pago) {
      comprobante_pagoService.deleteComprobante_pago(fecha_pago);
      return new ResponseEntity<>("Recurso eliminado", HttpStatus.NO_CONTENT);
   }

}

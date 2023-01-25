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
import com.group.clinica.model.Concepto_pago;
import com.group.clinica.service.IConcepto_pagoService;

@RestController
@RequestMapping("/api/v1/concepto_pago")
public class Concepto_pagoController {

   @Autowired
   private IConcepto_pagoService concepto_pagoService;

   @PostMapping
   public ResponseEntity<Concepto_pago> crearRecurso(@RequestBody Concepto_pago newconcepto_pago) {
      return new ResponseEntity<>(concepto_pagoService.newConcepto_pago(newconcepto_pago), HttpStatus.CREATED);
   }

   @GetMapping
   public ResponseEntity<Concepto_pago> obtenerRecurso(@RequestParam String id) {
      return new ResponseEntity<>(concepto_pagoService.one(id), HttpStatus.OK);
   }

   @GetMapping("/")
   public ResponseEntity<List<Concepto_pago>> obtenerTodosLosRecurso() {
      return new ResponseEntity<>(concepto_pagoService.all(), HttpStatus.OK);
   }

   @PutMapping
   public ResponseEntity<Concepto_pago> actualizarRecurso(@RequestBody Concepto_pago concepto_pago, @RequestParam String id) {
      return new ResponseEntity<>(concepto_pagoService.replaceConcepto_pago(concepto_pago, id), HttpStatus.OK);
   }

   @DeleteMapping
   public ResponseEntity<String> eliminarRecurso(@RequestParam String id) {
      concepto_pagoService.deleteConcepto_pago(id);
      return new ResponseEntity<>("Recurso eliminado", HttpStatus.NO_CONTENT);
   }

}

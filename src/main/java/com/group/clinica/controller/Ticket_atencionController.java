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
import com.group.clinica.model.Ticket_atencion;
import com.group.clinica.service.ITicket_atencionService;

@RestController
@RequestMapping("/api/v1/ticket_atencion")
public class Ticket_atencionController {

   @Autowired
   private ITicket_atencionService ticket_atencionService;

   @PostMapping
   public ResponseEntity<Ticket_atencion> crearRecurso(@RequestBody Ticket_atencion newticket_atencion) {
      return new ResponseEntity<>(ticket_atencionService.newTicket_atencion(newticket_atencion), HttpStatus.CREATED);
   }

   @GetMapping
   public ResponseEntity<Ticket_atencion> obtenerRecurso(@RequestParam String id) {
      return new ResponseEntity<>(ticket_atencionService.one(id), HttpStatus.OK);
   }

   @GetMapping("/")
   public ResponseEntity<List<Ticket_atencion>> obtenerTodosLosRecurso() {
      return new ResponseEntity<>(ticket_atencionService.all(), HttpStatus.OK);
   }

   @PutMapping
   public ResponseEntity<Ticket_atencion> actualizarRecurso(@RequestBody Ticket_atencion ticket_atencion, @RequestParam String id) {
      return new ResponseEntity<>(ticket_atencionService.replaceTicket_atencion(ticket_atencion, id), HttpStatus.OK);
   }

   @DeleteMapping
   public ResponseEntity<String> eliminarRecurso(@RequestParam String id) {
      ticket_atencionService.deleteTicket_atencion(id);
      return new ResponseEntity<>("Recurso eliminado", HttpStatus.NO_CONTENT);
   }

}

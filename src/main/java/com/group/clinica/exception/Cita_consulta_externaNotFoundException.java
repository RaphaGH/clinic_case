package com.group.clinica.exception;

public class Cita_consulta_externaNotFoundException extends RuntimeException {
   public Cita_consulta_externaNotFoundException(String id) { 
       super("Could not find Cita_consulta_externa " + id); 
   } 
}
package com.group.clinica.exception;

public class ConsultorioNotFoundException extends RuntimeException {
   public ConsultorioNotFoundException(String id) { 
       super("Could not find Consultorio " + id); 
   } 
}
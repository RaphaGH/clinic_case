package com.group.clinica.exception;

public class Historia_clinicaNotFoundException extends RuntimeException {
   public Historia_clinicaNotFoundException(String id) { 
       super("Could not find Historia_clinica " + id); 
   } 
}
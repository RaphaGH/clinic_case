package com.group.clinica.exception;

public class MedicoNotFoundException extends RuntimeException {
   public MedicoNotFoundException(String id) { 
       super("Could not find Medico " + id); 
   } 
}
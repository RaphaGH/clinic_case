package com.group.clinica.exception;

public class RecepcionistaNotFoundException extends RuntimeException {
   public RecepcionistaNotFoundException(String id) { 
       super("Could not find Recepcionista " + id); 
   } 
}
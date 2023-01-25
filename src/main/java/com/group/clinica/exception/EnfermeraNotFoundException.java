package com.group.clinica.exception;

public class EnfermeraNotFoundException extends RuntimeException {
   public EnfermeraNotFoundException(String id) { 
       super("Could not find Enfermera " + id); 
   } 
}
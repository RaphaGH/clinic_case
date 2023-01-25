package com.group.clinica.exception;

public class Horario_atencionNotFoundException extends RuntimeException {
   public Horario_atencionNotFoundException(String id) { 
       super("Could not find Horario_atencion " + id); 
   } 
}
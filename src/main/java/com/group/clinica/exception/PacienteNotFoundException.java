package com.group.clinica.exception;

public class PacienteNotFoundException extends RuntimeException {
   public PacienteNotFoundException(String id) { 
       super("Could not find Paciente " + id); 
   } 
}
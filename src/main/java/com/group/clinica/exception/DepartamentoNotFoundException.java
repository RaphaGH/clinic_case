package com.group.clinica.exception;

public class DepartamentoNotFoundException extends RuntimeException {
   public DepartamentoNotFoundException(String id) { 
       super("Could not find Departamento " + id); 
   } 
}
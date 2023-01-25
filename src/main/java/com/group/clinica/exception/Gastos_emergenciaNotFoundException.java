package com.group.clinica.exception;

public class Gastos_emergenciaNotFoundException extends RuntimeException {
   public Gastos_emergenciaNotFoundException(String id) { 
       super("Could not find Gastos_emergencia " + id); 
   } 
}
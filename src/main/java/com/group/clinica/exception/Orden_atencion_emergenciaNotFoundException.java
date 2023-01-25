package com.group.clinica.exception;

public class Orden_atencion_emergenciaNotFoundException extends RuntimeException {
   public Orden_atencion_emergenciaNotFoundException(String id) { 
       super("Could not find Orden_atencion_emergencia " + id); 
   } 
}
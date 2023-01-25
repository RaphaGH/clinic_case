package com.group.clinica.exception;

public class Detalle_orden_atencion_emergenciaNotFoundException extends RuntimeException {
   public Detalle_orden_atencion_emergenciaNotFoundException(String id) { 
       super("Could not find Detalle_orden_atencion_emergencia " + id); 
   } 
}
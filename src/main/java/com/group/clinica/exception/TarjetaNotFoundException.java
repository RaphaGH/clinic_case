package com.group.clinica.exception;

public class TarjetaNotFoundException extends RuntimeException {
   public TarjetaNotFoundException(String id) { 
       super("Could not find Tarjeta " + id); 
   } 
}
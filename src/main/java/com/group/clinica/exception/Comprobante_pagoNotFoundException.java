package com.group.clinica.exception;

public class Comprobante_pagoNotFoundException extends RuntimeException {
   public Comprobante_pagoNotFoundException(String id) { 
       super("Could not find Comprobante_pago " + id); 
   } 
}
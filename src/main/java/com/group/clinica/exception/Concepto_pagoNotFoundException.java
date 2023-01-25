package com.group.clinica.exception;

public class Concepto_pagoNotFoundException extends RuntimeException {
   public Concepto_pagoNotFoundException(String id) { 
       super("Could not find Concepto_pago " + id); 
   } 
}
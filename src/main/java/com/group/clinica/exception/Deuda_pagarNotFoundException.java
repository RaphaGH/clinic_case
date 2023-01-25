package com.group.clinica.exception;

public class Deuda_pagarNotFoundException extends RuntimeException {
   public Deuda_pagarNotFoundException(String id) { 
       super("Could not find Deuda_pagar " + id); 
   } 
}
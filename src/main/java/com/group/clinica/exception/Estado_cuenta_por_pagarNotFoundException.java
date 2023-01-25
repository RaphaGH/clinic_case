package com.group.clinica.exception;

public class Estado_cuenta_por_pagarNotFoundException extends RuntimeException {
   public Estado_cuenta_por_pagarNotFoundException(String id) { 
       super("Could not find Estado_cuenta_por_pagar " + id); 
   } 
}
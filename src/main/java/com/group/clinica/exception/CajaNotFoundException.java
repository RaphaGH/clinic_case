package com.group.clinica.exception;

public class CajaNotFoundException extends RuntimeException {
   public CajaNotFoundException(String id) { 
       super("Could not find Caja " + id); 
   } 
}
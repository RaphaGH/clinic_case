package com.group.clinica.exception;

public class SucursalNotFoundException extends RuntimeException {
   public SucursalNotFoundException(String id) { 
       super("Could not find Sucursal " + id); 
   } 
}
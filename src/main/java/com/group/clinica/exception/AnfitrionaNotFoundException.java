package com.group.clinica.exception;

public class AnfitrionaNotFoundException extends RuntimeException {
   public AnfitrionaNotFoundException(String id) { 
       super("Could not find Anfitriona " + id); 
   } 
}
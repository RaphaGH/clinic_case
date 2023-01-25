package com.group.clinica.exception;

public class Ticket_atencionNotFoundException extends RuntimeException {
   public Ticket_atencionNotFoundException(String id) { 
       super("Could not find Ticket_atencion " + id); 
   } 
}
package com.group.clinica.exception.message;

import org.springframework.http.HttpStatus;
import com.group.clinica.exception.*;
import org.springframework.web.bind.annotation.*;

@ControllerAdvice
public class Ticket_atencionNotFoundAdvice {
   @ResponseBody
   @ExceptionHandler(Ticket_atencionNotFoundException.class)
   @ResponseStatus(HttpStatus.NOT_FOUND)
   String Ticket_atencionNotFoundHandler(Ticket_atencionNotFoundException ex) {
      return ex.getMessage();
   }
}

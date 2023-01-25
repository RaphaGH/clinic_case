package com.group.clinica.exception.message;

import org.springframework.http.HttpStatus;
import com.group.clinica.exception.*;
import org.springframework.web.bind.annotation.*;

@ControllerAdvice
public class MedicoNotFoundAdvice {
   @ResponseBody
   @ExceptionHandler(MedicoNotFoundException.class)
   @ResponseStatus(HttpStatus.NOT_FOUND)
   String MedicoNotFoundHandler(MedicoNotFoundException ex) {
      return ex.getMessage();
   }
}

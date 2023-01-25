package com.group.clinica.exception.message;

import org.springframework.http.HttpStatus;
import com.group.clinica.exception.*;
import org.springframework.web.bind.annotation.*;

@ControllerAdvice
public class PacienteNotFoundAdvice {
   @ResponseBody
   @ExceptionHandler(PacienteNotFoundException.class)
   @ResponseStatus(HttpStatus.NOT_FOUND)
   String PacienteNotFoundHandler(PacienteNotFoundException ex) {
      return ex.getMessage();
   }
}

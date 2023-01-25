package com.group.clinica.exception.message;

import org.springframework.http.HttpStatus;
import com.group.clinica.exception.*;
import org.springframework.web.bind.annotation.*;

@ControllerAdvice
public class ConsultorioNotFoundAdvice {
   @ResponseBody
   @ExceptionHandler(ConsultorioNotFoundException.class)
   @ResponseStatus(HttpStatus.NOT_FOUND)
   String ConsultorioNotFoundHandler(ConsultorioNotFoundException ex) {
      return ex.getMessage();
   }
}

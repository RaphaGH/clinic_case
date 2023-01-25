package com.group.clinica.exception.message;

import org.springframework.http.HttpStatus;
import com.group.clinica.exception.*;
import org.springframework.web.bind.annotation.*;

@ControllerAdvice
public class Deuda_pagarNotFoundAdvice {
   @ResponseBody
   @ExceptionHandler(Deuda_pagarNotFoundException.class)
   @ResponseStatus(HttpStatus.NOT_FOUND)
   String Deuda_pagarNotFoundHandler(Deuda_pagarNotFoundException ex) {
      return ex.getMessage();
   }
}

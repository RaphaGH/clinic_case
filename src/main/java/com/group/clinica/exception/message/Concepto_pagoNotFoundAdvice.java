package com.group.clinica.exception.message;

import org.springframework.http.HttpStatus;
import com.group.clinica.exception.*;
import org.springframework.web.bind.annotation.*;

@ControllerAdvice
public class Concepto_pagoNotFoundAdvice {
   @ResponseBody
   @ExceptionHandler(Concepto_pagoNotFoundException.class)
   @ResponseStatus(HttpStatus.NOT_FOUND)
   String Concepto_pagoNotFoundHandler(Concepto_pagoNotFoundException ex) {
      return ex.getMessage();
   }
}

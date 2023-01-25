package com.group.clinica.exception.message;

import org.springframework.http.HttpStatus;
import com.group.clinica.exception.*;
import org.springframework.web.bind.annotation.*;

@ControllerAdvice
public class Gastos_emergenciaNotFoundAdvice {
   @ResponseBody
   @ExceptionHandler(Gastos_emergenciaNotFoundException.class)
   @ResponseStatus(HttpStatus.NOT_FOUND)
   String Gastos_emergenciaNotFoundHandler(Gastos_emergenciaNotFoundException ex) {
      return ex.getMessage();
   }
}

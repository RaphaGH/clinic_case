package com.group.clinica.exception.message;

import org.springframework.http.HttpStatus;
import com.group.clinica.exception.*;
import org.springframework.web.bind.annotation.*;

@ControllerAdvice
public class DepartamentoNotFoundAdvice {
   @ResponseBody
   @ExceptionHandler(DepartamentoNotFoundException.class)
   @ResponseStatus(HttpStatus.NOT_FOUND)
   String DepartamentoNotFoundHandler(DepartamentoNotFoundException ex) {
      return ex.getMessage();
   }
}

package com.group.clinica.exception.message;

import org.springframework.http.HttpStatus;
import com.group.clinica.exception.*;
import org.springframework.web.bind.annotation.*;

@ControllerAdvice
public class Estado_cuenta_por_pagarNotFoundAdvice {
   @ResponseBody
   @ExceptionHandler(Estado_cuenta_por_pagarNotFoundException.class)
   @ResponseStatus(HttpStatus.NOT_FOUND)
   String Estado_cuenta_por_pagarNotFoundHandler(Estado_cuenta_por_pagarNotFoundException ex) {
      return ex.getMessage();
   }
}

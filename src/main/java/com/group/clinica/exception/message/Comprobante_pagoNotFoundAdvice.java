package com.group.clinica.exception.message;

import org.springframework.http.HttpStatus;
import com.group.clinica.exception.*;
import org.springframework.web.bind.annotation.*;

@ControllerAdvice
public class Comprobante_pagoNotFoundAdvice {
   @ResponseBody
   @ExceptionHandler(Comprobante_pagoNotFoundException.class)
   @ResponseStatus(HttpStatus.NOT_FOUND)
   String Comprobante_pagoNotFoundHandler(Comprobante_pagoNotFoundException ex) {
      return ex.getMessage();
   }
}

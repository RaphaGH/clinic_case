package com.group.clinica.exception.message;

import org.springframework.http.HttpStatus;
import com.group.clinica.exception.*;
import org.springframework.web.bind.annotation.*;

@ControllerAdvice
public class TarjetaNotFoundAdvice {
   @ResponseBody
   @ExceptionHandler(TarjetaNotFoundException.class)
   @ResponseStatus(HttpStatus.NOT_FOUND)
   String TarjetaNotFoundHandler(TarjetaNotFoundException ex) {
      return ex.getMessage();
   }
}

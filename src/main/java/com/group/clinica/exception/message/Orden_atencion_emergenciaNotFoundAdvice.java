package com.group.clinica.exception.message;

import org.springframework.http.HttpStatus;
import com.group.clinica.exception.*;
import org.springframework.web.bind.annotation.*;

@ControllerAdvice
public class Orden_atencion_emergenciaNotFoundAdvice {
   @ResponseBody
   @ExceptionHandler(Orden_atencion_emergenciaNotFoundException.class)
   @ResponseStatus(HttpStatus.NOT_FOUND)
   String Orden_atencion_emergenciaNotFoundHandler(Orden_atencion_emergenciaNotFoundException ex) {
      return ex.getMessage();
   }
}

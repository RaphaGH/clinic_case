package com.group.clinica.exception.message;

import org.springframework.http.HttpStatus;
import com.group.clinica.exception.*;
import org.springframework.web.bind.annotation.*;

@ControllerAdvice
public class Detalle_orden_atencion_emergenciaNotFoundAdvice {
   @ResponseBody
   @ExceptionHandler(Detalle_orden_atencion_emergenciaNotFoundException.class)
   @ResponseStatus(HttpStatus.NOT_FOUND)
   String Detalle_orden_atencion_emergenciaNotFoundHandler(Detalle_orden_atencion_emergenciaNotFoundException ex) {
      return ex.getMessage();
   }
}

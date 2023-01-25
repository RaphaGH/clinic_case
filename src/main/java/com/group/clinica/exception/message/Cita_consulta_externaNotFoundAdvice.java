package com.group.clinica.exception.message;

import org.springframework.http.HttpStatus;
import com.group.clinica.exception.*;
import org.springframework.web.bind.annotation.*;

@ControllerAdvice
public class Cita_consulta_externaNotFoundAdvice {
   @ResponseBody
   @ExceptionHandler(Cita_consulta_externaNotFoundException.class)
   @ResponseStatus(HttpStatus.NOT_FOUND)
   String Cita_consulta_externaNotFoundHandler(Cita_consulta_externaNotFoundException ex) {
      return ex.getMessage();
   }
}

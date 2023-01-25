package com.group.clinica.exception.message;

import org.springframework.http.HttpStatus;
import com.group.clinica.exception.*;
import org.springframework.web.bind.annotation.*;

@ControllerAdvice
public class Horario_atencionNotFoundAdvice {
   @ResponseBody
   @ExceptionHandler(Horario_atencionNotFoundException.class)
   @ResponseStatus(HttpStatus.NOT_FOUND)
   String Horario_atencionNotFoundHandler(Horario_atencionNotFoundException ex) {
      return ex.getMessage();
   }
}

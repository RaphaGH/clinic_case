package com.group.clinica.exception.message;

import org.springframework.http.HttpStatus;
import com.group.clinica.exception.*;
import org.springframework.web.bind.annotation.*;

@ControllerAdvice
public class RecepcionistaNotFoundAdvice {
   @ResponseBody
   @ExceptionHandler(RecepcionistaNotFoundException.class)
   @ResponseStatus(HttpStatus.NOT_FOUND)
   String RecepcionistaNotFoundHandler(RecepcionistaNotFoundException ex) {
      return ex.getMessage();
   }
}

package com.group.clinica.exception.message;

import org.springframework.http.HttpStatus;
import com.group.clinica.exception.*;
import org.springframework.web.bind.annotation.*;

@ControllerAdvice
public class Historia_clinicaNotFoundAdvice {
   @ResponseBody
   @ExceptionHandler(Historia_clinicaNotFoundException.class)
   @ResponseStatus(HttpStatus.NOT_FOUND)
   String Historia_clinicaNotFoundHandler(Historia_clinicaNotFoundException ex) {
      return ex.getMessage();
   }
}

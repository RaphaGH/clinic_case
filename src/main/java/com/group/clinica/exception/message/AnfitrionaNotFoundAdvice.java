package com.group.clinica.exception.message;

import org.springframework.http.HttpStatus;
import com.group.clinica.exception.*;
import org.springframework.web.bind.annotation.*;

@ControllerAdvice
public class AnfitrionaNotFoundAdvice {
   @ResponseBody
   @ExceptionHandler(AnfitrionaNotFoundException.class)
   @ResponseStatus(HttpStatus.NOT_FOUND)
   String AnfitrionaNotFoundHandler(AnfitrionaNotFoundException ex) {
      return ex.getMessage();
   }
}

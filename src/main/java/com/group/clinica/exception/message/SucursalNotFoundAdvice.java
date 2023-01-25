package com.group.clinica.exception.message;

import org.springframework.http.HttpStatus;
import com.group.clinica.exception.*;
import org.springframework.web.bind.annotation.*;

@ControllerAdvice
public class SucursalNotFoundAdvice {
   @ResponseBody
   @ExceptionHandler(SucursalNotFoundException.class)
   @ResponseStatus(HttpStatus.NOT_FOUND)
   String SucursalNotFoundHandler(SucursalNotFoundException ex) {
      return ex.getMessage();
   }
}

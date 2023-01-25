package com.group.clinica.exception.message;

import org.springframework.http.HttpStatus;
import com.group.clinica.exception.*;
import org.springframework.web.bind.annotation.*;

@ControllerAdvice
public class CajaNotFoundAdvice {
   @ResponseBody
   @ExceptionHandler(CajaNotFoundException.class)
   @ResponseStatus(HttpStatus.NOT_FOUND)
   String CajaNotFoundHandler(CajaNotFoundException ex) {
      return ex.getMessage();
   }
}

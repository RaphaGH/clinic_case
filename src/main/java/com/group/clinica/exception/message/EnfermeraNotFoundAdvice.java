package com.group.clinica.exception.message;

import org.springframework.http.HttpStatus;
import com.group.clinica.exception.*;
import org.springframework.web.bind.annotation.*;

@ControllerAdvice
public class EnfermeraNotFoundAdvice {
   @ResponseBody
   @ExceptionHandler(EnfermeraNotFoundException.class)
   @ResponseStatus(HttpStatus.NOT_FOUND)
   String EnfermeraNotFoundHandler(EnfermeraNotFoundException ex) {
      return ex.getMessage();
   }
}

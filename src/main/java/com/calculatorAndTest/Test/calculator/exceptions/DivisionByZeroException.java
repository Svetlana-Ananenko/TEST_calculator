   package com.calculatorAndTest.Test.calculator.exceptions;

   import org.springframework.http.HttpStatus;
   import org.springframework.web.bind.annotation.ResponseStatus;

   @ResponseStatus(HttpStatus.BAD_REQUEST)
   public class DivisionByZeroException extends IllegalArgumentException {
       private static final String MESSAGE = "Делить на ноль нельзя";

       public DivisionByZeroException() {
           super(MESSAGE);
       }
   }
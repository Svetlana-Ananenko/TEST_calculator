    package com.calculatorAndTest.Test.service;

    import com.calculatorAndTest.Test.calculator.exceptions.DivisionByZeroException;
    import com.calculatorAndTest.Test.calculator.exceptions.InsufficientParamException;
    import org.springframework.stereotype.Service;


    @Service
    public class   CalculatorService {
        public String welcome() {
            return "Welcome!";
        }

        public String plus(Integer num1, Integer num2) {
            if (num1 == null || num2 == null) {
                throw new InsufficientParamException();
            }
            int result = num1 + num2;
            return num1 + " + " + num2 + " = " + result;
        }
        public String minus(Integer num1, Integer num2) {
            if (num1 == null || num2 == null) {
                throw new InsufficientParamException();
            }
            int result = num1 - num2;
            return num1 + " - " + num2 + " = " + result;
        }

        public String multiply(Integer num1, Integer num2) {
            if (num1 == null || num2 == null) {
                throw new InsufficientParamException();
            }
            int result = num1 * num2;
            return num1 + " * " + num2 + " = " + result;
        }

        public String divide(Integer num1, Integer num2) {
            if (num1 == null || num2 == null) {
                throw new InsufficientParamException();
            }
            if (num2 == 0) {
                throw new DivisionByZeroException();
            }
            int result = num1 / num2;
            int remainder = num1 % num2;
            if (remainder == 0) {
                return num1 + " / " + num2 + " = " + result;
            }
            else {
                return num1 + " / " + num2 + " = " + result + " остаток: " + remainder;
            }
        }
    }
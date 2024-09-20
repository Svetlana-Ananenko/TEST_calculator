package com.calculatorAndTest.Test.calculator;
import org.springframework.stereotype.Service;
@Service

public class CalculatorServiceImpl implements CalculatorService {
    public String welcome() {
        return "Добро пожаловать в калькулятор";
    }


    @Override
    public String plus(Integer num1, Integer num2) {
        if (num1 == null || num2 == null) {
            throw new NullPointerException("Параметр/ы не могут быть null");
        }
        return num1 + " + " + num2 + " = " + (num1 + num2);
    }

    @Override
    public String minus(Integer num1, Integer num2) {
        if (num1 == null || num2 == null) {
            throw new NullPointerException("Параметр/ы не могут быть null");
        }
        return num1 + " - " + num2 + " = " + (num1 - num2);
    }

    @Override
    public String multiply(Integer num1, Integer num2) {
        if (num1 == null || num2 == null) {
            throw new NullPointerException("Параметр/ы не могут быть null");
        }
        return num1 + " * " + num2 + " = " + (num1 * num2);
    }

    @Override
    public String divide(Integer num1, Integer num2) {
        if (num1 == null || num2 == null) {
            throw new NullPointerException("Параметр/ы не могут быть null");
        }
        if (num2 == 0) {
            throw new ArithmeticException("Делить на ноль нельзя!");
        }
        return num1 + " / " + num2 + " = " + (num1 / num2);
    }

    public String textError() {
        return "Введите корректные значения";
    }
}

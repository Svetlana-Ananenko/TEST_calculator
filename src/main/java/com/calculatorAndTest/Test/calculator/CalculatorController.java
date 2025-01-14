package com.calculatorAndTest.Test.calculator;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RequestMapping("/calculator")


public class CalculatorController {
    private final CalculatorServiceImpl calculatorServiceImpl;
    public CalculatorController(CalculatorServiceImpl calculatorServiceImpl) {
        this.calculatorServiceImpl = calculatorServiceImpl;
    }

    public String welcome() {
        return calculatorServiceImpl.welcome();
    }

    @GetMapping(path = "/plus")
    public String plus(@RequestParam(value = "num1") Integer num1,
                       @RequestParam(value = "num2") Integer num2) {
        return calculatorServiceImpl.plus(num1, num2);
    }

    @GetMapping(path = "/minus")

    public String minus(@RequestParam(value = "num1") Integer num1,
                        @RequestParam(value = "num2", required = false) Integer num2) {
        return calculatorServiceImpl.minus(num1, num2);
    }

    @GetMapping(path = "/multiply")
    public String multiply(@RequestParam(value = "num1") Integer num1,
                           @RequestParam(value = "num2") Integer num2) {
        return calculatorServiceImpl.multiply(num1, num2);
    }

    @GetMapping(path = "/divide")
    public String divide(@RequestParam(value = "num1") Integer num1,
                         @RequestParam(value = "num2") Integer num2) {
        return calculatorServiceImpl.divide(num1, num2);
    }
}

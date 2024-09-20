package com.calculatorAndTest.Test;

import com.calculatorAndTest.Test.calculator.exceptions.DivisionByZeroException;
import com.calculatorAndTest.Test.calculator.exceptions.InsufficientParamException;
import com.calculatorAndTest.Test.service.CalculatorService;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorServiceTest {
    private final CalculatorService calculatorService = new CalculatorService();
    private final int[] testSet1 = {5, 10};
    private final int[] testSet2 = {20, 15};

    @Test
    void plusTest() {
        String actual1 = calculatorService.plus(testSet1[0], testSet1[1]);
        String expected1 = "5 + 10 = 15";
        String actual2 = calculatorService.plus(testSet2[0], testSet2[1]);
        String expected2 = "20 + 15 = 35";
        assertEquals(expected1, actual1);
        assertEquals(expected2, actual2);
    }

    @Test
    void minusTest() {
        String actual1 = calculatorService.minus(testSet1[0], testSet1[1]);
        String expected1 = "5 - 10 = -5";
        String actual2 = calculatorService.minus(testSet2[0], testSet2[1]);
        String expected2 = "20 - 15 = 5";
        assertEquals(expected1, actual1);
        assertEquals(expected2, actual2);
    }

    @Test
    void multiplyTest() {
        String actual1 = calculatorService.multiply(testSet1[0], testSet1[1]);
        String expected1 = "5 * 10 = 50";
        String actual2 = calculatorService.multiply(testSet2[0], testSet2[1]);
        String expected2 = "20 * 15 = 300";
        assertEquals(expected1, actual1);
        assertEquals(expected2, actual2);
    }

    @Test
    void divideTest() {
        String actual1 = calculatorService.divide(testSet1[0], testSet1[1]);
        String expected1 = "5 / 10 = 0 остаток: 5";
        String actual2 = calculatorService.divide(testSet2[0], testSet2[1]);
        String expected2 = "20 / 15 = 1 остаток: 5";
        assertEquals(expected1, actual1);
        assertEquals(expected2, actual2);
    }

    @Test
    void shouldThrowDivisionByZeroException() {
        assertThrows(DivisionByZeroException.class, () -> calculatorService.divide(5, 0));
    }

    @Test
    void shouldThrowInsufficientParamsException() {
        assertThrows(InsufficientParamException.class, () -> calculatorService.plus(5, null));
        assertThrows(InsufficientParamException.class, () -> calculatorService.minus(5, null));
        assertThrows(InsufficientParamException.class, () -> calculatorService.multiply(5, null));
        assertThrows(InsufficientParamException.class, () -> calculatorService.divide(5, null));
    }
}
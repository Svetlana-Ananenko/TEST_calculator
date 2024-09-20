package com.calculatorAndTest.Test.test;
import com.calculatorAndTest.Test.calculator.CalculatorServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Random;

import static org.junit.jupiter.api.Assertions.*;

public class CalculatorServiceImplTest {
    static final Random random = new Random();
    private CalculatorServiceImpl testCalculator;
    Integer testNumber = random.nextInt(100);

    @BeforeEach
    public void setUp() {
        testCalculator = new CalculatorServiceImpl();
    }

    @Test
    public void testPlusWithNullNumber1() {
        assertThrows(NullPointerException.class, () -> testCalculator.plus(null, testNumber));
    }

    @Test
    public void testPlusWithNullNumber2() {
        assertThrows(NullPointerException.class, () -> testCalculator.plus(testNumber, null));
    }

    @Test
    public void testMinusWithNullNumber1() {
        assertThrows(NullPointerException.class, () -> testCalculator.minus(null, testNumber));
    }

    @Test
    public void testMinusWithNullNumber2() {
        assertThrows(NullPointerException.class, () -> testCalculator.minus(testNumber, null));
    }

    @Test
    public void testMultiplyWithNullNumber1() {
        assertThrows(NullPointerException.class, () -> testCalculator.multiply(null, testNumber));
    }

    @Test
    public void testMultiplyWithNullNumber2() {
        assertThrows(NullPointerException.class, () -> testCalculator.multiply(testNumber, null));
    }

    @Test
    public void testDivideWithNullNumber1() {
        assertThrows(NullPointerException.class, () -> testCalculator.divide(null, testNumber));
    }

    @Test
    public void testDivideWithNullNumber2() {
        assertThrows(NullPointerException.class, () -> testCalculator.divide(testNumber, null));
    }

    @Test
    public void testDivideWithArithmeticExepsion() {
        assertThrows(ArithmeticException.class, () -> testCalculator.divide(testNumber, 0));
    }
}

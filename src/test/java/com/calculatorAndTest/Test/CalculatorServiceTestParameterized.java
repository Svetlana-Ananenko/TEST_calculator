package com.calculatorAndTest.Test;
import com.calculatorAndTest.Test.calculator.exceptions.DivisionByZeroException;
import com.calculatorAndTest.Test.calculator.exceptions.InsufficientParamException;
import com.calculatorAndTest.Test.service.CalculatorService;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;


public class CalculatorServiceTestParameterized {
    private final CalculatorService out = new CalculatorService();

    public static Stream<Arguments> provideParamsForPlus() {
        return Stream.of(
                Arguments.of(5, 3, "5 + 3 = 8"),
                Arguments.of(12, 4, "12 + 4 = 16"),
                Arguments.of(3, 1, "3 + 1 = 4")
        );
    }

    @ParameterizedTest
    @MethodSource("provideParamsForPlus")
    void plusTest(Integer num1, Integer num2, String result) {
        assertEquals(out.plus(num1, num2), result);
    }

    public static Stream<Arguments> provideParamsForMinus() {
        return Stream.of(
                Arguments.of(10, 8, "10 - 8 = 2"),
                Arguments.of(21, 11, "21 - 11 = 10"),
                Arguments.of(3, 100, "3 - 100 = -97")
        );
    }

    @ParameterizedTest
    @MethodSource("provideParamsForMinus")
    void minusTest(Integer num1, Integer num2, String result) {
        assertEquals(out.minus(num1, num2), result);
    }

    @ParameterizedTest
    @CsvSource({
            "4, 10, 4 * 10 = 40",
            "2, 12, 2 * 12 = 24",
            "18, 10, 18 * 10 = 180"
    })
    void multiplyTest(Integer num1, Integer num2, String result) {
        assertEquals(out.multiply(num1, num2), result);
    }

    @ParameterizedTest
    @CsvSource({
            "10, 5, 10 / 5 = 2",
            "60, 12, 60 / 12 = 5",
            "14, 8, 14 / 8 = 1 остаток: 6"
    })
    void divisionTest(Integer num1, Integer num2, String result) {
        assertEquals(out.divide(num1, num2), result);
    }
}
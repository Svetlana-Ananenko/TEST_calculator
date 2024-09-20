package com.calculatorAndTest.Test.test;
import com.calculatorAndTest.Test.calculator.CalculatorServiceImpl;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;


public class CalculatorServiceImplParameterizedTest {
    private final CalculatorServiceImpl service = new CalculatorServiceImpl();

    @ParameterizedTest
    @CsvSource({"10, 5, '10 + 5 = 15'", "20, 30, '20 + 30 = 50'"})
    void testPlusTextIsAvailable(int num1, int num2, String expectedResult) {
        String actualResult = service.plus(num1, num2);
        assertEquals(expectedResult, actualResult);
    }

    @ParameterizedTest
    //   @CsvSource({"2, 5", "5, 6", "null, 44" })
    @CsvSource({"2, 5", "5, 6"})
    public void testPlusWithNulls(Integer num1, Integer num2) {
        assertNotNull(num1);
        assertNotNull(num2);
        Integer result = num1 + num2;
        assertNotNull(result);
    }

    @ParameterizedTest
    //   @CsvSource({"2, 5", "5, 6", "null, 44" })
    @CsvSource({"2, 5", "5, 6"})
    public void testMinusWithNulls(Integer num1, Integer num2) {
        assertNotNull(num1);
        assertNotNull(num2);
        Integer result = num1 - num2;
        assertNotNull(result);
    }


    @ParameterizedTest
    //   @CsvSource({"2, 5", "5, 6", "null, 44" })
    @CsvSource({"2, 5", "5, 6"})
    public void testMultiplyWithNulls(Integer num1, Integer num2) {
        assertNotNull(num1);
        assertNotNull(num2);
        Integer result = num1 * num2;
        assertNotNull(result);
    }

    @ParameterizedTest
    //   @CsvSource({"2, 5", "5, 6", "null, 44" })
    @CsvSource({"2, 5", "5, 6"})
    public void testPlusWithDivide(Integer num1, Integer num2) {
        assertNotNull(num1);
        assertNotNull(num2);
        Integer result = num1 / num2;
        assertNotNull(result);
    }
}


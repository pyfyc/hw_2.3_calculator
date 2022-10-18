package pro.sky.java.course2.calculator;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static pro.sky.java.course2.calculator.CalcServiceImplTestConstants.*;

class CalcServiceImplParameterizedTest {
    public static Stream<Arguments> provideParamsForTests() {
        return Stream.of(
                Arguments.of(FIVE, ONE),
                Arguments.of(FIVE, TWO),
                Arguments.of(FIVE, THREE),
                Arguments.of(ZERO, FOUR)
        );
    }

    private final CalcService out = new CalcServiceImpl();

    @ParameterizedTest
    @MethodSource("provideParamsForTests")
    public void printSum(int num1, int num2) {
        String result = out.printSum(num1, num2);
        assertEquals(num1 + " + " + num2 + " = " + ((int) num1 + num2), result);
    }

    @ParameterizedTest
    @MethodSource("provideParamsForTests")
    public void printDifference(int num1, int num2) {
        String result = out.printDifference(num1, num2);
        assertEquals(num1 + " - " + num2 + " = " + ((int) num1 - num2), result);
    }

    @ParameterizedTest
    @MethodSource("provideParamsForTests")
    public void printMultiplicationResult(int num1, int num2) {
        String result = out.printMultiplicationResult(num1, num2);
        assertEquals(num1 + " * " + num2 + " = " + ((int) num1 * num2), result);
    }

    @ParameterizedTest
    @MethodSource("provideParamsForTests")
    public void printDivisionResult(int num1, int num2) {
        String result = out.printDivisionResult(num1, num2);
        assertEquals(num1 + " / " + num2 + " = " + ((double) num1 / num2), result);
    }
}
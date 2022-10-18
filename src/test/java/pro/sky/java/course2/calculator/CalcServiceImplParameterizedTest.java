package pro.sky.java.course2.calculator;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static pro.sky.java.course2.calculator.CalcServiceImplTestConstants.*;

class CalcServiceImplParameterizedTest {
    public static Stream<Arguments> provideParamsForPrintSum() {
        return Stream.of(
                Arguments.of(PRINT_SUM_NUM1_1, PRINT_SUM_NUM2_1, PRINT_SUM_RESULT_1),
                Arguments.of(PRINT_SUM_NUM1_2, PRINT_SUM_NUM2_2, PRINT_SUM_RESULT_2)
        );
    }

    public static Stream<Arguments> provideParamsForPrintDiff() {
        return Stream.of(
                Arguments.of(PRINT_DIFF_NUM1_1, PRINT_DIFF_NUM2_1, PRINT_DIFF_RESULT_1),
                Arguments.of(PRINT_DIFF_NUM1_2, PRINT_DIFF_NUM2_2, PRINT_DIFF_RESULT_2)
        );
    }

    public static Stream<Arguments> provideParamsForPrintMulti() {
        return Stream.of(
                Arguments.of(PRINT_MULTI_NUM1_1, PRINT_MULTI_NUM2_1, PRINT_MULTI_RESULT_1),
                Arguments.of(PRINT_MULTI_NUM1_2, PRINT_MULTI_NUM2_2, PRINT_MULTI_RESULT_2)
        );
    }

    public static Stream<Arguments> provideParamsForPrintDiv() {
        return Stream.of(
                Arguments.of(PRINT_DIV_NUM1_1, PRINT_DIV_NUM2_1, PRINT_DIV_RESULT_1),
                Arguments.of(PRINT_DIV_NUM1_2, PRINT_DIV_NUM2_2, PRINT_DIV_RESULT_2)
        );
    }

    private final CalcService out = new CalcServiceImpl();

    @ParameterizedTest
    @MethodSource("provideParamsForPrintSum")
    public void printSum(int num1, int num2, String expectedStr) {
        String result = out.printSum(num1, num2);
        assertEquals(expectedStr, result);
    }

    @ParameterizedTest
    @MethodSource("provideParamsForPrintDiff")
    public void printDiff(int num1, int num2, String expectedStr) {
        String result = out.printDifference(num1, num2);
        assertEquals(expectedStr, result);
    }

    @ParameterizedTest
    @MethodSource("provideParamsForPrintMulti")
    public void printMulti(int num1, int num2, String expectedStr) {
        String result = out.printMultiplicationResult(num1, num2);
        assertEquals(expectedStr, result);
    }

    @ParameterizedTest
    @MethodSource("provideParamsForPrintDiv")
    public void printDiv(int num1, int num2, String expectedStr) {
        String result = out.printDivisionResult(num1, num2);
        assertEquals(expectedStr, result);
    }
}
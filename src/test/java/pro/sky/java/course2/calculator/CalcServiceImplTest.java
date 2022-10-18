package pro.sky.java.course2.calculator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static pro.sky.java.course2.calculator.CalcServiceImplTestConstants.*;

class CalcServiceImplTest {

    private final CalcService out = new CalcServiceImpl();

    @Test
    void printSum() {
        String result = out.printSum(PRINT_SUM_NUM1_1, PRINT_SUM_NUM2_1);
        assertEquals(PRINT_SUM_RESULT_1, result);
        String result2 = out.printSum(PRINT_SUM_NUM1_2, PRINT_SUM_NUM2_2);
        assertEquals(PRINT_SUM_RESULT_2, result2);
    }

    @Test
    void printDifference() {
        String result = out.printDifference(PRINT_DIFF_NUM1_1, PRINT_DIFF_NUM2_1);
        assertEquals(PRINT_DIFF_RESULT_1, result);
        String result2 = out.printDifference(PRINT_DIFF_NUM1_2, PRINT_DIFF_NUM2_2);
        assertEquals(PRINT_DIFF_RESULT_2, result2);
    }

    @Test
    void printMultiplicationResult() {
        String result = out.printMultiplicationResult(PRINT_MULTI_NUM1_1, PRINT_MULTI_NUM2_1);
        assertEquals(PRINT_MULTI_RESULT_1, result);
        String result2 = out.printMultiplicationResult(PRINT_MULTI_NUM1_2, PRINT_MULTI_NUM2_2);
        assertEquals(PRINT_MULTI_RESULT_2, result2);
    }

    @Test
    void printDivisionResult() {
        String result = out.printDivisionResult(PRINT_DIV_NUM1_1, PRINT_DIV_NUM2_1);
        assertEquals(PRINT_DIV_RESULT_1, result);
        String result2 = out.printDivisionResult(PRINT_DIV_NUM1_2, PRINT_DIV_NUM2_2);
        assertEquals(PRINT_DIV_RESULT_2, result2);
    }

    @Test
    void throwExceptionWhenNum2IsZero() {
        assertThrows(IllegalArgumentException.class, () -> out.printDivisionResult(PRINT_DIV_NUM1_3, PRINT_DIV_NUM2_3));
    }
}
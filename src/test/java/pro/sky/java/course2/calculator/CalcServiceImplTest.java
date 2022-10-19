package pro.sky.java.course2.calculator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static pro.sky.java.course2.calculator.CalcServiceImplTestConstants.*;

class CalcServiceImplTest {

    private final CalcService out = new CalcServiceImpl();

    @Test
    void printSum() {
        String result1 = out.printSum(FIVE, FIVE);
        assertEquals(FIVE + " + " + FIVE + " = " + ((int) FIVE + FIVE), result1);
        String result2 = out.printSum(THREE, TWO);
        assertEquals(THREE + " + " + TWO + " = " + ((int) THREE + TWO), result2);
    }

    @Test
    void printDifference() {
        String result = out.printDifference(FIVE, FIVE);
        assertEquals(FIVE + " - " + FIVE + " = " + ((int) FIVE - FIVE), result);
        String result2 = out.printDifference(FIVE, TWO);
        assertEquals(FIVE + " - " + TWO + " = " + ((int) FIVE - TWO), result2);
    }

    @Test
    void printMultiplicationResult() {
        String result = out.printMultiplicationResult(FIVE, THREE);
        assertEquals(FIVE + " * " + THREE + " = " + ((int) FIVE * THREE), result);
        String result2 = out.printMultiplicationResult(FIVE, ZERO);
        assertEquals(FIVE + " * " + ZERO + " = " + ((int) FIVE * ZERO), result2);
    }

    @Test
    void printDivisionResult() {
        String result = out.printDivisionResult(FOUR, TWO);
        assertEquals(FOUR + " / " + TWO + " = " + ((double) FOUR / TWO), result);
        String result2 = out.printDivisionResult(FIVE, TWO);
        assertEquals(FIVE + " / " + TWO + " = " + ((double) FIVE / TWO), result2);
    }

    @Test
    void throwExceptionWhenNum2IsZero() {
        assertThrows(IllegalArgumentException.class, () -> out.printDivisionResult(ONE, ZERO));
    }
}
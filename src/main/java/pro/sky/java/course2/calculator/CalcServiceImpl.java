package pro.sky.java.course2.calculator;

import org.springframework.stereotype.Service;

@Service
public class CalcServiceImpl implements CalcService{
    private final String HELLO_MSG = "Добро пожаловать в калькулятор";
    private final String ERR_MISSING_PARAMS = "Отсутствуют параметеры num1 и/или num2";
    private final String ERR_DIV_BY_ZERO = "Делить на 0 нельзя";

    @Override
    public String hello() {
        return HELLO_MSG;
    }

    @Override
    public String printSum(Integer num1, Integer num2) {
        if (num1 == null || num2 == null) {
            return ERR_MISSING_PARAMS;
        }
        int result = num1 + num2;
        return num1 + " + " + num2 + " = " + result;
    }

    @Override
    public String printDifference(Integer num1, Integer num2) {
        if (num1 == null || num2 == null) {
            return ERR_MISSING_PARAMS;
        }
        int result = num1 - num2;
        return num1 + " - " + num2 + " = " + result;
    }

    @Override
    public String printMultiplicationResult(Integer num1, Integer num2) {
        if (num1 == null || num2 == null) {
            return ERR_MISSING_PARAMS;
        }
        int result = num1 * num2;
        return num1 + " * " + num2 + " = " + result;
    }

    @Override
    public String printDivisionResult(Integer num1, Integer num2) {
        if (num1 == null || num2 == null) {
            return ERR_MISSING_PARAMS;
        }
        if (num2 == 0) {
            return ERR_DIV_BY_ZERO;
        } else {
            // If division result is int - print the result in int format,
            // if it is float - print in float format.
            if (num1 % num2 == 0) {
                return num1 + " / " + num2 + " = " + (num1 / num2);
            } else {
                return num1 + " / " + num2 + " = " + ((double) num1 / num2);
            }
        }
    }
}

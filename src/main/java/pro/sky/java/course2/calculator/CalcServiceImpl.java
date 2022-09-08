package pro.sky.java.course2.calculator;

import org.springframework.stereotype.Service;

@Service
public class CalcServiceImpl implements CalcService{
    @Override
    public String hello() {
        return "Добро пожаловать в калькулятор";
    }

    @Override
    public String printSum(int num1, int num2) {
        int result = num1 + num2;
        return num1 + " + " + num2 + " = " + result;
    }

    @Override
    public String printDifference(int num1, int num2) {
        int result = num1 - num2;
        return num1 + " - " + num2 + " = " + result;
    }

    @Override
    public String printMultiplicationResult(int num1, int num2) {
        int result = num1 * num2;
        return num1 + " * " + num2 + " = " + result;
    }

    @Override
    public String printDivisionResult(int num1, int num2) {
        if (num2 == 0) {
            return "Делить на 0 нельзя";
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

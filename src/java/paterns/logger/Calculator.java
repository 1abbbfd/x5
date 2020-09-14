package paterns.logger;

import paterns.logger.factories.LoggerFactory;
import paterns.logger.loggers.CustomLogger;

import java.util.ArrayList;

import static java.lang.String.format;

public class Calculator {
    final static String MISSING_OPERATOR = "missing operator";
    final static String DIVISION_BY_ZERO = "division by zero";
    final static String INVALID_ARGUMENTS = "invalid number of arguments";
    private final CustomLogger customLogger;
    private Number result;

    public Calculator(CustomLogger logger) {
        customLogger = logger;
    }

    public Number calculate(String input) {
        String operation = null;
        for (char ch : input.toCharArray()) {
            if (ch == '+' || ch == '/' || ch == '-' || ch == '*') {
                operation = String.valueOf(ch);
                break;
            }
        }
        ArrayList<Float> numbers = new ArrayList<>();
        try {
            for (String number : input.split("[" + operation + "]")) {
                numbers.add(Float.valueOf(number.trim()));
            }
            switch (operation) {
                case "+":
                    addition(numbers.get(0), numbers.get(1));
                    break;
                case "-":
                    subtraction(numbers.get(0), numbers.get(1));
                    break;
                case "/":
                    division(numbers.get(0), numbers.get(1));
                    break;
                case "*":
                    multiplication(numbers.get(0), numbers.get(1));
                    break;
            }
        } catch (NumberFormatException | IndexOutOfBoundsException e) {
            customLogger.log(INVALID_ARGUMENTS + ": " + e.toString());
            this.result = null;
        } catch (Exception e) {
            customLogger.log(MISSING_OPERATOR + ": " + e.toString());
            this.result = null;
        }
        return this.result;
    }

    private void multiplication(float op1, float op2) {
        this.result = op1 * op2;
        customLogger.log(format("%.2f * %.2f = %.2f", op1, op2, result));
    }

    private void addition(float op1, float op2) {
        this.result = op1 + op2;
        customLogger.log(format("%.2f + %.2f = %.2f", op1, op2, result));
    }

    private void division(float op1, float op2) throws Exception {
        if (op2 == 0) {
            throw new Exception(format("Ошибка: %s", DIVISION_BY_ZERO));
        }
        this.result = op1 / op2;
        customLogger.log(format("%.2f / %.2f = %.2f", op1, op2, result));
    }

    private void subtraction(float op1, float op2) {
        this.result = op1 - op2;
        customLogger.log(format("%.2f - %.2f = %.2f", op1, op2, result));
    }
}

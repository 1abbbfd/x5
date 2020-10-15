package paterns.logger;

import paterns.logger.loggers.Logger;

import java.util.ArrayList;
import java.util.List;

import static java.lang.String.format;

public class Calculator {
    final static String MISSING_OPERATOR = "missing operator";
    final static String DIVISION_BY_ZERO = "division by zero";
    final static String INVALID_ARGUMENTS = "invalid number of arguments";
    private final Logger logger;
    private Number result;

    public Calculator(Logger logger) {
        this.logger = logger;
    }

    public Number calculate(String input) {
        try {
            String operation = Parser.getOperation(input);
            List<Float> numbers = Parser.getOperators(input);
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
            info(numbers.get(0), numbers.get(1), operation);
        } catch (NumberFormatException | IndexOutOfBoundsException e) {
            logger.log(INVALID_ARGUMENTS + ": " + e.toString());
            this.result = null;
        } catch (Exception e) {
            logger.log(MISSING_OPERATOR + ": " + e.toString());
            this.result = null;
        }
        return this.result;
    }

    private void multiplication(float op1, float op2) {
        this.result = op1 * op2;
    }

    private void addition(float op1, float op2) {
        this.result = op1 + op2;
    }

    private void division(float op1, float op2) throws Exception {
        if (op2 == 0) {
            throw new Exception(format("Ошибка: %s", DIVISION_BY_ZERO));
        }
        this.result = op1 / op2;
    }

    private void subtraction(float op1, float op2) {
        this.result = op1 - op2;
    }

    private void info(float op1, float op2, String operation) {
        logger.log(format("%.2f %s %.2f = %.2f", op1, operation, op2, this.result));
    }
}
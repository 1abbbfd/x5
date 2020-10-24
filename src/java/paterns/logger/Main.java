package paterns.logger;

import paterns.logger.loggers.Logger;

import static paterns.logger.loggers.LoggerType.*;

public class Main {
    public static void main(String[] args) {
        Logger typeOfLogger = new LoggerFactory().createLogger(ConsoleLogger);
        Calculator calculator = new Calculator(typeOfLogger);
        System.out.println(calculator.calculate("2 + "));
        System.out.println(calculator.calculate("1*2"));
        System.out.println(calculator.calculate("1-2"));
        System.out.println(calculator.calculate("1/0"));
        System.out.println(calculator.calculate("10"));
    }
}

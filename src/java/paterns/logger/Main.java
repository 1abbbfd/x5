package paterns.logger;

import paterns.logger.factories.ConsoleLoggerFactory;
import paterns.logger.factories.DbLoggerFactory;
import paterns.logger.factories.FileLoggerFactory;
import paterns.logger.factories.LoggerFactory;
import paterns.logger.loggers.Loggers;

public class Main {
    private final static Loggers typeLoggerEnable = Loggers.ConsoleLogger;

    public static void main(String[] args) {
        LoggerFactory typeOfLogger = null;
        switch (typeLoggerEnable) {
            case ConsoleLogger:
                typeOfLogger = new ConsoleLoggerFactory();
                break;
            case DbLogger:
                typeOfLogger = new DbLoggerFactory();
                break;
            case FileLogger:
                typeOfLogger = new FileLoggerFactory();
                break;
        }
        Calculator calculator = new Calculator(typeOfLogger.createLogger());
        System.out.println(calculator.calculate("2 + "));
        System.out.println(calculator.calculate("1*2"));
        System.out.println(calculator.calculate("1-2"));
        System.out.println(calculator.calculate("1/0"));
        System.out.println(calculator.calculate("10"));
    }
}

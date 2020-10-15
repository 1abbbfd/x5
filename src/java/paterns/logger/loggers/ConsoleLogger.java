package paterns.logger.loggers;

public class ConsoleLogger implements Logger {
    @Override
    public void log(String message) {
        System.out.printf("Log into console: {%s}%n", message);
    }
}

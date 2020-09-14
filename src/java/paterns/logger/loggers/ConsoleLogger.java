package paterns.logger.loggers;

public class ConsoleLogger implements CustomLogger {
    @Override
    public void log(String message) {
        System.out.printf("Log into console: {%s}%n", message);
    }
}

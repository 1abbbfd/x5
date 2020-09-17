package paterns.logger.loggers;

public class FileLogger implements CustomLogger {
    @Override
    public void log(String message) {
        System.out.printf("Log into file: {%s}%n", message);
    }
}

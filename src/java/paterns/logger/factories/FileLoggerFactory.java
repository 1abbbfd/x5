package paterns.logger.factories;

import paterns.logger.loggers.CustomLogger;
import paterns.logger.loggers.FileLogger;

public class FileLoggerFactory extends LoggerFactory {
    @Override
    public CustomLogger createLogger() {
        return new FileLogger();
    }
}

package paterns.logger.factories;

import paterns.logger.loggers.ConsoleLogger;
import paterns.logger.loggers.CustomLogger;

public class ConsoleLoggerFactory extends LoggerFactory {
    @Override
    public CustomLogger createLogger() {
        return new ConsoleLogger();
    }
}

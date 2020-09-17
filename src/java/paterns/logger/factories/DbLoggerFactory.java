package paterns.logger.factories;

import paterns.logger.loggers.CustomLogger;
import paterns.logger.loggers.DbLogger;

public class DbLoggerFactory extends LoggerFactory {
    @Override
    public CustomLogger createLogger() {
        return new DbLogger();
    }
}

package paterns.logger.factories;

import paterns.logger.loggers.CustomLogger;

public abstract class LoggerFactory {
    public abstract CustomLogger createLogger();
}

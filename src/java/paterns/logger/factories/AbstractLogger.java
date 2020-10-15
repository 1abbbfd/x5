package paterns.logger.factories;

import paterns.logger.loggers.Logger;
import paterns.logger.loggers.LoggerType;

public abstract class AbstractLogger {
    public abstract Logger createLogger(LoggerType loggerType);
}

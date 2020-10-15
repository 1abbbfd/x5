package paterns.logger.factories;

import paterns.logger.loggers.*;

public class LoggerFactory extends AbstractLogger {
    @Override
    public Logger createLogger(LoggerType loggerType) {
        switch (loggerType) {
            case DbLogger:
                return new DbLogger();
            case FileLogger:
                return new FileLogger();
            case ConsoleLogger:
                return new ConsoleLogger();
        }
        return null;
    }
}

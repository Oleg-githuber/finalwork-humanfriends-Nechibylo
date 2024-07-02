package logger;

import java.util.logging.Logger;

public class AnimalLogger {
    private Logger logger = Logger.getLogger(AnimalLogger.class.getName());
    public void printLog(String message) {
        logger.info(message);
    }

    public void printWarning(String message) {
        logger.warning(message);
    }

}

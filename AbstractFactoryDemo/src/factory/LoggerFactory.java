package factory;

import account.Account;
import logger.DBLogger;
import logger.FileLogger;
import logger.Logger;
import util.LoggerType;

public class LoggerFactory implements Factory{

	public Logger getLogger(LoggerType loggerType) {
		Logger logger = null;
		switch (loggerType) {
		case FILE:
			logger = new FileLogger();
			break;

		case DB:
			logger = new DBLogger();
			break;

		default:
			logger = new FileLogger();
			break;
			
		}
		return logger;
	}
	
}

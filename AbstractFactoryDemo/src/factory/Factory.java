package factory;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter.DEFAULT;

import account.Account;
import logger.Logger;
import util.AccountType;
import util.LoggerType;

public interface Factory {
	default Account getAccount(AccountType accountType) {
		return null;
		
	}
	default Logger getLogger(LoggerType loggerType) {
		return null;
	}
}

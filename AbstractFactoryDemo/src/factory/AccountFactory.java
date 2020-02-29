package factory;

import account.Account;
import account.CurrentAccount;
import account.SavingAccount;
import logger.Logger;
import util.AccountType;
import util.LoggerType;

public class AccountFactory implements Factory {

	public Account  getAccount(AccountType accountType) {
		Account account = null;
		switch (accountType) {
	
		
		case CURRENTACCOUNT:
			account =  new CurrentAccount();
			break;
			
		case SAVINGACCOUNT:
			account =  new SavingAccount();
			break;

		default:
			account =  new CurrentAccount();
			break;
		}
		return account;
	}
}

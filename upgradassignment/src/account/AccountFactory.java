package account;


public class AccountFactory {
	
	private final String CURRENT_ACCOUNT = "CURRENT";
	private final String SAVING_ACCOUNT = "SAVING";

	public Account getAccount(String accountType) {

		if (CURRENT_ACCOUNT.equals(accountType)) {
			return new CurrentAccount();
		} else if (SAVING_ACCOUNT.equals(accountType)) {
			return new SavingAccount();
		}

		return null;


	}
}

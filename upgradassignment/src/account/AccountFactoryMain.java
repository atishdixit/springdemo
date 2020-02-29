package account;

public class AccountFactoryMain {

	public static void main(String[] args) {
		
		AccountFactory factory = new AccountFactory();
		
		Account currentAccount = factory.getAccount("CURRENT");
		currentAccount.accountType();	

		Account savingAccount = factory.getAccount("SAVING");
		savingAccount.accountType();
	}

}

import account.Account;
import factory.AbstractFactory;
import factory.AccountFactory;
import factory.Factory;
import util.AccountType;
import util.FactoryType;

public class Application {

	public static void main(String[] args) {
		AbstractFactory abstractFactory = new AbstractFactory();
		Factory accountFactor = abstractFactory
				.getFactory(FactoryType.ACCOUNT);
		
		Account curentAccount = accountFactor.
				getAccount(AccountType.CURRENTACCOUNT);
		
		curentAccount.accountType();
				
		
	}

}

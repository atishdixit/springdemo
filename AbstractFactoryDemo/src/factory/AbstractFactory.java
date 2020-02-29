



package factory;

import util.FactoryType;

public class AbstractFactory {

	public Factory getFactory(FactoryType type){
		Factory factory= null;
		switch (type) {
		case ACCOUNT:
			factory = new AccountFactory();
			break;

		case LOGGER:
			factory = new LoggerFactory();
			break;
			
		default:
			factory = new AccountFactory();
			break;
		}
		return factory;
		
	}
	
	
}

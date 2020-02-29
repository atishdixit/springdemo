package browserfactory;

public class BrowserFactory {

	private BrowserFactory() {
		
	}
	
public static synchronized Browser getBrowser(BrowserType browserType){
	Browser browser= null;
	switch(browserType) {
		case CHROME:
		browser = new Chrome();
		break;
		
		case FIRFOX:
		browser = new Firefox();
		break;
		
		case IE:
		browser = new InternetExplorer();
		break;
	
	}
	return browser;
} 
	
	
}

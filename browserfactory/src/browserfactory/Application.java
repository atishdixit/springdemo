package browserfactory;

public class Application {

		public static void main(String as[]) {
			Browser browser = BrowserFactory.
					getBrowser(BrowserType.CHROME);
			
			browser.close();
			browser.forword();
			browser.waitForLoad();
		}
		
}

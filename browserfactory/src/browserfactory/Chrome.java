package browserfactory;

public class Chrome implements Browser {

	@Override
	public void close() {
		System.out.println("Chrome: Browser closed");
	}

	@Override
	public void forword() {
		System.out.println("Chrome:forword closed");
	}

	@Override
	public void waitForLoad() {
		System.out.println("Chrome: Wait for Browser");
	}

}

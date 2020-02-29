package browserfactory;

public class InternetExplorer implements Browser {

	@Override
	public void close() {
		System.out.println("InternetExplorer:Browser closed");
	}

	@Override
	public void forword() {
		System.out.println("InternetExplorer: forword closed");
	}

	@Override
	public void waitForLoad() {
		System.out.println("InternetExplorer:Wait for Browser");
	}
}
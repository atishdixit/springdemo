package browserfactory;

public class Firefox implements Browser {

	@Override
	public void close() {
		System.out.println("Firefox:Browser closed");
	}

	@Override
	public void forword() {
		System.out.println("Firefox:forword closed");
	}

	@Override
	public void waitForLoad() {
		System.out.println("Firefox: Wait for Browser");
	}
}

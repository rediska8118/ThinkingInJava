package ex25.pack1;

public class TestImpl implements Test {

	private void doPrivate() {
		System.out.println("Test doPrivate()");
	}

	protected void doProtected() {
		System.out.println("Test doProtected()");
	}

	void doPackage() {
		System.out.println("Test doPackage()");
	}
	
	public void create() {
		System.out.println("TestImpl create()");
	}
}

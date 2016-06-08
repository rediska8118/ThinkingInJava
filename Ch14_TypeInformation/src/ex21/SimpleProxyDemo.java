package ex21;

interface Interface {
	void doSomething();

	void somethingElse(String arg);
}

class RealObject implements Interface {
	public void doSomething() {
		System.out.println("doSomething");
	}

	public void somethingElse(String arg) {
		System.out.println("somethingElse " + arg);
	}
}

class SimpleProxy implements Interface {
	private Interface proxied;

	public SimpleProxy(Interface proxied) {
		this.proxied = proxied;
	}

	public void doSomething() {
		long start = System.nanoTime();
		proxied.doSomething();
		System.out.println("Method call-return time: "
				+ (System.nanoTime() - start) + " nano secs");
	}

	public void somethingElse(String arg) {
		long start = System.nanoTime();
		proxied.somethingElse(arg);
		System.out.println("Method call-return time: "
				+ (System.nanoTime() - start) + " nano secs");
	}
}

public class SimpleProxyDemo {
	public static void consumer(Interface iface) {
		iface.doSomething();
		iface.somethingElse("bonobo");
	}

	public static void main(String[] args) {
		consumer(new RealObject());
		System.out.println();
		consumer(new SimpleProxy(new RealObject()));
		System.out.println();
		consumer(new SimpleProxy(new RealObject()));
		System.out.println();
		consumer(new SimpleProxy(new RealObject()));
	}
}

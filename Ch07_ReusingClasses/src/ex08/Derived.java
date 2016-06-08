package ex08;

public class Derived extends Base {

	public Derived() {
		super(5);
		System.out.println("Derived default constructor");

	}

	public Derived(int i) {
		super(i);
		System.out.println("Derived non-default constructor");
	}
}

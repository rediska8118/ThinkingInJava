package ex10;

public class Derived extends Base {

	void method2() {
		System.out.println("Derived.method2()");
	}

	public static void main(String[] args) {

		Base base = new Derived();

		base.method1();

	}
}

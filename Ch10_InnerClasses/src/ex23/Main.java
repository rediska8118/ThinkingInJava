package ex23;

public class Main {

	public static void main(String[] args) {
		A a1 = new A();
		A a2 = new A();
		A a3 = new A();

		B b = new B(10);

		b.add(a1.makeU());
		b.add(a2.makeU());
		b.add(a3.makeU());

		b.call();

		b.remove(2);
		System.out.println("=============");
		b.call();
	}
}

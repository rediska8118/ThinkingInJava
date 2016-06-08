package ex15;

public class B {

	A getA() {
		return new A(5) {
		};
	}

	public static void main(String[] args) {
		B b = new B();
		b.getA();
	}
}

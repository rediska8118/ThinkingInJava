package ex01;

public class Outer {

	Outer() {
		System.out.println("Outer constructor");
	}

	class Inner {
		Inner() {
			System.out.println("Inner constructor");
		}
	}

	Inner createInner() {
		return new Inner();
	}

	public static void main(String[] args) {

		Outer outer = new Outer();
		Inner inner = outer.createInner();
	}
}

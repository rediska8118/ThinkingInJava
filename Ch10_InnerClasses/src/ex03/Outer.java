package ex03;

public class Outer {

	private String str;

	Outer(String str) {
		System.out.println("Outer constructor");
		this.str = str;
	}

	class Inner {
		Inner() {
			System.out.println("Inner constructor");
		}

		public String toString() {
			return str;
		}
	}

	Inner createInner() {
		return new Inner();
	}

	public static void main(String[] args) {

		Outer outer = new Outer("asdsa");
		Inner inner = outer.createInner();
		System.out.println(inner);
	}
}

package ex08;

public class Outer {

	class Inner {
		private String str = "Inner";
	}

	public static void main(String[] args) {
		Outer outer = new Outer();
		Inner inner = outer.new Inner();
		System.out.println(inner.str);
	}
}

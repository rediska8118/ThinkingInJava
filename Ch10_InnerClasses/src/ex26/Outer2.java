package ex26;

public class Outer2 {

	public class Inner2 extends Outer.Inner {
		public Inner2(Outer outer) {
			outer.super(2);
			System.out.println("Inner2 constructor");
		}
	}

	public static void main(String[] args) {
		Outer outer = new Outer();
		Outer2 outer2 = new Outer2();

		Inner2 inner2 = outer2.new Inner2(outer);
	}
}

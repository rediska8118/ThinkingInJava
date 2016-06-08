package ex19;

public class Outer {

	public Outer() {
		System.out.println("Outer constructor");
	}

	public class Inner1 {

		public Inner1() {
			System.out.println("Inner1 constructor");
		}

		public class Inner2 {
			public Inner2() {
				System.out.println("Inner2 constructor");
			}
		}
	}
}

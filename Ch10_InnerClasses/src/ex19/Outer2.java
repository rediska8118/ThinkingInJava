package ex19;

public class Outer2 {

	public Outer2() {
		System.out.println("Outer2 constructor");
	}

	public static class Inner1 {

		public Inner1() {
			System.out.println("Inner1 constructor");
		}

		public static class Inner2 {
			public Inner2() {
				System.out.println("Inner2 constructor");
			}
		}
	}
}

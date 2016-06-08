package ex18;

public class Outer {

	public Outer() {
		System.out.println("Outer constructor");
	}

	public static class Inner {
		public Inner() {
			System.out.println("Inner constructor");
		}
	}
	
	public static void main(String[] args) {
		Inner inner = new Inner();
	}
}

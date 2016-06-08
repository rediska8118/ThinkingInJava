package ex23;

public class Derived extends Base {

	private static int i;
	private final int counter = i++;

	static {
		i = 5;
		System.out.println("Derived static " + i);
	}

	Derived() {

		System.out.println("Derived counter = " + counter);
	}

	public static void main(String[] args) {
		System.out.println(new Derived());
		System.out.println(new Derived());
	}
}

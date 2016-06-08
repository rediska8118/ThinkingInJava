package ex23;

public class Base {

	private static int i;
	private final int counter = i++;

	static {
		i = 5;
		System.out.println("Base static " + i);
	}

	Base() {

		System.out.println("Base counter = " + counter);
	}
}

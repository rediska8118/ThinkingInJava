package ex20;

public class Main {

	public static void main(String... args) {
		if (args == null)
			System.out.println("Add args");

		for (String str : args) {
			System.out.println(str);
		}
	}
}

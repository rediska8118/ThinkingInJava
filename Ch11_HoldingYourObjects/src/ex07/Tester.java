package ex07;

public class Tester {

	private static int counter = 0;
	private int id = counter++;

	public String toString() {
		return String.valueOf(id);
	}
}

package ex11;

public class Hamster {
	private static int counter = 0;
	private static int id = counter++;

	@Override
	public String toString() {
		return "Hamster " + id;
	}
}

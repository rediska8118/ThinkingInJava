package ex11;

public class Mouse {
	private static int counter = 0;
	private static int id = counter++;

	@Override
	public String toString() {
		return "Mouse " + id;
	}
}

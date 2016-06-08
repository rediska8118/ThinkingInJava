package ex19;

public class Data {

	private static int i = 1;
	private final int counter = i++;

	public String toString() {
		return String.valueOf(counter);
	}

}

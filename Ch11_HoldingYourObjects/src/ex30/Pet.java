package ex30;

public class Pet {

	private static int count = 0;
	private int id = count++;

	int id() {
		return id;
	}
}

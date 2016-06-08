package ex27;

public class Main {

	public static void main(String[] args) {
		Object[] objects = new Object[1];
		try {
			objects[3] = new Object();
		} catch (ArrayIndexOutOfBoundsException e) {
			throw new RuntimeException(e);
		}
	}
}

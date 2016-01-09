package ex02;

public class Main {

	public static void main(String[] args) {
		Object object = null;

		try {
			object.getClass();
		} catch (Exception e) {
			e.printStackTrace();

		}
	}
}

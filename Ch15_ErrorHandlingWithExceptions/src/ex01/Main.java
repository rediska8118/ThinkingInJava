package ex01;

public class Main {

	public static void main(String[] args) {
		try {
			throw new Exception("My exception message");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			System.out.println("This is the end!");
		}
	}
}

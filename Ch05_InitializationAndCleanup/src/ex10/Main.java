package ex10;

public class Main {

	protected void finalize() {
		System.out.println("finalize!");
	}

	public static void main(String[] args) {
		new Main();

		System.gc();

	}
}

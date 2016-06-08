package ex11;

public class Main {

	protected void finalize() {
		System.out.println("finalize!");
	}

	public static void main(String[] args) {
		new Main();

		//deprecated
		System.runFinalizersOnExit(true);

	}
}
